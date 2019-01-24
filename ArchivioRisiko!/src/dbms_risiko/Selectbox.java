package dbms_risiko;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Selectbox extends javax.swing.JFrame {
    static public String []tables;
    static public String []tables2;
    static public String []tables3;
    static public String []columns;
    static public String [] List = {};
    static public String [] join1 = {};
    static public String [] join2 = {};
    
    static public String val [];
    boolean flag;
    
    private int c2;
    private String select1, select2, select3; 
    private DefaultComboBoxModel cmbx = new DefaultComboBoxModel();
    private DefaultComboBoxModel wcmbx = null;
    public Selectbox() {
        try{
            tables = Manage.createComboBox( null );
            
        }
        catch(SQLException e){}
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tablecombo1 = new javax.swing.JComboBox<>();
        Tablecombo2 = new javax.swing.JComboBox<>();
        Tablecombo3 = new javax.swing.JComboBox<>();
        CommitButton = new javax.swing.JButton();
        Join1 = new javax.swing.JButton();
        Join2 = new javax.swing.JButton();
        Wherecombo1 = new javax.swing.JComboBox<>();
        Boolbox1 = new javax.swing.JComboBox<>();
        Boolbox2 = new javax.swing.JComboBox<>();
        Boolbox3 = new javax.swing.JComboBox<>();
        Wherecombo2 = new javax.swing.JComboBox<>();
        Wherecombo4 = new javax.swing.JComboBox<>();
        Wherecombo3 = new javax.swing.JComboBox<>();
        Wherebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Operand1 = new javax.swing.JComboBox<>();
        Operand3 = new javax.swing.JComboBox<>();
        Operand2 = new javax.swing.JComboBox<>();
        Operand4 = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        Values1 = new javax.swing.JComboBox<>();
        Values2 = new javax.swing.JComboBox<>();
        Values3 = new javax.swing.JComboBox<>();
        Values4 = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setText("Search on");

        Tablecombo1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Tablecombo1.setModel(new javax.swing.DefaultComboBoxModel<>(tables));
        Tablecombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tablecombo1ActionPerformed(evt);
            }
        });

        Tablecombo2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Tablecombo2.setModel(new javax.swing.DefaultComboBoxModel<>());
        Tablecombo2.setEnabled(false);
        Tablecombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tablecombo2ActionPerformed(evt);
            }
        });

        Tablecombo3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        Tablecombo3.setModel(new javax.swing.DefaultComboBoxModel<>());
        Tablecombo3.setEnabled(false);
        Tablecombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tablecombo3ActionPerformed(evt);
            }
        });

        CommitButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        CommitButton.setText("Commit");
        CommitButton.setEnabled(false);
        CommitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommitButtonActionPerformed(evt);
            }
        });

        Join1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Join1.setText("Join");
        Join1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Join1ActionPerformed(evt);
            }
        });
        Join1.setEnabled(false);

        Join2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Join2.setText("Join");
        Join2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Join2ActionPerformed(evt);
            }
        });
        Join2.setEnabled(false);

        Wherecombo1.setModel(new javax.swing.DefaultComboBoxModel<>());
        Wherecombo1.setEnabled(false);
        Wherecombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wherecombo1ActionPerformed(evt);
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

        jLabel2.setText("jLabel2");
        jLabel2.setVisible(false);

        jLabel7.setText("jLabel7");
        jLabel7.setVisible(false);

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

        Operand1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand1.setEnabled(false);

        Operand3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand3.setEnabled(false);

        Operand2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand2.setEnabled(false);

        Operand4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));
        Operand4.setEnabled(false);

        cancel.setFont(new java.awt.Font("Monospaced", 0, 12));
        cancel.setText("Annulla");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 20, Short.MAX_VALUE)
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
                                        .addComponent(Values1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Operand4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Values4, 0, 100, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Operand2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Values2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tablecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Join1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tablecombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Join2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tablecombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel2)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(CommitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tablecombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Join1)
                    .addComponent(Join2)
                    .addComponent(Tablecombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tablecombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Operand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Values2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boolbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Wherecombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Operand4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Values4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommitButton)
                    .addComponent(cancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tablecombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tablecombo1ActionPerformed
        int i=0;
        Wherebutton.setEnabled(true);
        Tablecombo3.setEnabled(false);
        Tablecombo2.setEnabled (false);
        cmbx = new DefaultComboBoxModel();
        wcmbx = new DefaultComboBoxModel();
        select1 = (String)Tablecombo1.getSelectedItem();
        try{ tables2 = Manage.createComboBox(select1); }
        catch(SQLException e){ System.out.println("sqlexception\n"); }
        c2=Game.nElem;
        for( i=0 ; i<Game.nElem ; i++ )
            if( !tables2[i].equals( select1 ) )
                cmbx.addElement(tables2[i]);
        Tablecombo2.setModel(cmbx);
        setwherebox(1);
        Join1.setEnabled(true);
        CommitButton.setEnabled(true);
        join1= null;
        join2= null;
    }//GEN-LAST:event_Tablecombo1ActionPerformed

    private void Tablecombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tablecombo2ActionPerformed
        cmbx = new DefaultComboBoxModel();
        Tablecombo3.setEnabled(false);
        select2 = (String)Tablecombo2.getSelectedItem();
        try{ tables3 = Manage.createComboBox(select2); }
        catch(SQLException e){ System.out.println("sqlexception\n"); }
        for( int i=0 ; i<Game.nElem ; i++ )
            if( !is_in( tables3[i] , tables2 , c2-1 ) )
                cmbx.addElement(tables3[i]);

        for(int i=0 ; i<c2 ; i++ )
            if( !tables2[i].equals(select2) && !tables2[i].equals(select1))
                cmbx.addElement(tables2[i]);
        if( cmbx.getSize() > 0 )
            Tablecombo3.setModel(cmbx);
        setwherebox(2);
        Join2.setEnabled(true);
        CommitButton.setEnabled(true);
        join1= getjoin(select1, select2);
        jLabel2.setText("ON "+join1[0]+" = "+join1[1]);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_Tablecombo2ActionPerformed

    private void Tablecombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tablecombo3ActionPerformed
        select3 = (String)Tablecombo3.getSelectedItem();
        setwherebox(3);
        flag=false;
        join2= getjoin(select2, select3);
        if(join2[0].equals("")) {join2= getjoin (select1, select3); flag=true;}
        jLabel7.setText("ON "+join2[0]+" = "+join2[1]);
        jLabel7.setVisible(true);
        CommitButton.setEnabled(true);
    }//GEN-LAST:event_Tablecombo3ActionPerformed
    
    private String [] getjoin(String select1, String select2){
        String [] ret = {"", ""};
        String Query = "SELECT column_name FROM USER_CONSTRAINTS C1 JOIN "+ 
        "USER_CONSTRAINTS C2 ON ((C1.TABLE_NAME = '"+select1+"' AND C2.TABLE_NAME"+
        " = '"+select2+"') and (C1.CONSTRAINT_NAME=C2.R_CONSTRAINT_NAME "+ 
        "OR C1.R_CONSTRAINT_NAME = C2.CONSTRAINT_NAME)) JOIN ALL_CONS_COLUMNS" +
        " AC on (C1.CONSTRAINT_NAME=AC.CONSTRAINT_NAME OR AC.CONSTRAINT_NAME ="+
        "C2.CONSTRAINT_NAME)";
        Database.queryOnTable(Query);
        try{
            Database.rset.next();
            ret[0] = Database.rset.getString(1);
            Database.rset.next();
            ret[1] = Database.rset.getString(1);
        }
        catch(SQLException e){
            ret[0] = "";
        }
        return ret;
    }
    
    private void Join1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Join1ActionPerformed
       if( !Tablecombo2.isEnabled()){
           Tablecombo2.setEnabled(true);
           CommitButton.setEnabled(false);
       }
       else {
           Tablecombo3.setEnabled(false);
           Tablecombo2.setEnabled(false);
           setwherebox(1);
           closeWhere();
           jLabel2.setVisible(false);
           jLabel7.setVisible(false);
       }
    }//GEN-LAST:event_Join1ActionPerformed

    private void Join2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Join2ActionPerformed
        if( !Tablecombo3.isEnabled() && Tablecombo2.isEnabled()) {
           Tablecombo3.setEnabled(true);// TODO add your handling code here:
           CommitButton.setEnabled(false);
        }
        else {
            Tablecombo3.setEnabled(false);
            setwherebox(2);
            closeWhere();
            jLabel7.setVisible(false);
        }
    }//GEN-LAST:event_Join2ActionPerformed

    private void Boolbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boolbox1ActionPerformed
        if(Boolbox1.getSelectedIndex()!=0) {
            Wherecombo2.setEnabled(true);
            CommitButton.setEnabled(false);
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

        }
    }//GEN-LAST:event_Boolbox1ActionPerformed

    private void Boolbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boolbox2ActionPerformed
        if(Boolbox2.getSelectedIndex()!=0) {
            Wherecombo3.setEnabled(true);
            CommitButton.setEnabled(false);
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
        }
    }//GEN-LAST:event_Boolbox2ActionPerformed

    private void Wherecombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo1ActionPerformed
        if(Wherecombo1.isPopupVisible()){
            Operand1.setEnabled(true);
            Values1.setEnabled(true);
            Manage.setvaluesbox(Wherecombo1, Values1, val);
            Boolbox1.setEnabled(true);

        }
    }//GEN-LAST:event_Wherecombo1ActionPerformed

    private void Wherecombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo2ActionPerformed
        if(Wherecombo2.isPopupVisible()){
            Operand2.setEnabled(true);
            Values2.setEnabled(true);
            Manage.setvaluesbox(Wherecombo2, Values2, val);       
            Boolbox2.setEnabled(true);

        }
    }//GEN-LAST:event_Wherecombo2ActionPerformed

    private void Wherecombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo3ActionPerformed
        if(Wherecombo3.isPopupVisible()){
            Operand3.setEnabled(true);
            Values3.setEnabled(true);
            Manage.setvaluesbox(Wherecombo3, Values3, val);           
            Boolbox3.setEnabled(true);

        }
    }//GEN-LAST:event_Wherecombo3ActionPerformed

    private void Wherecombo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wherecombo4ActionPerformed
        if(Wherecombo4.isPopupVisible()) {
            Operand4.setEnabled(true);
            Values4.setEnabled(true);
            Manage.setvaluesbox(Wherecombo1, Values4, val);
            
        }
    }//GEN-LAST:event_Wherecombo4ActionPerformed

    private void Boolbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boolbox3ActionPerformed
        if(Boolbox3.getSelectedIndex()!=0){
            Wherecombo4.setEnabled(true);
            CommitButton.setEnabled(false);
        }
        else{
            Wherecombo4.setEnabled(false);
            Operand4.setEnabled(false);
            Values4.setEnabled(false);
            CommitButton.setEnabled(true);
        }
    }//GEN-LAST:event_Boolbox3ActionPerformed

    private void WherebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WherebuttonActionPerformed
        if(!Wherecombo1.isEnabled()){
            
        
            Operand1.setEnabled(true);
            Wherecombo1.setEnabled(true);
            CommitButton.setEnabled(false);
        }else closeWhere();
    }//GEN-LAST:event_WherebuttonActionPerformed
    private void closeWhere(){
        if(!Wherecombo1.isEnabled())
        {
            
            CommitButton.setEnabled(true);
        }
        else {
            Wherecombo1.setEnabled(false);
            CommitButton.setEnabled(true);
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
    }
    private void CommitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommitButtonActionPerformed
        String Query = getQuery();
        Manage.buildTable(Query);
        Table.setModel(new javax.swing.table.DefaultTableModel( Manage.fill, Manage.col));

        
    }//GEN-LAST:event_CommitButtonActionPerformed
    
    
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.setVisible(false); 
    }//GEN-LAST:event_cancelMouseClicked

    private void Values1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values1ActionPerformed
        CommitButton.setEnabled(true);
    }//GEN-LAST:event_Values1ActionPerformed

    private void Values2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values2ActionPerformed
        CommitButton.setEnabled(true);
    }//GEN-LAST:event_Values2ActionPerformed

    private void Values3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values3ActionPerformed
        CommitButton.setEnabled(true);
    }//GEN-LAST:event_Values3ActionPerformed

    private void Values4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Values4ActionPerformed
        CommitButton.setEnabled(true);
    }//GEN-LAST:event_Values4ActionPerformed
 
    private String getQuery(){
        String Query = "select * from "+ (String)Tablecombo1.getSelectedItem() + " ";
        
        if (Tablecombo2.isEnabled()) Query = Query + " JOIN " + (String)Tablecombo2.getSelectedItem() + " ON " + join1[0] + " = " + join1[1];
        if (Tablecombo3.isEnabled()&&flag) Query = Query + " JOIN " + (String)Tablecombo3.getSelectedItem() + " ON " + join2[0] + " = " + join2[1];
        if (Tablecombo3.isEnabled()&&!flag) Query = Query + " JOIN " + (String)Tablecombo3.getSelectedItem() + " ON " + join2[0] + " = " + join2[1];
        if (Wherecombo1.isEnabled()) Query = Query + " WHERE " + Manage.datecheck(Wherecombo1, Operand1, Values1.getSelectedItem().toString());
        
        if (Wherecombo2.isEnabled()) Query = Query + " " + (String)Boolbox1.getSelectedItem() + " "+Manage.datecheck(Wherecombo2, Operand2, Values2.getSelectedItem().toString());
        if (Wherecombo3.isEnabled()) Query = Query + " " + (String)Boolbox2.getSelectedItem() + " "+Manage.datecheck(Wherecombo3, Operand3, Values3.getSelectedItem().toString());
        if (Wherecombo4.isEnabled()) Query = Query + " " + (String)Boolbox3.getSelectedItem() + " "+Manage.datecheck(Wherecombo4, Operand4, Values4.getSelectedItem().toString());
        return Query;
    }
    
    
                
    private boolean is_in( String S , String[] tab , int n ){
        if(n >= 0){
            if( S.equals(tab[n]) )
                return true;
            else
                return is_in( S , tab , n-1 );
        }
        else
            return false;
    }

    private void setwherebox ( int c ){
        try{ columns = Manage.createwhereComboBox(c, 
                (String)Tablecombo1.getSelectedItem(), 
                (String)Tablecombo2.getSelectedItem(), 
                (String)Tablecombo3.getSelectedItem()); }
        catch(SQLException e){ System.out.println("sqlexception\n"); }
        Wherecombo1.removeAllItems();
        Wherecombo2.removeAllItems();
        Wherecombo3.removeAllItems();
        Wherecombo4.removeAllItems();
        if (c == 1||c == 0) {jLabel7.setVisible(false); jLabel2.setVisible(false);}
        if (c == 2) jLabel7.setVisible(false);
        for( int i=0 ; i<Game.nElem ; i++ )
        {
            Wherecombo1.addItem(columns[i]);
            Wherecombo2.addItem(columns[i]);
            Wherecombo3.addItem(columns[i]);
            Wherecombo4.addItem(columns[i]);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Boolbox1;
    private javax.swing.JComboBox<String> Boolbox2;
    private javax.swing.JComboBox<String> Boolbox3;
    private javax.swing.JButton CommitButton;
    private javax.swing.JButton Join1;
    private javax.swing.JButton Join2;
    private javax.swing.JComboBox<String> Operand1;
    private javax.swing.JComboBox<String> Operand2;
    private javax.swing.JComboBox<String> Operand3;
    private javax.swing.JComboBox<String> Operand4;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> Tablecombo1;
    private javax.swing.JComboBox<String> Tablecombo2;
    private javax.swing.JComboBox<String> Tablecombo3;
    private javax.swing.JComboBox<String> Values1;
    private javax.swing.JComboBox<String> Values2;
    private javax.swing.JComboBox<String> Values3;
    private javax.swing.JComboBox<String> Values4;
    private javax.swing.JButton Wherebutton;
    private javax.swing.JComboBox<String> Wherecombo1;
    private javax.swing.JComboBox<String> Wherecombo2;
    private javax.swing.JComboBox<String> Wherecombo3;
    private javax.swing.JComboBox<String> Wherecombo4;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
