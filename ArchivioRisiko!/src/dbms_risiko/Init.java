package dbms_risiko;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Init extends javax.swing.JFrame {
    private String[] /*S ,*/ S2;
    private int count = 0;
    private int n;
    private DefaultListModel Listsx = new DefaultListModel();
    private DefaultListModel Listdx = new DefaultListModel();
    
    private boolean type;
    
    public Init( boolean match_t ){
        type = match_t;
        try{ Game.createMatrix("SELECT USERNAME FROM PLAYER"); }
        catch(SQLException e){ Database.printErr( e ); }
        n = Game.nElem;
        S2 = new String[n];
        for( int i=0 ; i<n ; i++ )
            Listsx.addElement(Game.matrix[i][0]);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usersList2 = new javax.swing.JList<>();
        NuovoUtente = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        insUser = new javax.swing.JFormattedTextField();
        dx = new javax.swing.JButton();
        sx = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selezione utente");

        usersList2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usersList2.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return S2.length; }
            public String getElementAt(int i) { return S2[i]; }
        });
        jScrollPane1.setViewportView(usersList2);

        NuovoUtente.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        NuovoUtente.setText("Nuovo Utente");
        NuovoUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuovoUtenteActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        NextButton.setText("Next");
        NextButton.setEnabled(false);
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextButtonMousePressed(evt);
            }
        });

        insUser.setEnabled(false);
        insUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insUserKeyReleased(evt);
            }
        });

        dx.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        dx.setText(">>");
        dx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dxActionPerformed(evt);
            }
        });

        sx.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        sx.setText("<<");
        sx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxActionPerformed(evt);
            }
        });

        usersList1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usersList1.setModel(/*new javax.swing.AbstractListModel<String>() {
            public int getSize() { return S.length; }
            public String getElementAt(int i) { return S[i]; }
        }*/ Listsx);
        jScrollPane2.setViewportView(usersList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NextButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(NuovoUtente)
                            .addGap(18, 18, 18)
                            .addComponent(insUser, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuovoUtente))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(dx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sx)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextButton)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMousePressed
        String []out = new String[Listdx.getSize()];
        for( int i=0 ; i<Listdx.getSize() ; i++ )
            out[i] = (String)Listdx.get(i);
        this.setVisible(false);
        InitEditor IE = new InitEditor( type , out , Listdx.getSize() );
    }//GEN-LAST:event_NextButtonMousePressed

    private void sxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxActionPerformed
        Listdx.removeElementAt(usersList2.getSelectedIndex());
        usersList2.setModel(Listdx);
        count--;
        if( count == 2 )
            NextButton.setEnabled(false);
        if( count == 6 )
            NextButton.setEnabled(true);
    }//GEN-LAST:event_sxActionPerformed

    private void dxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dxActionPerformed
        String tmp = usersList1.getSelectedValue();
        if( tmp != null ){
            if( !Listdx.contains(tmp) ){
                Listdx.addElement( tmp );
                usersList2.setModel(Listdx);
                count++;
            }
            if( count == 3 )
                NextButton.setEnabled(true);
            if( count == 7 )
                NextButton.setEnabled(false);
        }
    }//GEN-LAST:event_dxActionPerformed

    private void NuovoUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuovoUtenteActionPerformed
        insUser.setEnabled(true);
    }//GEN-LAST:event_NuovoUtenteActionPerformed

    private void insUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insUserKeyReleased
        if( evt.getKeyCode() == KeyEvent.VK_ENTER ){
            String[] values = new String[5];
            values[0] = "PLAYER VALUES( ? , ? , ? )";
            values[1] = insUser.getText();
            values[2] = "0"; values[3] = "0";
            try{ Database.InsertOnTable( values , 3 ); }
            catch( SQLException e ){ Database.printErr( e ); }
            Listsx.addElement( values[1] );
            usersList1.setModel(Listsx);
        }
    }//GEN-LAST:event_insUserKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextButton;
    private javax.swing.JButton NuovoUtente;
    private javax.swing.JButton dx;
    private javax.swing.JFormattedTextField insUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sx;
    private javax.swing.JList<String> usersList1;
    private javax.swing.JList<String> usersList2;
    // End of variables declaration//GEN-END:variables
}
