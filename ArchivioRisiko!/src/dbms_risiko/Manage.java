package dbms_risiko;

import java.sql.SQLException;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Manage {
    static public String col [];
    static public Object [][] fill;
    
    static public String[] createwhereComboBox( int numofcombo, String T1, String T2, String T3 ) throws SQLException{
        String select;
        if(numofcombo == 1) {
                select = ("select column_name from user_tab_columns where table_name = '"
                + T1+"'");
        }
        else if (numofcombo == 2) {
                select = ("select column_name from user_tab_columns where table_name = '"
                + T1+"' OR table_name = '"+ T2+ 
                "'");
        }
        else {
                select = ("select column_name from user_tab_columns where table_name = '"
                + T1+"' OR table_name = '"+ T2+ 
                "' OR table_name = '" + T3 +"'");
        }
        
        Game.createMatrix( select );
        
        return Game.getValues(1);
    }
    static public String[] createComboBox( String T ) throws SQLException{
        String select = "SELECT C1.TABLE_NAME FROM USER_CONSTRAINTS C1 JOIN "
            + "USER_CONSTRAINTS C2 ON (C1.CONSTRAINT_NAME=C2.R_CONSTRAINT_NAME "
            + "OR C1.R_CONSTRAINT_NAME = C2.CONSTRAINT_NAME)\n" +
            "%s \n GROUP BY C1.TABLE_NAME";
        
        String where = "";
        if( T != null )
            where = "where C1.TABLE_NAME = '" + T
                    + "' OR C2.TABLE_NAME = '" + T + "' ";
        Game.createMatrix( String.format( select , where ) );
        return Game.getValues(1);
    }
    static public void buildTable (String Query){
        
        int j=0;
        Database.queryOnTable(Query);
    
        int count = 0;
        
        try{
            count = Database.rset.getMetaData().getColumnCount();
            
            Database.rset.last();
            j=Database.rset.getRow();
            Database.rset.beforeFirst();
        }
        catch(SQLException e){}
        try{
            int i=1;
            col = new String [count];
            fill = new Object [j][count];
            while(i<=count){
                col[i-1] = Database.rset.getMetaData().getColumnName(i);
                i++;          
            }
            j=0;
            while(Database.rset.next()){
                i=1;
                                   
                while(i <=count){
                    fill[j][i-1] = Database.rset.getObject(i);
                    i++;
                }
                j++;
            }
        }
        catch(SQLException e){System.out.println(e.getMessage());}
    }
    static public String datecheck (javax.swing.JComboBox Where, javax.swing.JComboBox Op, String Val){
        String Query="";
        String date []={"",""};
        date[0]=Val;
        
        if(Where.getSelectedItem().toString().equals("GDATE")&& !Val.equals("?")) {
            date[0] = date[0].substring(0, 10);
            if(Op.getSelectedItem().equals("=")) {
                date= change(date);
                
                Query = Query +  
                Where.getSelectedItem() + " "+ 
                 " BETWEEN '"+ date[0]+"' AND '"+date[1]+"' ";
            }
            else {
                Query = Query +  
                Where.getSelectedItem() + " "+ Op.getSelectedItem()+
                 " to_date('"+ date[0]+"', 'YYYY-MM-DD')";
            }
        }
        else if(Val.equals("?")) Query = Query + 
                    (String)Where.getSelectedItem() + " "+ 
                    Op.getSelectedItem() +" "+ Val+" ";
        else Query = Query + 
                    (String)Where.getSelectedItem() + " "+ 
                    Op.getSelectedItem() +" '"+ Val+"' ";
        return Query;
    }
    static private String [] change (String date []){
        
        String year, month, day;
        year=date[0].substring(0, 4);
        month=date[0].substring(5, 7);
        month=getMonth(month);
        day=date[0].substring(8,10);
        
        date[0]=day+"/"+month+"/"+year;
        day=nextday(day);
        date[1]=day+"/"+month+"/"+year;
        return date;
    }
    static private String nextday(String day){
        String tmp;int a=0;
        for(int i=1; i<32; i++){
            tmp=String.valueOf(i);
            a=0;
            if(i<10) {tmp="0"+String.valueOf(i);a=1;}
            if(day.equals(tmp)) {
                if(a==0||i==9) day=String.valueOf(i+1);
                else day="0"+String.valueOf(i+1);
                i=32;
            }
            
        }
        
        return day;
    }
    static private String getMonth (String month){
        switch(month){
            case "01": month="GEN";break;
            case "02": month="FEB";break;
            case "03": month="MAR";break;
            case "04": month="APR";break;
            case "05": month="MAG";break;
            case "06": month="GIU";break;
            case "07": month="LUG";break;
            case "08": month="AGO";break;
            case "09": month="SET";break;
            case "10": month="OTT";break;
            case "11": month="NOV";break;
            case "12": month="DIC";break;
            
        }
        return month;
    }
    static public String[] createvaluesComboBox (String col) {
        
        
        
        String tab = "";
        String Query = "select a.table_name from all_tab_columns a join user_tables b on a.table_name=b.table_name where a.column_name='"+col+"'";
        Database.queryOnTable(Query);

        try{
            Database.rset.first();
            tab = Database.rset.getString(1);

        }catch(SQLException e){System.out.println(e.getMessage());} 
            
        String select;
        select = ("SELECT "+col+" FROM "+ tab+" GROUP BY "+ col);
        try{Game.createMatrix( select );}
        catch(SQLException e){}
        return Game.getValues(1);
        
    }
    
    static public void setvaluesbox(javax.swing.JComboBox where, javax.swing.JComboBox gets, String val []){
        val = createvaluesComboBox (where.getSelectedItem().toString());
        gets.removeAllItems();
        for( int i=0 ; i<Game.nElem ; i++ )
        {
            if(where.getSelectedItem().equals("GDATE")) gets.addItem(val[i].substring(0, 10));
            else gets.addItem(val[i]);
        }
    }
}


