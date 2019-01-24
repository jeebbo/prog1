package dbms_risiko;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Home extends javax.swing.JFrame {
       static private javax.swing.JButton J;
    public Home() {
        initComponents();
        J = Nuovo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nuovo = new javax.swing.JButton();
        Consulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nuovo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Nuovo.setText("Inizia o Continua");
        Nuovo.setActionCommand("Inizia o Continua Partita");
        Nuovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuovoActionPerformed(evt);
            }
        });

        Consulta.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Consulta.setText("Consulta storico");
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Nuovo)
                .addGap(18, 18, 18)
                .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuovo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaActionPerformed
        Consulta s;
        s = new Consulta();
        s.setVisible(true);
    }//GEN-LAST:event_ConsultaActionPerformed

    private void NuovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuovoActionPerformed
      Game g;
      g = new Game();
      g.setVisible(true);
      Nuovo.setEnabled(false);
    }//GEN-LAST:event_NuovoActionPerformed
    
     public static void setHome(){
        J.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consulta;
    private javax.swing.JButton Nuovo;
    // End of variables declaration//GEN-END:variables
}
