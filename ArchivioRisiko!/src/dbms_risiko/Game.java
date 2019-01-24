package dbms_risiko;

import java.sql.*;
import java.sql.SQLException;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Game extends javax.swing.JFrame {
    private String []array;
    static public String[][] matrix;
    static public String[] colName;
    static public int nElem;
    static public int nClmn;
    
    static public Editor e;
    static private boolean match_t;
    
    public Game(){
        try{
            createMatrix("SELECT * FROM GAME");
            array = getValues();
        }
        catch(SQLException e){ Database.printErr( e ); }
        initComponents();
    }

    static public void createMatrix( String query ) throws SQLException{
        Database.queryOnTable( query );
        ResultSet rs = Database.rset;
        int j = 0;
        nClmn = rs.getMetaData().getColumnCount();
        rs.last();
        nElem = rs.getRow();
        matrix = new String[nElem][nClmn];
        colName = new String[nClmn];
        for( int i=1 ; i<=nClmn ; i++ )
                colName[i-1] = rs.getMetaData().getColumnName(i);
        rs.beforeFirst();
        while( rs.next() ){
            for( int i=1 ; i<=nClmn ; i++ )
                matrix[j][i-1] = rs.getString(i);
            j++;
        }
        Database.stmt.close(); 
    }

    static public String []getValues(){
        String []tuples = new String[nElem];
        int i, j;
        for( i=0 ; i<nElem ; i++ ){
            tuples[i] = matrix[i][0];
            for( j=1 ; j<nClmn ; j++ )
                tuples[i] = tuples[i] + " ; " + matrix[i][j];
        }
        return tuples;
    }
    
    static public String []getValues( int col ){
        col--;
        String []tuples = new String[nElem];
        int i;
        for( i=0 ; i<nElem ; i++ ){
            tuples[i] = matrix[i][col];
        }
        return tuples;
    }
        
    static public String extractCod( String A ){
        int i;
        for( i=0 ; A.charAt(i) != ' ' ; i++ );
        return A.substring(0 , i);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameList = new javax.swing.JList<>();
        Manual = new javax.swing.JButton();
        Simulate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Start = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        gameList.setModel(new javax.swing.AbstractListModel<String>(){
            public int getSize() { return array.length; }
            public String getElementAt(int i) { return array[i]; }
        });
        gameList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gameList.setEnabled(false);
        gameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gameList);

        Manual.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Manual.setText("Partita Manuale");
        Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualActionPerformed(evt);
            }
        });

        Simulate.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Simulate.setText("Partita Simulata");
        Simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setText("Continua Partita Esistente");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel2.setText("codice ; data ; n° giocatori ; vincitore");

        Start.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Start.setText("Inizia");
        Start.setEnabled(false);
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Manual)
                                .addGap(12, 12, 12)
                                .addComponent(Simulate)
                                .addGap(12, 12, 12)
                                .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Manual)
                    .addComponent(Simulate)
                    .addComponent(Start))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        this.setVisible(false);
        Init I = new Init( match_t );
        I.setVisible(true);
    }//GEN-LAST:event_StartActionPerformed

    private void SimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulateActionPerformed
        Simulate.setEnabled(false);
        Manual.setEnabled(false);
        match_t = true;
        Start.setEnabled(true);
        gameList.setEnabled(true);
    }//GEN-LAST:event_SimulateActionPerformed

    private void ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualActionPerformed
        Simulate.setEnabled(false);
        Manual.setEnabled(false);
        match_t = false;
        Start.setEnabled(true);
        gameList.setEnabled(true);
    }//GEN-LAST:event_ManualActionPerformed

    private void gameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameListMouseClicked
        String Q = "SELECT CODTR FROM TURN WHERE OFGAME = "
                + extractCod( gameList.getSelectedValue() ) + " AND NTURN = "
                + "(SELECT MAX(NTURN) FROM TURN WHERE OFGAME = " + 
                extractCod( gameList.getSelectedValue() ) + ")";        
        Database.queryOnTable( Q );
        try{
            Database.rset.first();
            e = new Editor( match_t , Database.rset.getString(1) );
        }
        catch(SQLException e){ Database.printErr(e); }
    }//GEN-LAST:event_gameListMouseClicked
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Manual;
    private javax.swing.JButton Simulate;
    private javax.swing.JButton Start;
    private javax.swing.JList<String> gameList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}