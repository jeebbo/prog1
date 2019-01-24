package dbms_risiko;
import java.sql.SQLException;


/** @authors Cuomo Daniele , Iervolino Riccardo */

public class ModificaDB extends javax.swing.JFrame {
    String val [];
    static public String []tables;
    private String columns [];
    public int n;
    public ModificaDB() {
        try{
            tables = Manage.createComboBox ( null );
            
        }
        catch(SQLException e){}
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        Operand1 = new javax.swing.JComboBox<>();
        Operand3 = new javax.swing.JComboBox<>();
        Operand2 = new javax.swing.JComboBox<>();
        Operand4 = new javax.swing.JComboBox<>();
        Values1 = new javax.swing.JComboBox<>();
        Values2 = new javax.swing.JComboBox<>();
        Values3 = new javax.swing.JComboBox<>();
        Values4 = new javax.swing.JComboBox<>();
        Boolbox1 = new javax.swing.JComboBox<>();
        Boolbox2 = new javax.swing.JComboBox<>();
        Boolbox3 = new javax.swing.JComboBox<>();
        Wherecombo2 = new javax.swing.JComboBox<>();
        Wherecombo4 = new javax.swing.JComboBox<>();
        Wherecombo3 = new javax.swing.JComboBox<>();
        Wherebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Tablecombo1 = new javax.swing.JComboBox<>();
        Wherecombo1 = new javax.swing.JComboBox<>();
        CommitButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Set = new javax.swing.JButton();
        Wherecombo5 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            Manage.col
        ));
        jScrollPane3.setViewportView(Table);

        cancel.setFont(new java.awt.Font("Monospaced", 0, 12));
        cancel.setText("Annulla");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        Operand1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand1.setEnabled(false);

        Operand3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand3.setEnabled(false);

        Operand2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand2.setEnabled(false);

        Operand4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand4.setEnabled(false);

        Values1.setModel(new javax.swing.DefaultComboBoxModel<>());
        Values1.setEnabled(false);
        Values1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Values1ActionPerformed(evt);
            }
        });

        Values2.setModel(new javax.swing.DefaultComboBoxModel<>());
        Values2.setEnabled(false);
        Values2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Values2ActionPerformed(evt);
            }
        });

        Values3.setModel(new javax.swing.DefaultComboBoxModel<>());
        Values3.setEnabled(false);
        Values3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Values3ActionPerformed(evt);
            }
        });

        Values4.setModel(new javax.swing.DefaultComboBoxModel<>());
        Values4.setEnabled(false);
        Values4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Values4ActionPerformed(evt);
            }
        });

        Boolbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " - ", "AND", "OR" }));
        Boolbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boolbox1ActionPerformed(evt);
            }
        });
        Boolbox1.setEnabled(false);

        Boolbox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " - ", "AND", "OR" }));
        Boolbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boolbox2ActionPerformed(evt);
            }
        });
        Boolbox2.setEnabled(false);

        Boolbox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" - ",  "AND", "OR" }));
        Boolbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boolbox3ActionPerformed(evt);
            }
        });
        Boolbox3.setEnabled(false);

        Wherecombo2.setModel(new javax.swing.DefaultComboBoxModel<>());
        Wherecombo2.setEnabled(false);
        Wherecombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wherecombo2ActionPerformed(evt);
            }
        });

        Wherecombo4.setModel(new javax.swing.DefaultComboBoxModel<>());
        Wherecombo4.setEnabled(false);
        Wherecombo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wherecombo4ActionPerformed(evt);
            }
        });

        Wherecombo3.setModel(new javax.swing.DefaultComboBoxModel<>());
        Wherecombo3.setEnabled(false);
        Wherecombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wherecombo3ActionPerformed(evt);
            }
        });

        Wherebutton.setFont(new java.awt.Font("Monospaced", 0, 12));
        Wherebutton.setText("Where");
        Wherebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WherebuttonActionPerformed(evt);
            }
        });
        Wherebutton.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setText("On table");

        Tablecombo1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Tablecombo1.setModel(new javax.swing.DefaultComboBoxModel<>(tables));
        Tablecombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tablecombo1ActionPerformed(evt);
            }
        });

        Wherecombo1.setModel(new javax.swing.DefaultComboBoxModel<>());
        Wherecombo1.setEnabled(false);
        Wherecombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wherecombo1ActionPerformed(evt);
            }
        });

        CommitButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        CommitButton.setText("Print");
        CommitButton.setEnabled(false);
        CommitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommitButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.setEnabled(false);
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Set.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Set.setText("Set");
        Set.setEnabled(false);
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });

        Wherecombo5.setModel(new javax.swing.DefaultComboBoxModel<>());
        Wherecombo5.setEnabled(false);
        Wherecombo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wherecombo5ActionPerformed(evt);
            }
        });

        jLabel2.setText("=");

        jTextField1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Boolbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Wherecombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Wherebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)
                                        .addComponent(Wherecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Operand3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Values3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Operand1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Values1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tablecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Set)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boolbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Wherecombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Boolbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Wherecombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Operand4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Operand2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Values4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Values2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Wherecombo5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete)
                .addGap(52, 52, 52)
                .addComponent(CommitButton)
                .addGap(51, 51, 51)
                .addComponent(UpdateButton)
                .addGap(137, 137, 137)
                .addComponent(cancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tablecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Set)
                    .addComponent(Wherecombo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Operand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Boolbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Wherecombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Operand4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Wherecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Wherebutton)
                                    .addComponent(Operand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boolbox1)
                                    .addComponent(Wherecombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Values1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Boolbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Wherecombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Operand3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Values3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(CommitButton)
                            .addComponent(UpdateButton)
                            .addComponent(Delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Values2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Values4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setButton(){
        if(!Wherecombo5.isEnabled()){
            Delete.setEnabled(true);
            UpdateButton.setEnabled(false);
        }
        else  {
            UpdateButton.setEnabled(true);
            Delete.setEnabled(false);
        }
    }
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_cancelMouseClicked

    private void Values1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values1ActionPerformed
        CommitButton.setEnabled(true);
        setButton();
    }//GEN-LAST:event_Values1ActionPerformed

    private void Values2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values2ActionPerformed
        CommitButton.setEnabled(true);
        setButton();

    }//GEN-LAST:event_Values2ActionPerformed

    private void Values3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values3ActionPerformed
        CommitButton.setEnabled(true);
        setButton();
    }//GEN-LAST:event_Values3ActionPerformed

    private void Values4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values4ActionPerformed
        CommitButton.setEnabled(true);
        setButton();
    }//GEN-LAST:event_Values4ActionPerformed

    private void Boolbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boolbox1ActionPerformed
        if(Boolbox1.getSelectedIndex()!=0) {
            Wherecombo2.setEnabled(true);
            CommitButton.setEnabled(false);
            Delete.setEnabled(false);
        }
        else {
            Wherecombo2.setEnabled(false);
            Boolbox2.setEnabled(false);
            Values2.setEnabled(false);
            Operand4.setEnabled(false);
            Operand3.setEnabled(false);
            Operand2.setEnabled(false);
            Wherecombo3.setEnabled(false);
            Boolbox3.setEnabled(false);
            Values3.setEnabled(false);
            Wherecombo4.setEnabled(false);
            Values4.setEnabled(false);
            CommitButton.setEnabled(true);
            setButton();

        }
    }//GEN-LAST:event_Boolbox1ActionPerformed

    private void Boolbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boolbox2ActionPerformed
        if(Boolbox2.getSelectedIndex()!=0) {
            Wherecombo3.setEnabled(true);
            CommitButton.setEnabled(false);
            Delete.setEnabled(false);

        }
        else{
            Wherecombo3.setEnabled(false);
            Boolbox3.setEnabled(false);
            Operand4.setEnabled(false);
            Operand3.setEnabled(false);
            Values3.setEnabled(false);
            Wherecombo4.setEnabled(false);
            Values4.setEnabled(false);
            CommitButton.setEnabled(true);
            setButton();
        }
    }//GEN-LAST:event_Boolbox2ActionPerformed

    private void Boolbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boolbox3ActionPerformed
        if(Boolbox3.getSelectedIndex()!=0){
            Wherecombo4.setEnabled(true);
            CommitButton.setEnabled(false);
            Delete.setEnabled(false);

        }
        else{
            Wherecombo4.setEnabled(false);
            Operand4.setEnabled(false);
            Values4.setEnabled(false);
            CommitButton.setEnabled(true);
            setButton();

        }
    }//GEN-LAST:event_Boolbox3ActionPerformed

    private void Wherecombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo2ActionPerformed
        if(Wherecombo2.isPopupVisible()){
            Operand2.setEnabled(true);
            Values2.setEnabled(true);
            Manage.setvaluesbox(Wherecombo2, Values2, val);
            Boolbox2.setEnabled(true);

        }
    }//GEN-LAST:event_Wherecombo2ActionPerformed

    private void Wherecombo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo4ActionPerformed
        if(Wherecombo4.isPopupVisible()) {
            Operand4.setEnabled(true);
            Values4.setEnabled(true);
            Manage.setvaluesbox(Wherecombo1, Values4, val);

        }
    }//GEN-LAST:event_Wherecombo4ActionPerformed

    private void Wherecombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo3ActionPerformed
        if(Wherecombo3.isPopupVisible()){
            Operand3.setEnabled(true);
            Values3.setEnabled(true);
            Manage.setvaluesbox(Wherecombo3, Values3, val);
            Boolbox3.setEnabled(true);

        }
    }//GEN-LAST:event_Wherecombo3ActionPerformed

    private void WherebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WherebuttonActionPerformed
        if(!Wherecombo1.isEnabled())
        {
            Operand1.setEnabled(true);
            Wherecombo1.setEnabled(true);
            CommitButton.setEnabled(false);
            UpdateButton.setEnabled(false);
            Delete.setEnabled(false);
        }
        else {
            Wherecombo1.setEnabled(false);
            CommitButton.setEnabled(true);
            
            setButton();
            Boolbox1.setEnabled(false);
            Values1.setEnabled(false);
            Wherecombo2.setEnabled(false);
            Boolbox2.setEnabled(false);
            Values2.setEnabled(false);
            Wherecombo3.setEnabled(false);
            Boolbox3.setEnabled(false);
            Values3.setEnabled(false);
            Wherecombo4.setEnabled(false);
            Values4.setEnabled(false);
            Operand4.setEnabled(false);
            Operand3.setEnabled(false);
            Operand2.setEnabled(false);
            Operand1.setEnabled(false);
        }
    }//GEN-LAST:event_WherebuttonActionPerformed

    private void Tablecombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tablecombo1ActionPerformed
        int i=0;
        Wherebutton.setEnabled(true);
        Set.setEnabled(true);
        
        setwherebox();
        
        CommitButton.setEnabled(true);
        setButton();
        

        
    }//GEN-LAST:event_Tablecombo1ActionPerformed
    private void setwherebox ( ){
        
        try{ 
            columns = Manage.createwhereComboBox(1, 
                (String)Tablecombo1.getSelectedItem(), null, null);
        }
        catch(SQLException e){ System.out.println("sqlexception\n"); }
        Wherecombo1.removeAllItems();
        Wherecombo2.removeAllItems();
        Wherecombo3.removeAllItems();
        Wherecombo4.removeAllItems();
        Wherecombo5.removeAllItems();
        
        for( int i=0 ; i<Game.nElem ; i++ )
        {
            Wherecombo1.addItem(Game.getValues(1)[i]);
            Wherecombo2.addItem(Game.getValues(1)[i]);
            Wherecombo3.addItem(Game.getValues(1)[i]);
            Wherecombo4.addItem(Game.getValues(1)[i]);
            Wherecombo5.addItem(Game.getValues(1)[i]);
        }
    }
    private void Wherecombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo1ActionPerformed
        if(Wherecombo1.isPopupVisible()){
            Operand1.setEnabled(true);
            Values1.setEnabled(true);
            Manage.setvaluesbox(Wherecombo1, Values1, val);
            Boolbox1.setEnabled(true);

        }
    }//GEN-LAST:event_Wherecombo1ActionPerformed

    private void CommitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommitButtonActionPerformed
        String Query= "";
        Query = getQuery2();
        Manage.buildTable(Query);
        Table.setModel(new javax.swing.table.DefaultTableModel( Manage.fill, Manage.col));

    }//GEN-LAST:event_CommitButtonActionPerformed
    private String getQuery2(){
        String Query = "select * from "+ (String)Tablecombo1.getSelectedItem() + " ";        
        if (Wherecombo1.isEnabled()) Query = Query + " WHERE " + Manage.datecheck(Wherecombo1, Operand1, Values1.getSelectedItem().toString());
        
        if (Wherecombo2.isEnabled()) Query = Query + " " + (String)Boolbox1.getSelectedItem() + " "+Manage.datecheck(Wherecombo2, Operand2, Values2.getSelectedItem().toString());
        if (Wherecombo3.isEnabled()) Query = Query + " " + (String)Boolbox2.getSelectedItem() + " "+Manage.datecheck(Wherecombo3, Operand3, Values3.getSelectedItem().toString());
        if (Wherecombo4.isEnabled()) Query = Query + " " + (String)Boolbox3.getSelectedItem() + " "+Manage.datecheck(Wherecombo4, Operand4, Values4.getSelectedItem().toString());
        return Query;
    }
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String Query [] = {" "+(String)Tablecombo1.getSelectedItem()+" set "+
                Wherecombo5.getSelectedItem().toString()+" = ? ","","","","", ""}; 
        n=0;
        Query[1]=jTextField1.getText();
        getQuery(Query, 1);
        
        try{
            Database.UpdateTable(Query, n+1);
        }
        catch(SQLException e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String Query [] = {"from "+(String)Tablecombo1.getSelectedItem()+ " ","","","",""}; 
        n=0;
        getQuery(Query, 0);
        
        try{
            System.out.println(Query[0]);
            Database.DeletefromTable(Query, n);
        }
        catch(SQLException e){}
    }//GEN-LAST:event_DeleteActionPerformed

    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        if(Wherecombo5.isEnabled()){ 
            Wherecombo5.setEnabled(false);  
            jTextField1.setEnabled(false);
            if(UpdateButton.isEnabled()) Delete.setEnabled(true);
            UpdateButton.setEnabled(false);
            
        }else{
            Wherecombo5.setEnabled(true);  
            jTextField1.setEnabled(true);
            if(Delete.isEnabled()) UpdateButton.setEnabled(true);
            Delete.setEnabled(false);
        }
    }//GEN-LAST:event_SetActionPerformed

    private void Wherecombo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo5ActionPerformed
        UpdateButton.setEnabled(true);
    }//GEN-LAST:event_Wherecombo5ActionPerformed

    private void getQuery(String Query [], int i){
        
        
        if (Wherecombo1.isEnabled()) {
            Query[0] = Query[0] + " WHERE " + Manage.datecheck(Wherecombo1, Operand1, "?");
            Query[1+i] = check2(Values1.getSelectedItem().toString(), Wherecombo1.getSelectedItem().toString());
            n=1;
        }        
        if (Wherecombo2.isEnabled()) {
            Query[0] = Query[0] + " " + (String)Boolbox1.getSelectedItem() + " "+Manage.datecheck(Wherecombo2, Operand2, "?");
            Query[2+i] = check2(Values2.getSelectedItem().toString(), Wherecombo2.getSelectedItem().toString());
            n=2;
        }
        if (Wherecombo3.isEnabled()) {
            Query[0] = Query[0] + " " + (String)Boolbox2.getSelectedItem() + " "+Manage.datecheck(Wherecombo3, Operand3, "?");
            Query[3+i] = check2(Values3.getSelectedItem().toString(), Wherecombo3.getSelectedItem().toString());
            n=3;
        }
        if (Wherecombo4.isEnabled()) {
            Query[0] = Query[0] + " " + (String)Boolbox3.getSelectedItem() + " "+Manage.datecheck(Wherecombo4, Operand4, "?");
            Query[4+i] = check2(Values4.getSelectedItem().toString(), Wherecombo4.getSelectedItem().toString());
            n=4;
        }
        
    }
    private String check2 (String S, String G){
        if(G.equals("GDATE")) {
            S = S.substring(0, 10);
            S="to_date('"+ S+"', 'YYYY-MM-DD')";
        }
        return S;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Boolbox1;
    private javax.swing.JComboBox<String> Boolbox2;
    private javax.swing.JComboBox<String> Boolbox3;
    private javax.swing.JButton CommitButton;
    private javax.swing.JButton Delete;
    private javax.swing.JComboBox<String> Operand1;
    private javax.swing.JComboBox<String> Operand2;
    private javax.swing.JComboBox<String> Operand3;
    private javax.swing.JComboBox<String> Operand4;
    private javax.swing.JButton Set;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> Tablecombo1;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JComboBox<String> Values1;
    private javax.swing.JComboBox<String> Values2;
    private javax.swing.JComboBox<String> Values3;
    private javax.swing.JComboBox<String> Values4;
    private javax.swing.JButton Wherebutton;
    private javax.swing.JComboBox<String> Wherecombo1;
    private javax.swing.JComboBox<String> Wherecombo2;
    private javax.swing.JComboBox<String> Wherecombo3;
    private javax.swing.JComboBox<String> Wherecombo4;
    private javax.swing.JComboBox<String> Wherecombo5;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
