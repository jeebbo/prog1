package dbms_risiko;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Types;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Database{
    static public String host = "143.225.117.238";
    static public String servizio = "xe";
    static public int porta = 1521;   
    static public String user = "";
    static public String password = "";
   
    static private OracleDataSource ods;
    static private Connection conn;
    static public PreparedStatement stmt = null;
    static public ResultSet rset = null;
    static public CallableStatement cstmt = null;
    
    static public Connection nuovaConnessione() throws SQLException {
      ods = new OracleDataSource();
      ods.setDriverType("thin");
      ods.setServerName(host);
      ods.setPortNumber(porta);
      ods.setUser(user);
      ods.setPassword(password);
      ods.setDatabaseName(servizio);
      return ods.getConnection();
   }
    
    static public Connection getConnection() throws SQLException{
        if (conn == null || conn.isClosed())
            conn = nuovaConnessione();
        return conn;
   } 
    
    static public void setConnection(Connection c) {
        conn = c;
    }
    
    static public void mostraErroriSwing(java.awt.Component thrower, SQLException e){
        String msg;
        msg = e.getMessage() + "\n";
        msg += "SQLState = " + e.getSQLState() + "\n";

        JOptionPane.showMessageDialog(thrower, msg, "Errore " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
   }
    
    static public void queryOnTable( String Q ){    
        try{
            stmt = conn.prepareStatement( Q, ResultSet.TYPE_SCROLL_INSENSITIVE,
                                          ResultSet.CONCUR_READ_ONLY );
            rset = stmt.executeQuery();
        }
        catch(SQLException e){ printErr( e ); }
    }
    
    static public void InsertOnTable( String[] values , int n )throws SQLException{
        String exe = String.format( "INSERT INTO %s" , values[0] );
        stmt = conn.prepareStatement( exe );
        for(int j=1 ; j<=n ; j++)
            stmt.setString( j , values[j] );
        stmt.executeUpdate();
    }
    
    static public void UpdateTable( String[] values , int n )throws SQLException{
        String exe = String.format( "UPDATE %s" , values[0] );
        stmt = conn.prepareStatement( exe );
        for(int j=1 ; j<=n ; j++)
            stmt.setString( j , values[j] );
        stmt.executeUpdate();
    }
    
    static public void DeletefromTable( String[] values , int n )throws SQLException{
        String exe = String.format( "DELETE %s" , values[0] );
        stmt = conn.prepareStatement( exe );
        for(int j=1 ; j<=n ; j++)
            stmt.setString( j , values[j] );
        System.out.println(values[1]);
        stmt.executeUpdate();
        
    }
    
    static public String exeFunction( String []values , int types , int n )throws SQLException{
        String exe = String.format( "BEGIN ? := %s; END;" , values[0] );
        cstmt = conn.prepareCall( exe );
        cstmt.registerOutParameter( 1 , types );
        for( int j=1 ; j<=n ; j++ )
        cstmt.setString( j+1 , values[j] );
        cstmt.executeUpdate();
        return cstmt.getString(1);
    }

    
    static public String nextVal( String count )throws SQLException{
        queryOnTable("SELECT " + count + ".NEXTVAL AS TOT FROM DUAL");
        rset.first();
        return rset.getString(1);
    }
    
    static public void printErr( SQLException e ){
        System.err.println("error: sqlexception " + e.getMessage());
    }
}