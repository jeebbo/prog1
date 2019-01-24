package dbms_risiko;

import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/** @authors Cuomo Daniele , Iervolino Riccardo */

public class Editor extends javax.swing.JFrame {
    private String [][]selectStrk , selectDfnd;
    private String [][]selectOwns;
    private String T;
    private int nBattle;                 /*DESCRIVE L'ORDINE DELLE BATTAGLIE*/
    private String []totTerr;
    private String []newCards;
    private int tot;
    private String newOwn, oldOwn;
    
    /*GESTIONE CARTE*/
    private String [][]selectCards;      /*CARTE IN MANO AL GIOCATORE CORRENTE*/
    private String []cmbCards = null;
    private String [][]selectDraw;       /*CARTE PESCABILI*/
    private String []cmbDraw = null;
    private String cardRandom = null;
        
    private boolean type;
    
    /*GESTIONE DADI*/
    static String []dice1Manual = new String[] { "1", "2", "3", "4", "5", "6" };
    static String []dice2Manual = new String[] { "0", "1", "2", "3", "4", "5", "6" };
    
    static String []dice1Simulate = new String[] { "x" };
    static String []dice2Simulate = new String[] { "0", "x" };
    
    static DefaultComboBoxModel red1_t, red2_t, red3_t, blue1_t, blue2_t, blue3_t;
    
    
    public Editor( boolean match_t , String thisT ) {   
        nBattle = 0;
        type = match_t;
        T = thisT;
        initComponents(); 
        Database.queryOnTable("SELECT CURRPL FROM TURN WHERE CODTR = " + T);
        try{
            Database.rset.first();
            currPl.setText(Database.rset.getString(1));
            currPl2.setText(Database.rset.getString(1));
        }
        catch(SQLException e){ Database.printErr(e); }
        int newArmies = setTotTerr();
        ownerships.setModel(new javax.swing.DefaultComboBoxModel<>(totTerr));
        numA.setText( String.valueOf(newArmies) );
        if( tot == 0 ) /*CONDIZIONE DI SCONFITTA*/
            tryToPass( );
        if( newArmies > 0 )
            addButton.setEnabled(true);
        else
            passButton.setEnabled(true);
        ownerships.setEnabled(true);
        initCombinations();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currPl = new javax.swing.JLabel();
        strike = new javax.swing.JComboBox<>();
        currStr = new javax.swing.JLabel();
        defend = new javax.swing.JComboBox<>();
        SpinnerArmies1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        currDef = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelWin = new javax.swing.JLabel();
        currStr1 = new javax.swing.JLabel();
        drawButton = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        draw = new javax.swing.JComboBox<>();
        passButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        ownerships = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        numA = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        card1 = new javax.swing.JComboBox<>();
        card2 = new javax.swing.JComboBox<>();
        card3 = new javax.swing.JComboBox<>();
        combinationButton = new javax.swing.JButton();
        red3 = new javax.swing.JComboBox<>();
        red2 = new javax.swing.JComboBox<>();
        red1 = new javax.swing.JComboBox<>();
        blue3 = new javax.swing.JComboBox<>();
        blue1 = new javax.swing.JComboBox<>();
        blue2 = new javax.swing.JComboBox<>();
        fromTerr = new javax.swing.JComboBox<>();
        toTerr = new javax.swing.JComboBox<>();
        currStr2 = new javax.swing.JLabel();
        SpinnerArmies2 = new javax.swing.JSpinner();
        transfertButton = new javax.swing.JButton();
        currPl2 = new javax.swing.JLabel();
        currStr3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inizia la battaglia");

        currPl.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        strike.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        strike.setEnabled(false);
        strike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strikeActionPerformed(evt);
            }
        });

        currStr.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        currStr.setText("Attaccante");

        defend.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        defend.setEnabled(false);
        defend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defendActionPerformed(evt);
            }
        });

        SpinnerArmies1.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setText("Dadi ->");

        attackButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        attackButton.setText("Attacca!");
        attackButton.setEnabled(false);
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        currDef.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setText("Difensore");

        labelWin.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        currStr1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        currStr1.setText("Trasferire armate");

        drawButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        drawButton.setText("Pesca");
        drawButton.setEnabled(false);
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        insert.setText("↵");
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        draw.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        draw.setEnabled(false);

        passButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        passButton.setText("Passa");
        passButton.setEnabled(false);
        passButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passButtonActionPerformed(evt);
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

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel14.setText("Armate disponibili:");

        card1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        card2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        card3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        combinationButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        combinationButton.setText("Gioca combinazione");
        combinationButton.setEnabled(false);
        combinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combinationButtonActionPerformed(evt);
            }
        });

        red3.setBackground(new java.awt.Color(255, 0, 0));
        red3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        red3.setForeground(new java.awt.Color(255, 0, 51));
        red3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "0", "1", "2", "3", "4", "5", "6" }));
        red3.setEnabled(false);
        red3.setMinimumSize(new java.awt.Dimension(31, 20));

        red2.setBackground(new java.awt.Color(255, 0, 0));
        red2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        red2.setForeground(new java.awt.Color(255, 0, 51));
        red2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "0", "1", "2", "3", "4", "5", "6" }));
        red2.setEnabled(false);
        red2.setMinimumSize(new java.awt.Dimension(31, 20));

        red1.setBackground(new java.awt.Color(255, 0, 0));
        red1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        red1.setForeground(new java.awt.Color(255, 0, 51));
        red1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "0", "1", "2", "3", "4", "5", "6" }));
        red1.setEnabled(false);
        red1.setMinimumSize(new java.awt.Dimension(31, 20));

        blue3.setBackground(new java.awt.Color(0, 51, 255));
        blue3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        blue3.setForeground(new java.awt.Color(0, 51, 255));
        blue3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "0", "1", "2", "3", "4", "5", "6" }));
        blue3.setEnabled(false);
        blue3.setMinimumSize(new java.awt.Dimension(31, 20));

        blue1.setBackground(new java.awt.Color(0, 51, 255));
        blue1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        blue1.setForeground(new java.awt.Color(0, 51, 255));
        blue1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "0", "1", "2", "3", "4", "5", "6" }));
        blue1.setEnabled(false);
        blue1.setMinimumSize(new java.awt.Dimension(31, 20));

        blue2.setBackground(new java.awt.Color(0, 51, 255));
        blue2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        blue2.setForeground(new java.awt.Color(0, 51, 255));
        blue2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "x", "0", "1", "2", "3", "4", "5", "6" }));
        blue2.setEnabled(false);
        blue2.setMinimumSize(new java.awt.Dimension(31, 20));

        fromTerr.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        fromTerr.setEnabled(false);
        fromTerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTerrActionPerformed(evt);
            }
        });

        toTerr.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        toTerr.setEnabled(false);

        currStr2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        currStr2.setText("Fase finale: spostamenti");

        SpinnerArmies2.setEnabled(false);

        transfertButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        transfertButton.setText("->");
        transfertButton.setEnabled(false);
        transfertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfertButtonActionPerformed(evt);
            }
        });

        currPl2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        currStr3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        currStr3.setText("Turno di");

        exit.setFont(new java.awt.Font("Monospaced", 0, 12));
        exit.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        exit.setText("Esci");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
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
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(currStr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currPl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currDef, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(strike, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(red1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(red2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(red3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(defend, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(blue1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blue2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blue3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelWin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(attackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currStr1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerArmies1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(insert)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combinationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ownerships, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(currStr2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fromTerr, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(SpinnerArmies2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(transfertButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(toTerr, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(exit)
                                .addGap(47, 47, 47)
                                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(drawButton)
                                .addGap(57, 57, 57)
                                .addComponent(passButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currStr3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currPl2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currPl2)
                    .addComponent(currStr3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combinationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerships, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(jLabel14)
                    .addComponent(numA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(currDef)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(currStr)
                        .addComponent(currPl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blue3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(strike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(red3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(red2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(red1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerArmies1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currStr1)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(currStr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromTerr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toTerr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerArmies2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drawButton)
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void strikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strikeActionPerformed
        attackButton.setEnabled(false);
        String terr = (String)strike.getSelectedItem();
        String union = "(SELECT TNAME2 FROM BORDER WHERE TNAME1 = '"+terr+ 
                "' UNION SELECT TNAME1 FROM BORDER WHERE TNAME2 = '" +terr+ "')";
        try{
            Game.createMatrix("SELECT TERRITORY, NUMARMIES, OWNER, CODOWN FROM OWNERSHIP WHERE"
             +" OWNER <> '" + currPl.getText() + "' AND TERRITORY IN" + union
             + " AND O_TURN = " + T + " AND NUMARMIES > 0");
            selectDfnd = Game.matrix;
        }
        catch(SQLException e){ Database.printErr(e); }
        defend.setModel(new javax.swing.DefaultComboBoxModel<>(Game.getValues(1)));
        defend.setEnabled(true);
        enableDices( selectStrk , terr , red2 , red3 );
    }//GEN-LAST:event_strikeActionPerformed

    private void defendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defendActionPerformed
        blue2.setEnabled(false);
        blue3.setEnabled(false);
        if( defend.getSelectedItem() != null ){
            attackButton.setEnabled(true);
            String terr = (String)defend.getSelectedItem();
            currDef.setText(searchValue( selectDfnd , terr , 3 ));
            enableDices( selectDfnd , terr , blue2 , blue3 );
        }
    }//GEN-LAST:event_defendActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        String terr = (String)strike.getSelectedItem();
        String []valBattle = new String[6];
        valBattle[0] = "BATTLE VALUES( ? , ? , ? , ? , ? )";
        valBattle[1] = getDices( red1 , red2 , red3 );
        valBattle[2] = getDices( blue1 , blue2 , blue3 );
        valBattle[3] = searchValue( selectStrk , (String)strike.getSelectedItem() , 3 );
        valBattle[4] = searchValue( selectDfnd , (String)defend.getSelectedItem() , 4 );
        valBattle[5] = String.valueOf(++nBattle);
        try{ Database.InsertOnTable( valBattle , 5 ); }
        catch(SQLException e){ Database.printErr(e); }
        
        if( strikerWins() ){
            defend.setEnabled(false);
            strike.setEnabled(false);
            attackButton.setEnabled(false);    
            labelWin.setText("Difensore sconfitto!");
            if( setSpinnerArmies( SpinnerArmies1 , (String)strike.getSelectedItem() ) )
                insert.setEnabled(true);
            else
                insert.setEnabled(false);
                                           
            drawButton.setEnabled(true);
            draw.setEnabled(true);
            setDrawCards();
            setTotTerr();
            initTransfert( fromTerr , " " );
        }
        else
            labelWin.setText("Blu ancora in vita");
        if( strike.getSelectedItem() == null ){
            attackButton.setEnabled(false);
            strike.setEnabled(false);
            defend.setEnabled(false);
        }
        red2.setEnabled(false);
        red3.setEnabled(false);
        blue2.setEnabled(false);
        blue3.setEnabled(false);
        initBattle();
    }//GEN-LAST:event_attackButtonActionPerformed

    private void setDrawCards(){
        String myCards = "(SELECT CARD FROM HAND WHERE H_TURN = " + T + ")";
        try{ Game.createMatrix("SELECT TCNAME, BONUS_T, CODCARD FROM TERRITORYCARD"
                + " WHERE CODCARD NOT IN" + myCards + " ORDER BY DBMS_RANDOM.RANDOM"); }
        catch(SQLException e){ Database.printErr(e); }
        selectDraw = Game.matrix;
        cmbDraw = Game.getValues(1);
        for(int i=0; i<Game.nElem ; i++ )
            if( selectDraw[i][1].equals("Jolly") )
                selectDraw[i][0] = cmbDraw[i] = "Jolly";
        if( type ){
            cardRandom = selectDraw[0][2];
            cmbDraw = new String[1];
            cmbDraw[0] = "?";
        }
        else{
        }
        draw.setModel(new javax.swing.DefaultComboBoxModel<>(cmbDraw));
    }
    
    private boolean setSpinnerArmies( JSpinner S , String currTerr ){
        
        Database.queryOnTable("SELECT NUMARMIES FROM OWNERSHIP WHERE CODOWN = "
                    + InitEditor.searchCod( currTerr , selectOwns ) +
                " AND NUMARMIES > 0");
        int max = -1;
        try{
            Database.rset.first();
            max += Database.rset.getInt(1);
        }
        catch(SQLException e){ Database.printErr(e); }

        S.setModel(new javax.swing.SpinnerNumberModel(0, 0, max, 1));
        S.setEnabled(true);
        if( max == 0 )
            return false;
        else
            return true;
    }
    
    private String getDices( JComboBox x , JComboBox y , JComboBox z  ){
        if( !type )
            return getSingleDice( x )+","+getSingleDice( y )+","+getSingleDice( z );
        else
            return getRandomDice( x )+","+getRandomDice( y )+","+getRandomDice( z );
    }
    
    private String getSingleDice( JComboBox x ){
        if( x.getSelectedItem().equals("0") || !x.isEnabled() )
            return "0";
        else
            return (String)x.getSelectedItem();
    }
    
    private String getRandomDice( JComboBox x ){
        if( x.getSelectedItem().equals("0") || !x.isEnabled() )
            return "0";
        else
            return String.valueOf(1 + (int)(Math.random()*1000)%6);
    }
    
    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        drawButton.setEnabled(false);
        transfertButton.setEnabled(false);
        attackButton.setEnabled(false);
        strike.setEnabled(false);
        String []insHand = new String[4];
        insHand[0] = "HAND VALUES( ? , ? , ? )";
        insHand[1] = T;
        if( type )
            insHand[2] = cardRandom;
        else
            insHand[2] = searchValue( selectDraw , (String)draw.getSelectedItem() , 3 );
        insHand[3] = currPl.getText();
        try{ Database.InsertOnTable( insHand , 3 ); }
        catch( SQLException e ){ Database.printErr(e); }
    }//GEN-LAST:event_drawButtonActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        SpinnerArmies1.setEnabled(false);
        insert.setEnabled(false);
        
        StartTransfert( SpinnerArmies1 , oldOwn , newOwn );
        
        attackButton.setEnabled(false);
        strike.setEnabled(true);
    }//GEN-LAST:event_insertActionPerformed

    private void StartTransfert( JSpinner S , String from , String to ){
        String []upOwn = new String[3];
        upOwn[0] = "OWNERSHIP SET NUMARMIES = NUMARMIES + ? WHERE CODOWN = ?";
        upOwn[1] = String.valueOf((int)S.getValue());
        upOwn[2] = to;
        try{ Database.UpdateTable( upOwn , 2 ); }
        catch(SQLException e){ Database.printErr( e ); }
        
        int tmp = Integer.parseInt(upOwn[1]);
        tmp *= -1;
        upOwn[1] = String.valueOf(tmp);
        upOwn[2] = from;
        try{ Database.UpdateTable( upOwn , 2 ); }
        catch(SQLException e){ Database.printErr( e ); }
    }
    
    private void passButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passButtonActionPerformed
            tryToPass();
    }//GEN-LAST:event_passButtonActionPerformed

    private void tryToPass(){
        Database.queryOnTable("SELECT OFGAME FROM TURN WHERE CODTR = " + T);
        try{
            Database.rset.first();
            String codGm = Database.rset.getString(1);
            
            String []valWin = new String[3];        
            valWin[0] = "GAME SET WINNER = ? WHERE CODGM = ?";
            valWin[1] = currPl.getText();
            valWin[2] = codGm;
            Database.UpdateTable( valWin , 2 );
            
            Database.queryOnTable("SELECT WINNER FROM GAME WHERE CODGM = " + codGm);
            Database.rset.first();
            if( Database.rset.getString(1) != null ){
                if( Database.rset.getString(1).equals(currPl.getText()) ){
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Congratulazioni, "
                        + currPl.getText() + "\nHai vinto!" , "Vittoria!", 2);
                }
            }
            else
                passTurn( );
        }
        catch( SQLException e ){  Database.printErr( e ); }
    }
    
    private void passTurn( ){
        String []F = new String[2];
        F[0] = "next_turn( ? )";
        F[1] = T;
        String nextTurn = null;
        try{ nextTurn = Database.exeFunction( F , Types.NUMERIC , 1 ); }
        catch( SQLException e ){  Database.printErr( e ); }
        this.setVisible(false);
        Game.e = new Editor( type , nextTurn );
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String []upOwn = new String[3];
        upOwn[0] = "OWNERSHIP SET NUMARMIES = NUMARMIES + ? WHERE CODOWN = ?";
        upOwn[1] = "1";
        upOwn[2] = InitEditor.searchCod((String)ownerships.getSelectedItem() , selectOwns );
        try{ Database.UpdateTable( upOwn , 2 ); }
        catch(SQLException e){ Database.printErr( e ); }
        int numArmies = Integer.parseInt(numA.getText());
        numArmies--;
        numA.setText(String.valueOf(numArmies));
        if( numArmies < 1 ){
            /*FASE INIZIALE TERMINATA*/
            addButton.setEnabled(false);
            combinationButton.setEnabled(false);
            ownerships.setEnabled(false);
            
            /*INIZIALIZZAZIONE FASE BATTAGLIA*/
            initBattle();
            strike.setEnabled(true);
            defend.setEnabled(true);
            red1.setEnabled(true);
            blue1.setEnabled(true);
            
            /*INIZIALIZZAZIONE FASE FINALE*/
            passButton.setEnabled(true);
            initTransfert( fromTerr , " " );
            
            exit.setEnabled(false);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private String extractName( String currCard ){
        int i = 0;
        while( currCard.charAt(i) != ';' )
            i++;
        return currCard.substring( i+1 );
    }
    
    private void combinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combinationButtonActionPerformed
        String currCard1 = (String)card1.getSelectedItem();                                           
        String currCard2 = (String)card2.getSelectedItem();                                           
        String currCard3 = (String)card3.getSelectedItem();
        if( !currCard1.equals(currCard2) && !currCard1.equals(currCard3) && 
            !currCard2.equals(currCard1) && !currCard2.equals(currCard3) &&
            !currCard3.equals(currCard1) && !currCard3.equals(currCard2)){
            String tmpCard1 = extractName(currCard1);
            String tmpCard2 = extractName(currCard2);
            String tmpCard3 = extractName(currCard3);
            String where = "WHERE TCNAME = '" + tmpCard1 + "' OR TCNAME = '"
                    + tmpCard2 + "' OR TCNAME = '" + tmpCard3 + "'";
            try{
                Game.createMatrix("SELECT BONUS_T FROM TERRITORYCARD " + where +
                    " GROUP BY BONUS_T");
                String []CombCards = Game.getValues(1);
                int plus = getBonus( tmpCard1 , 0 , tot ) +
                    getBonus( tmpCard2 , 0 , tot ) + getBonus( tmpCard2 , 0 , tot );
                if( Game.nElem == 1 || (Game.nElem == 2 && jolly( CombCards , 0 , 2 ))
                        || (Game.nElem == 3 && !jolly( CombCards , 0 , 3 )) )
                        calculateBonus( CombCards , plus , Game.nElem );
                else
                    JOptionPane.showMessageDialog(this, "Combinazione non valida!", "Errore", 0);
            }
            catch(SQLException e){ Database.printErr(e); }
        }
        else
             JOptionPane.showMessageDialog(this, "Combinazione non valida!", "Errore", 0);
    }//GEN-LAST:event_combinationButtonActionPerformed

    private void fromTerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTerrActionPerformed
        String terr = (String)fromTerr.getSelectedItem();
        String union = "(SELECT TNAME2 FROM BORDER WHERE TNAME1 = '" +terr+ 
                "' UNION SELECT TNAME1 FROM BORDER WHERE TNAME2 = '" +terr+ "')";
        try{
            Game.createMatrix("SELECT TERRITORY, CODOWN FROM OWNERSHIP WHERE"
             +" OWNER = '" + currPl.getText() + "' AND TERRITORY IN" + union
             + " AND O_TURN = " + T);
        }
        catch(SQLException e){ Database.printErr(e); }
        toTerr.setModel(new javax.swing.DefaultComboBoxModel<>(Game.getValues(1)));
                
        if( setSpinnerArmies( SpinnerArmies2 , (String)fromTerr.getSelectedItem() ) ){
            transfertButton.setEnabled(true);
            toTerr.setEnabled(true);
        }
        else
            transfertButton.setEnabled(false);
    }//GEN-LAST:event_fromTerrActionPerformed

    private void transfertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfertButtonActionPerformed
        StartTransfert( SpinnerArmies2, 
            InitEditor.searchCod((String)fromTerr.getSelectedItem(), selectOwns),
            InitEditor.searchCod((String)toTerr.getSelectedItem(), selectOwns) );
        attackButton.setEnabled(false);
        transfertButton.setEnabled(false);
        fromTerr.setEnabled(false);
    }//GEN-LAST:event_transfertButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.setVisible(false);
        Home.setHome();
    }//GEN-LAST:event_exitMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

    }//GEN-LAST:event_exitActionPerformed

    private int getBonus( String tmp , int i , int max ){
        if( i == max )
            return 0;
        else if( totTerr[i].equals(tmp) )
            return 1;
        else
            return getBonus( tmp , i+1 , max );
    }
    
    private boolean jolly( String []values , int i , int n ){
        if( i<n ){
            if( values[i].equals("Jolly") )
                return true;
            else
                return jolly( values , i++ , n );
        }
        else
            return false;
    }
    
    private void calculateBonus( String []values , int plus , int n ){
        int bonus = 0;
        if(n == 1 || n == 2){
            int i = 0;
            if( values[0].equals("Jolly") )
                i = 1;
            if( values[i].equals("Cannone"))
                bonus = 4;
            if( values[i].equals("Fante"))
                bonus = 6;
            if( values[i].equals("Cavaliere"))
                bonus = 8;
        }
        else
            bonus = 10;
        bonus += (plus + Integer.parseInt(numA.getText()));
        numA.setText(String.valueOf(bonus));
        addButton.setEnabled(true);
    }
    
    private void enableDices( String [][]select , String currTerr , JComboBox x , JComboBox y ){
        int tmp = Integer.parseInt(searchValue( select , currTerr , 2 ));
        if( tmp > 2 )
            x.setEnabled(true);
        if( tmp > 3 )
            y.setEnabled(true);
    }
    
    private String searchValue( String [][]M , String value , int j ){
        int i; j--;
        for( i=0 ; !M[i][0].equals(value) ; i++ );
        return M[i][j];
    }
    
    private void initCombinations( ){
        String myCards = "(SELECT CARD FROM HAND WHERE H_TURN = " + T +
                " AND HOLDER = '"+ currPl.getText() + "')";
        try{ Game.createMatrix("SELECT BONUS_T, TCNAME FROM TERRITORYCARD"
                + " WHERE CODCARD IN" + myCards); }
        catch(SQLException e){ Database.printErr(e); }
        selectCards = Game.matrix;
        cmbCards = Game.getValues();
        card1.setModel(new javax.swing.DefaultComboBoxModel<>(cmbCards));
        card2.setModel(new javax.swing.DefaultComboBoxModel<>(cmbCards));
        card3.setModel(new javax.swing.DefaultComboBoxModel<>(cmbCards));
        if( card1.getSelectedItem() != null )
            combinationButton.setEnabled(true);
    }
    
    private int setTotTerr(){
        try{ Game.createMatrix("SELECT CODOWN, TERRITORY FROM OWNERSHIP"
              + " WHERE OWNER = '" + currPl.getText() + "' AND O_TURN = " + T); }
        catch(SQLException e){ Database.printErr(e); }
        selectOwns = Game.matrix;
        totTerr = Game.getValues(2);
        tot = Game.nElem;
        return Game.nElem/3;
    }
    
    private void initBattle( ){
        try{
            Game.createMatrix("SELECT TERRITORY, NUMARMIES, CODOWN FROM OWNERSHIP"
               + " WHERE OWNER = '" + currPl.getText() + "' AND NUMARMIES > 1"
               + " AND O_TURN = " + T);
            selectStrk = Game.matrix;
            strike.setModel(new javax.swing.DefaultComboBoxModel<>(Game.getValues(1)));                
        }
        catch(SQLException e){ Database.printErr(e); }
        
        /*INIZIALIZZAZIONE DADI*/
        if( type ){
            red1_t = new javax.swing.DefaultComboBoxModel<>(dice1Simulate);
            red2_t = new javax.swing.DefaultComboBoxModel<>(dice2Simulate);
            red3_t = new javax.swing.DefaultComboBoxModel<>(dice2Simulate);
            blue1_t = new javax.swing.DefaultComboBoxModel<>(dice1Simulate);
            blue2_t = new javax.swing.DefaultComboBoxModel<>(dice1Simulate);
            blue3_t = new javax.swing.DefaultComboBoxModel<>(dice1Simulate);
            
        }
        else{

            red1_t = new javax.swing.DefaultComboBoxModel<>(dice1Manual);
            red2_t = new javax.swing.DefaultComboBoxModel<>(dice2Manual);
            red3_t = new javax.swing.DefaultComboBoxModel<>(dice2Manual);
            blue1_t = new javax.swing.DefaultComboBoxModel<>(dice1Manual);
            blue2_t = new javax.swing.DefaultComboBoxModel<>(dice1Manual);
            blue3_t = new javax.swing.DefaultComboBoxModel<>(dice1Manual);
        }
        red1.setModel(red1_t);
        red2.setModel(red2_t);
        red3.setModel(red3_t);
        blue1.setModel(blue1_t);
        blue2.setModel(blue2_t);
        blue3.setModel(blue3_t);
    }
    
    private boolean strikerWins(){
        Database.queryOnTable("SELECT CODOWN FROM OWNERSHIP WHERE O_TURN = " + T +
            " AND TERRITORY = '" + (String)defend.getSelectedItem() + 
            "' AND OWNER = '" + currPl.getText() + "'");
        try{
            if( Database.rset.first() ){
                newOwn = Database.rset.getString(1);
                oldOwn = searchValue( selectStrk, (String)strike.getSelectedItem(), 3 );
                return true;
            }
        }
        catch(SQLException e){ Database.printErr( e ); }
        return false;
    }
    
    private void initTransfert( JComboBox myTerr , String currTerr ){
        try{ Game.createMatrix("SELECT TERRITORY FROM OWNERSHIP WHERE O_TURN = " + T +
            " AND OWNER = '" + currPl.getText() + "' AND TERRITORY <> '" + currTerr + "'"); }
        catch(SQLException e){ Database.printErr( e ); }
        myTerr.setModel(new javax.swing.DefaultComboBoxModel<>(Game.getValues(1)));
        myTerr.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerArmies1;
    private javax.swing.JSpinner SpinnerArmies2;
    private javax.swing.JButton addButton;
    private javax.swing.JButton attackButton;
    private javax.swing.JComboBox<String> blue1;
    private javax.swing.JComboBox<String> blue2;
    private javax.swing.JComboBox<String> blue3;
    private javax.swing.JComboBox<String> card1;
    private javax.swing.JComboBox<String> card2;
    private javax.swing.JComboBox<String> card3;
    private javax.swing.JButton combinationButton;
    private javax.swing.JLabel currDef;
    private javax.swing.JLabel currPl;
    private javax.swing.JLabel currPl2;
    private javax.swing.JLabel currStr;
    private javax.swing.JLabel currStr1;
    private javax.swing.JLabel currStr2;
    private javax.swing.JLabel currStr3;
    private javax.swing.JComboBox<String> defend;
    private javax.swing.JComboBox<String> draw;
    private javax.swing.JButton drawButton;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> fromTerr;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelWin;
    private javax.swing.JLabel numA;
    private javax.swing.JComboBox<String> ownerships;
    private javax.swing.JButton passButton;
    private javax.swing.JComboBox<String> red1;
    private javax.swing.JComboBox<String> red2;
    private javax.swing.JComboBox<String> red3;
    private javax.swing.JComboBox<String> strike;
    private javax.swing.JComboBox<String> toTerr;
    private javax.swing.JButton transfertButton;
    // End of variables declaration//GEN-END:variables
}
