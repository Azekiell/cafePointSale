
package cafe_pointofsale;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cappuccinoBtns = new javax.swing.ButtonGroup();
        americanoBtns = new javax.swing.ButtonGroup();
        espressoBtns = new javax.swing.ButtonGroup();
        cMacchiatoBtns = new javax.swing.ButtonGroup();
        iCoffeeBtns = new javax.swing.ButtonGroup();
        cCreamBtns = new javax.swing.ButtonGroup();
        dDelightBtns = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cappuccino = new javax.swing.JCheckBox();
        Americano = new javax.swing.JCheckBox();
        Espresso = new javax.swing.JCheckBox();
        macchiato = new javax.swing.JCheckBox();
        caramelC = new javax.swing.JCheckBox();
        decafD = new javax.swing.JCheckBox();
        iceCoffee = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cSmall = new javax.swing.JCheckBox();
        aSmall = new javax.swing.JCheckBox();
        eSmall = new javax.swing.JCheckBox();
        cMSmall = new javax.swing.JCheckBox();
        ccSmall = new javax.swing.JCheckBox();
        ddSmall = new javax.swing.JCheckBox();
        icSmall = new javax.swing.JCheckBox();
        cMedium = new javax.swing.JCheckBox();
        aMedium = new javax.swing.JCheckBox();
        eMedium = new javax.swing.JCheckBox();
        cmMedium = new javax.swing.JCheckBox();
        ccMedium = new javax.swing.JCheckBox();
        ddMedium = new javax.swing.JCheckBox();
        icMedium = new javax.swing.JCheckBox();
        cLarge = new javax.swing.JCheckBox();
        aLarge = new javax.swing.JCheckBox();
        eLarge = new javax.swing.JCheckBox();
        cMLarge = new javax.swing.JCheckBox();
        ccLarge = new javax.swing.JCheckBox();
        ddLarge = new javax.swing.JCheckBox();
        icLarge = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Menu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 90, 70, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("TnC Cafe");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Since 2024");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Coffee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Foods");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        cappuccino.setBackground(new java.awt.Color(51, 51, 51));
        cappuccino.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cappuccino.setForeground(new java.awt.Color(255, 255, 255));
        cappuccino.setText("Cappuccino");
        cappuccino.setContentAreaFilled(false);
        cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappuccinoActionPerformed(evt);
            }
        });
        jPanel1.add(cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Americano.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Americano.setForeground(new java.awt.Color(255, 255, 255));
        Americano.setText("Americano");
        Americano.setContentAreaFilled(false);
        Americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmericanoActionPerformed(evt);
            }
        });
        jPanel1.add(Americano, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        Espresso.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Espresso.setForeground(new java.awt.Color(255, 255, 255));
        Espresso.setText("Espresso");
        Espresso.setContentAreaFilled(false);
        Espresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspressoActionPerformed(evt);
            }
        });
        jPanel1.add(Espresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        macchiato.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        macchiato.setForeground(new java.awt.Color(255, 255, 255));
        macchiato.setText("Caffe Macchiato");
        macchiato.setContentAreaFilled(false);
        macchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macchiatoActionPerformed(evt);
            }
        });
        jPanel1.add(macchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        caramelC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        caramelC.setForeground(new java.awt.Color(255, 255, 255));
        caramelC.setText("Caramel Cream");
        caramelC.setContentAreaFilled(false);
        caramelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramelCActionPerformed(evt);
            }
        });
        jPanel1.add(caramelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        decafD.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        decafD.setForeground(new java.awt.Color(255, 255, 255));
        decafD.setText("Decaf Delight");
        decafD.setContentAreaFilled(false);
        decafD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decafDActionPerformed(evt);
            }
        });
        jPanel1.add(decafD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        iceCoffee.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        iceCoffee.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffee.setText("Iced Coffee");
        iceCoffee.setContentAreaFilled(false);
        iceCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceCoffeeActionPerformed(evt);
            }
        });
        jPanel1.add(iceCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Fries");
        jCheckBox8.setContentAreaFilled(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Popcorn");
        jCheckBox9.setContentAreaFilled(false);
        jPanel1.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jCheckBox10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Sandwitch");
        jCheckBox10.setContentAreaFilled(false);
        jPanel1.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jCheckBox11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Donuts");
        jCheckBox11.setContentAreaFilled(false);
        jPanel1.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jCheckBox12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Cookies");
        jCheckBox12.setContentAreaFilled(false);
        jPanel1.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("Small");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("Medium");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("Large");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        cappuccinoBtns.add(cSmall);
        cSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cSmall.setForeground(new java.awt.Color(255, 255, 255));
        cSmall.setText("₱70.00");
        cSmall.setContentAreaFilled(false);
        cSmall.setEnabled(false);
        jPanel1.add(cSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        americanoBtns.add(aSmall);
        aSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        aSmall.setForeground(new java.awt.Color(255, 255, 255));
        aSmall.setText("₱40.00");
        aSmall.setContentAreaFilled(false);
        aSmall.setEnabled(false);
        aSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSmallActionPerformed(evt);
            }
        });
        jPanel1.add(aSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        espressoBtns.add(eSmall);
        eSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        eSmall.setForeground(new java.awt.Color(255, 255, 255));
        eSmall.setText("₱75.00");
        eSmall.setContentAreaFilled(false);
        eSmall.setEnabled(false);
        jPanel1.add(eSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        cMacchiatoBtns.add(cMSmall);
        cMSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cMSmall.setForeground(new java.awt.Color(255, 255, 255));
        cMSmall.setText("₱90.00");
        cMSmall.setContentAreaFilled(false);
        cMSmall.setEnabled(false);
        jPanel1.add(cMSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        cCreamBtns.add(ccSmall);
        ccSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ccSmall.setForeground(new java.awt.Color(255, 255, 255));
        ccSmall.setText("₱70.00");
        ccSmall.setContentAreaFilled(false);
        ccSmall.setEnabled(false);
        jPanel1.add(ccSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        dDelightBtns.add(ddSmall);
        ddSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ddSmall.setForeground(new java.awt.Color(255, 255, 255));
        ddSmall.setText("₱35.00");
        ddSmall.setContentAreaFilled(false);
        ddSmall.setEnabled(false);
        jPanel1.add(ddSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        iCoffeeBtns.add(icSmall);
        icSmall.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        icSmall.setForeground(new java.awt.Color(255, 255, 255));
        icSmall.setText("₱40.00");
        icSmall.setContentAreaFilled(false);
        icSmall.setEnabled(false);
        jPanel1.add(icSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        cappuccinoBtns.add(cMedium);
        cMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cMedium.setForeground(new java.awt.Color(255, 255, 255));
        cMedium.setText("₱120.00");
        cMedium.setContentAreaFilled(false);
        cMedium.setEnabled(false);
        jPanel1.add(cMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        americanoBtns.add(aMedium);
        aMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        aMedium.setForeground(new java.awt.Color(255, 255, 255));
        aMedium.setText("₱90.00");
        aMedium.setContentAreaFilled(false);
        aMedium.setEnabled(false);
        jPanel1.add(aMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        espressoBtns.add(eMedium);
        eMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        eMedium.setForeground(new java.awt.Color(255, 255, 255));
        eMedium.setText("₱125.00");
        eMedium.setContentAreaFilled(false);
        eMedium.setEnabled(false);
        jPanel1.add(eMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        cMacchiatoBtns.add(cmMedium);
        cmMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cmMedium.setForeground(new java.awt.Color(255, 255, 255));
        cmMedium.setText("₱135.00");
        cmMedium.setContentAreaFilled(false);
        cmMedium.setEnabled(false);
        jPanel1.add(cmMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        cCreamBtns.add(ccMedium);
        ccMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ccMedium.setForeground(new java.awt.Color(255, 255, 255));
        ccMedium.setText("₱115.00");
        ccMedium.setContentAreaFilled(false);
        ccMedium.setEnabled(false);
        jPanel1.add(ccMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        dDelightBtns.add(ddMedium);
        ddMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ddMedium.setForeground(new java.awt.Color(255, 255, 255));
        ddMedium.setText("₱50.00");
        ddMedium.setContentAreaFilled(false);
        ddMedium.setEnabled(false);
        jPanel1.add(ddMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        iCoffeeBtns.add(icMedium);
        icMedium.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        icMedium.setForeground(new java.awt.Color(255, 255, 255));
        icMedium.setText("₱60.00");
        icMedium.setContentAreaFilled(false);
        icMedium.setEnabled(false);
        jPanel1.add(icMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        cappuccinoBtns.add(cLarge);
        cLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cLarge.setForeground(new java.awt.Color(255, 255, 255));
        cLarge.setText("₱155.00");
        cLarge.setContentAreaFilled(false);
        cLarge.setEnabled(false);
        jPanel1.add(cLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        americanoBtns.add(aLarge);
        aLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        aLarge.setForeground(new java.awt.Color(255, 255, 255));
        aLarge.setText("₱120.00");
        aLarge.setContentAreaFilled(false);
        aLarge.setEnabled(false);
        jPanel1.add(aLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        espressoBtns.add(eLarge);
        eLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        eLarge.setForeground(new java.awt.Color(255, 255, 255));
        eLarge.setText("₱170.00");
        eLarge.setContentAreaFilled(false);
        eLarge.setEnabled(false);
        jPanel1.add(eLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        cMacchiatoBtns.add(cMLarge);
        cMLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cMLarge.setForeground(new java.awt.Color(255, 255, 255));
        cMLarge.setText("₱185.00");
        cMLarge.setContentAreaFilled(false);
        cMLarge.setEnabled(false);
        jPanel1.add(cMLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        cCreamBtns.add(ccLarge);
        ccLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ccLarge.setForeground(new java.awt.Color(255, 255, 255));
        ccLarge.setText("₱150.00");
        ccLarge.setContentAreaFilled(false);
        ccLarge.setEnabled(false);
        jPanel1.add(ccLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        dDelightBtns.add(ddLarge);
        ddLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ddLarge.setForeground(new java.awt.Color(255, 255, 255));
        ddLarge.setText("₱70.00");
        ddLarge.setContentAreaFilled(false);
        ddLarge.setEnabled(false);
        jPanel1.add(ddLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        iCoffeeBtns.add(icLarge);
        icLarge.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        icLarge.setForeground(new java.awt.Color(255, 255, 255));
        icLarge.setText("₱75.00");
        icLarge.setContentAreaFilled(false);
        icLarge.setEnabled(false);
        jPanel1.add(icLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jCheckBox34.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox34.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setText("₱70.00");
        jCheckBox34.setContentAreaFilled(false);
        jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox34ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jCheckBox35.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox35.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setText("₱70.00");
        jCheckBox35.setContentAreaFilled(false);
        jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox35ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jCheckBox36.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox36.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setText("₱70.00");
        jCheckBox36.setContentAreaFilled(false);
        jPanel1.add(jCheckBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabel8.setText("₱70.00");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel9.setText("₱70.00");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel10.setText("₱70.00");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabel11.setText("₱70.00");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe_pointofsale/image & icons/Menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(614, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aSmallActionPerformed

    private void cappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappuccinoActionPerformed
        if(cappuccino.isSelected()){
            cSmall.setEnabled(true);
            cMedium.setEnabled(true);
            cLarge.setEnabled(true);
        }else{
            cSmall.setEnabled(false);
            cMedium.setEnabled(false);
            cLarge.setEnabled(false);
        }
    }//GEN-LAST:event_cappuccinoActionPerformed

    private void AmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmericanoActionPerformed
      if(Americano.isSelected()){
            aSmall.setEnabled(true);
            aMedium.setEnabled(true);
            aLarge.setEnabled(true);
        }else{
            aSmall.setEnabled(false);
            aMedium.setEnabled(false);
            aLarge.setEnabled(false);
        }
    }//GEN-LAST:event_AmericanoActionPerformed

    private void EspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspressoActionPerformed
       if(Espresso.isSelected()){
            eSmall.setEnabled(true);
            eMedium.setEnabled(true);
            eLarge.setEnabled(true);
        }else{
            eSmall.setEnabled(false);
            eMedium.setEnabled(false);
            eLarge.setEnabled(false);
        }
    }//GEN-LAST:event_EspressoActionPerformed

    private void macchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macchiatoActionPerformed
        if(macchiato.isSelected()){
            cMSmall.setEnabled(true);
            cmMedium.setEnabled(true);
            cMLarge.setEnabled(true);
        }else{
            cMSmall.setEnabled(false);
            cmMedium.setEnabled(false);
            cMLarge.setEnabled(false);
        }
    }//GEN-LAST:event_macchiatoActionPerformed

    private void caramelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramelCActionPerformed
 if(caramelC.isSelected()){
            ccSmall.setEnabled(true);
            ccMedium.setEnabled(true);
            ccLarge.setEnabled(true);
        }else{
            ccSmall.setEnabled(false);
            ccMedium.setEnabled(false);
            ccLarge.setEnabled(false);
        }    }//GEN-LAST:event_caramelCActionPerformed

    private void decafDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decafDActionPerformed
        if(decafD.isSelected()){
            ddSmall.setEnabled(true);
            ddMedium.setEnabled(true);
            ddLarge.setEnabled(true);
        }else{
            ddSmall.setEnabled(false);
            ddMedium.setEnabled(false);
            ddLarge.setEnabled(false);
        }
    }//GEN-LAST:event_decafDActionPerformed

    private void iceCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceCoffeeActionPerformed
        if(iceCoffee.isSelected()){
            icSmall.setEnabled(true);
           icMedium.setEnabled(true);
            icLarge.setEnabled(true);
        }else{
            icSmall.setEnabled(false);
            icMedium.setEnabled(false);
            icLarge.setEnabled(false);
        }
    }//GEN-LAST:event_iceCoffeeActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox34ActionPerformed

    private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox35ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Order o = new Order();
    o.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Americano;
    private javax.swing.JCheckBox Espresso;
    private javax.swing.JCheckBox aLarge;
    private javax.swing.JCheckBox aMedium;
    private javax.swing.JCheckBox aSmall;
    private javax.swing.ButtonGroup americanoBtns;
    private javax.swing.ButtonGroup cCreamBtns;
    private javax.swing.JCheckBox cLarge;
    private javax.swing.JCheckBox cMLarge;
    private javax.swing.JCheckBox cMSmall;
    private javax.swing.ButtonGroup cMacchiatoBtns;
    private javax.swing.JCheckBox cMedium;
    private javax.swing.JCheckBox cSmall;
    private javax.swing.JCheckBox cappuccino;
    private javax.swing.ButtonGroup cappuccinoBtns;
    private javax.swing.JCheckBox caramelC;
    private javax.swing.JCheckBox ccLarge;
    private javax.swing.JCheckBox ccMedium;
    private javax.swing.JCheckBox ccSmall;
    private javax.swing.JCheckBox cmMedium;
    private javax.swing.ButtonGroup dDelightBtns;
    private javax.swing.JCheckBox ddLarge;
    private javax.swing.JCheckBox ddMedium;
    private javax.swing.JCheckBox ddSmall;
    private javax.swing.JCheckBox decafD;
    private javax.swing.JCheckBox eLarge;
    private javax.swing.JCheckBox eMedium;
    private javax.swing.JCheckBox eSmall;
    private javax.swing.ButtonGroup espressoBtns;
    private javax.swing.ButtonGroup iCoffeeBtns;
    private javax.swing.JCheckBox icLarge;
    private javax.swing.JCheckBox icMedium;
    private javax.swing.JCheckBox icSmall;
    private javax.swing.JCheckBox iceCoffee;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox macchiato;
    // End of variables declaration//GEN-END:variables
}
