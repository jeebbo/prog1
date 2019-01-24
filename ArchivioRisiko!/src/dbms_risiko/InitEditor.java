package dbms_risiko;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class InitEditor extends javax.swing.JFrame {
    private String []cmbUsers;
    private String []cmbColours;
    private String []cmbGoals;
    private String []cmbRandom;
    private String []cmbTurns;
    private String []cmbTerr;
    
    private String [][]selectColours;
    private String [][]selectGoals;
    private String [][]selectOwns;
    
    private String []valGame;
    private String []valRecap;
    private String []valOwn;
    
    static private int n;           /*NUMERO GIOCATORI*/
    static private int []numArmies; /*NUMERO ARMATE DA POSIZIONARE*/
    static private int currPl , countPl, totArmies , countRand;
    static private String codTurn;
    
    private boolean match_t;
    
    public InitEditor( boolean type , String []U , int nTurn ){
        match_t = type;
        initComboBoxes( U , nTurn );
        initComponents();
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        users = new javax.swing.JComboBox<>();
        colours = new javax.swing.JComboBox<>();
        goals = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exe = new javax.swing.JButton();
        day = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        turns = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        month = new javax.swing.JFormattedTextField();
        year = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        owners = new javax.swing.JComboBox<>();
        ownerships = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        numA = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        territories = new javax.swing.JComboBox<>();
        insert = new javax.swing.JButton();
        users2 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        todayButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

        jToggleButton1.setText("jToggleButton1");

        jButton1.setText("jButton1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
        setTitle("Inserimento dati");

        users.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        users.setModel(new javax.swing.DefaultComboBoxModel<>(cmbUsers));

        colours.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        colours.setModel(new javax.swing.DefaultComboBoxModel<>(cmbColours));

        goals.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        goals.setModel(new javax.swing.DefaultComboBoxModel<>(cmbGoals));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setText("Giocatore");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setText("Colore");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setText("Obiettivo");

        exe.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        exe.setText("Esegui");
        exe.setEnabled(false);
        exe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exeActionPerformed(evt);
            }
        });

        day.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd"))));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setText("Data Partita");

        Enter.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Enter.setText("↵");
        Enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnterMouseClicked(evt);
            }
        });

        turns.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        turns.setModel(new javax.swing.DefaultComboBoxModel<>(cmbTurns));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel6.setText("n° Turno");

        month.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MMM"))));

        year.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel7.setText("-");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel8.setText("-");

        owners.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        owners.setEnabled(false);
        owners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownersActionPerformed(evt);
            }
        });

        ownerships.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        ownerships.setEnabled(false);

        addButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        addButton.setText("+1");
        addButton.setEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        numA.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        numA.setText("#");

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel13.setText("Assegnazione territori");

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel14.setText("Inserimento armate");

        territories.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        territories.setEnabled(false);

        insert.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        insert.setText("↵");
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        users2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        Next.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Next.setText("Avanti");
        Next.setEnabled(false);
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        todayButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        todayButton.setText("Oggi");
        todayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exe))
                    .addComponent(goals, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colours, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel7)
                                .addGap(0, 0, 0)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel8)
                                .addGap(0, 0, 0)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Enter)
                                .addGap(73, 73, 73)
                                .addComponent(todayButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(189, 189, 189))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(owners, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ownerships, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Next))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(users2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(territories, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(insert)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day)
                    .addComponent(Enter)
                    .addComponent(month)
                    .addComponent(year)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(todayButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colours, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(turns, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(goals, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(territories, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert)
                    .addComponent(users2))
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(numA)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ownerships, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton)
                        .addComponent(Next))
                    .addComponent(owners, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exeActionPerformed
        int index = 0;
        valRecap[2] = (String)users.getSelectedItem();
        valRecap[3] = searchCod((String)colours.getSelectedItem() , selectColours );
        if(match_t){
             index = getFirstIndex( cmbRandom , index );
             valRecap[4] = cmbRandom[index];
        }
        else
            valRecap[4] = searchCod((String)goals.getSelectedItem() , selectGoals );
        valRecap[5] = (String)turns.getSelectedItem();
        try{ Database.InsertOnTable( valRecap , 5 ); }
        catch(SQLException e){ Database.printErr( e ); }
        users.removeItemAt(users.getSelectedIndex());
        colours.removeItemAt(colours.getSelectedIndex());
        if( match_t )
            cmbRandom[index] = null;
        else
            goals.removeItemAt(goals.getSelectedIndex());
        turns.removeItemAt(turns.getSelectedIndex());
        if( --countPl < 1 ){
            exe.setEnabled(false);
            startGame(valGame[1]);
            initOwnerships();
            /*UPDATE PER FAR PARTIRE IL TRIGGER winner_constraint*/
            String []upGame = new String[3];
            upGame[0] = "GAME SET NUMPL = ? WHERE CODGM = ?";
            upGame[1] = String.valueOf(n);
            upGame[2] = valGame[1];
            try{ Database.UpdateTable( upGame , 2 ); }
            catch(SQLException e){ Database.printErr( e ); }
        }
    }//GEN-LAST:event_exeActionPerformed

    private void EnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterMouseClicked
        valGame[2] = day.getText()+"-"+month.getText()+"-"+year.getText();
        try{
            Database.InsertOnTable( valGame , 2 );
            exe.setEnabled(true);
            Enter.setEnabled(false);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Valore non valido.\nLa data dev'essere del tipo "+
            "DD-MMM-YYYY, es: 17-SET-2016", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EnterMouseClicked

    private void ownersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownersActionPerformed
        try{
            Game.createMatrix("SELECT CODOWN, TERRITORY FROM OWNERSHIP WHERE OWNER = '"
              + (String)owners.getSelectedItem() + "' AND O_TURN = " + codTurn );
        }
        catch(SQLException e){ Database.printErr( e ); }
        ownerships.setModel(new javax.swing.DefaultComboBoxModel<>(Game.getValues(2)));
        selectOwns = Game.matrix;
        int currArmies = numArmies[owners.getSelectedIndex()];
        numA.setText(String.valueOf(currArmies));
        if( currArmies < 1 )
            addButton.setEnabled(false);
        else
            addButton.setEnabled(true);
    }//GEN-LAST:event_ownersActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String []upOwn = new String[3];
        upOwn[0] = "OWNERSHIP SET NUMARMIES = NUMARMIES + ? WHERE CODOWN = ?";
        upOwn[1] = "1";
        upOwn[2] = searchCod((String)ownerships.getSelectedItem() , selectOwns );
        try{ Database.UpdateTable( upOwn , 2 ); }
        catch(SQLException e){ Database.printErr( e ); }
        numA.setText(String.valueOf(--numArmies[owners.getSelectedIndex()]));
        if( numArmies[owners.getSelectedIndex()] < 1 )
            addButton.setEnabled(false);
        if( --totArmies < 1 )
            Next.setEnabled(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if( match_t )
            selectRandomTerritory();
        else
            selectTerritory();
        if( territories.getItemCount() < 1 || match_t ){
                insert.setEnabled(false);
                owners.setEnabled(true);
                ownerships.setEnabled(true);
                owners.setModel(new javax.swing.DefaultComboBoxModel<>(cmbUsers));
                getNumArmies();
        }
    }//GEN-LAST:event_insertActionPerformed

    private void selectTerritory(){
        valOwn[3] = users2.getText();
        valOwn[2] = (String)territories.getSelectedItem();
        try{ valOwn[1] = Database.nextVal("COUNT_OWN"); }
        catch(SQLException e){ Database.printErr( e ); }
        currPl = (++currPl)%n;
        users2.setText(cmbUsers[currPl]);
        
        /*INSERIMENTO POSSEDIMENTI*/
        try{ Database.InsertOnTable( valOwn , 5 ); }
        catch( SQLException e ){ Database.printErr( e ); }
        territories.removeItem(valOwn[2]);
    }
    
    private void selectRandomTerritory(){
        for( int i=0 ; i<42 ; i++ ){
            valOwn[3] = cmbUsers[currPl];
            valOwn[2] = cmbTerr[countRand];
            countRand++;
            try{ valOwn[1] = Database.nextVal("COUNT_OWN"); }
            catch(SQLException e){ Database.printErr( e ); }
            currPl = (++currPl)%n;

            /*INSERIMENTO POSSEDIMENTI*/
            try{ Database.InsertOnTable( valOwn , 5 ); }
            catch( SQLException e ){ Database.printErr( e ); }
        }
    }
    
    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        this.setVisible(false);
        Game.e = new Editor( match_t , codTurn );
    }//GEN-LAST:event_NextActionPerformed

    private void todayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayButtonActionPerformed
        Enter.setEnabled(false); day.setEnabled(false);
        month.setEnabled(false); year.setEnabled(false);
        todayButton.setEnabled(false);
        valGame[0] = "GAME( CODGM , GDATE ) VALUES( ? , SYSDATE )";
        try{
            Database.InsertOnTable( valGame , 1 );
            exe.setEnabled(true);
            Enter.setEnabled(false);
        }
        catch(SQLException e){ Database.printErr( e ); }
    }//GEN-LAST:event_todayButtonActionPerformed
    
    static public String searchCod( String value , String [][]M ){
        int i;
        for( i=0 ; !M[i][1].equals(value) ; i++ );
        return M[i][0];
    }
    
    private void initComboBoxes( String []U , int sz ){
        countPl = n = sz;
        cmbTurns = new String[n];
        for( int i=0 ; i<n ; i++ )
            cmbTurns[i] = String.valueOf(i+1);
        cmbUsers = U;
        valGame = new String[3];
        valGame[0] = "GAME( CODGM , GDATE ) VALUES( ? , ? )";
        try{
            valGame[1] = Database.nextVal("COUNT_GAME");
            Game.createMatrix("SELECT CODGOAL, DETAILS FROM GOALCARD ORDER BY DBMS_RANDOM.RANDOM");
            if( match_t ){
                cmbRandom = Game.getValues(1);
                cmbGoals = new String[1];
                cmbGoals[0] = "?";
            }
            else
                cmbGoals = Game.getValues(2);
            selectGoals = Game.matrix;
            Game.createMatrix("SELECT CODCL, COLOUR_T FROM COLOUR");
            cmbColours = Game.getValues(2);
            selectColours = Game.matrix;
        }
        catch( SQLException e ){ Database.printErr( e ); }
        valRecap = new String[6];
        valRecap[0] = "RECAP VALUES( ? , ? , ? , ? , ? )";
        valRecap[1] = valGame[1];
    }
        
    private void startGame( String codGm ){
        Database.queryOnTable("SELECT PLAYER FROM RECAP WHERE GAME = "
                + codGm + " AND MYTURN = 1");
        String []values = new String[5];
        values[0] = "TURN VALUES( ? , ? , ? , ? )";
        values[2] = "1";
        values[4] = codGm;
        try{
            Database.rset.first();
            values[3] = Database.rset.getString(1);
            values[1] = Database.nextVal("COUNT_TURN");
            Database.InsertOnTable(values, 4);
        }
        catch( SQLException e ){  Database.printErr( e ); }
        codTurn = values[1];
    }
    
    private void initOwnerships( ){
        currPl = 0;
        territories.setEnabled(true);
        insert.setEnabled(true);
        
        try{ Game.createMatrix("SELECT TNAME FROM TERRITORY ORDER BY DBMS_RANDOM.RANDOM"); }
        catch( SQLException e ){ Database.printErr( e ); }
        cmbTerr = Game.getValues(1);
        if( match_t )
            territories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "?" }));
        else{
            territories.setModel(new javax.swing.DefaultComboBoxModel<>(Game.getValues(1)));
            users2.setText(cmbUsers[currPl]);
        }
        valOwn = new String[6];
        valOwn[0] = "OWNERSHIP VALUES( ? , ? , ? , ? , ? )";
        valOwn[4] = "1";
        valOwn[5] = codTurn;
    }
    
    private void getNumArmies(){
        /*NUMERO DI ARMATE DISPONIBILI ALL'INIZIO*/
        /*3 giocatori -> 35 , 4 giocatori -> 30
          5 giocatori -> 25 , 6 giocatori -> 20*/
        numArmies = new int[n];
        int i , m = 35;
        for( i=3 ; i<n ; i++ )
            m -= 5;
        totArmies = m*n - 42;
        m -= 42/n; /*Armate già inserite, come previsto dal regolamento*/
        for( i=0 ; i<n ; i++ ){
            numArmies[i] = m;
            if( (i==0 || i==1) && (n%3 != 0) )
                numArmies[i]--;
        }
    }
    
    private int getFirstIndex( String []values , int i ){
        if( values[i] != null )
            return i;
        else
            return getFirstIndex( values , i+1 );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JButton Next;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> colours;
    private javax.swing.JFormattedTextField day;
    private javax.swing.JButton exe;
    private javax.swing.JComboBox<String> goals;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JFormattedTextField month;
    private javax.swing.JLabel numA;
    private javax.swing.JComboBox<String> owners;
    private javax.swing.JComboBox<String> ownerships;
    private javax.swing.JComboBox<String> territories;
    private javax.swing.JButton todayButton;
    private javax.swing.JComboBox<String> turns;
    private javax.swing.JComboBox<String> users;
    private javax.swing.JLabel users2;
    private javax.swing.JFormattedTextField year;
    // End of variables declaration//GEN-END:variables
}