
package Main;

import Functions.Order;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    DefaultTableModel table;
    int tableRow = 0;
    String item[] = new String[99];
    int count[] = new int[99];
    int size[] = new int[99];
    double price[] = new double[99];
    int j = 0;
    
    public Menu() {
        initComponents();
        table = new DefaultTableModel(new String[]{"Item", "Price"}, 0);
        jTable2.setModel(table);
    }

    public int setTable(String name, boolean isAdding){
        for(int i = 0; i < item.length; i++){
            if(item[i] == name){
                String t = table.getValueAt(i, 0).toString();
                if(count[i] == 1 && !isAdding){
                    item[i] = null;
                    count[i] = 0;
                    table.removeRow(i);
                }else{
                    if(isAdding){
                        count[i]++;
                    }else{
                        count[i]--;
                    }
                    table.setValueAt(name +" x " +count[i], i, 0);
                }
                return 0;
            }else if(item[i] == null){
                item[i] = name;
                table.setRowCount(i+1);
                count[i]++;
                table.setValueAt(name +" x " +count[i], i, 0);
                j++;
                return 0;
            }
        }
        System.out.println(table.getRowCount());
        System.out.println(item[0]);
        return 0;
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
        menuLabell = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        itemSelection = new javax.swing.JPanel();
        headerPriceSmall = new javax.swing.JLabel();
        headerPriceMedium = new javax.swing.JLabel();
        headerPriceLarge = new javax.swing.JLabel();
        Espresso = new javax.swing.JCheckBox();
        espressoSmallAdd = new javax.swing.JLabel();
        espressoSmallSubtract = new javax.swing.JLabel();
        espressoMediumAdd = new javax.swing.JLabel();
        espressoMediumSubtract = new javax.swing.JLabel();
        espresssoLargeAdd = new javax.swing.JLabel();
        espresssoLargeSubtract = new javax.swing.JLabel();
        espressoPriceSmall = new javax.swing.JLabel();
        espressoPriceMedium = new javax.swing.JLabel();
        espressoPriceLarge = new javax.swing.JLabel();
        Americano = new javax.swing.JCheckBox();
        americanoSmallAdd = new javax.swing.JLabel();
        americanoSmallSubtract = new javax.swing.JLabel();
        americanoPriceSmall = new javax.swing.JLabel();
        americanoMediumAdd = new javax.swing.JLabel();
        americanoMediumSubtract = new javax.swing.JLabel();
        americanoPriceMedium = new javax.swing.JLabel();
        americanoLargeAdd = new javax.swing.JLabel();
        americanoLargeSubtract = new javax.swing.JLabel();
        americanoPriceLarge = new javax.swing.JLabel();
        cappuccino = new javax.swing.JCheckBox();
        cappuccinoSmallAdd = new javax.swing.JLabel();
        cappuccinoSmallSubtract = new javax.swing.JLabel();
        cappuccinoMediumAdd = new javax.swing.JLabel();
        cappuccinoMediumSubtract = new javax.swing.JLabel();
        cappuccinoPriceMedium = new javax.swing.JLabel();
        cappuccinoLargeAdd = new javax.swing.JLabel();
        cappuccinoLargeSubtract = new javax.swing.JLabel();
        cappuccinoPriceLarge = new javax.swing.JLabel();
        cappuccinoPriceSmall = new javax.swing.JLabel();
        macchiato = new javax.swing.JCheckBox();
        macchiatoSmallAdd = new javax.swing.JLabel();
        macchiatoSmallSubtract = new javax.swing.JLabel();
        macchiatoPriceSmall = new javax.swing.JLabel();
        macchiatoMediumAdd = new javax.swing.JLabel();
        macchiatoMediumSubtract = new javax.swing.JLabel();
        macchiatoPriceMedium = new javax.swing.JLabel();
        macchiatoLargeAdd = new javax.swing.JLabel();
        macchiatoLargeSubtract = new javax.swing.JLabel();
        macchiatoPriceLarge = new javax.swing.JLabel();
        caramelC = new javax.swing.JCheckBox();
        caramelCPriceLarge = new javax.swing.JLabel();
        caramelCSmallAdd = new javax.swing.JLabel();
        caramelCSmallSubtract = new javax.swing.JLabel();
        caramelCPriceSmall = new javax.swing.JLabel();
        caramelCMediumAdd = new javax.swing.JLabel();
        caramelCMediumSubtract = new javax.swing.JLabel();
        caramelCPriceMedium = new javax.swing.JLabel();
        caramelCLargeAdd = new javax.swing.JLabel();
        caramelCLargeSubtract = new javax.swing.JLabel();
        decafD = new javax.swing.JCheckBox();
        decafDSmallAdd = new javax.swing.JLabel();
        decafDSmallSubtract = new javax.swing.JLabel();
        decafDPriceSmall = new javax.swing.JLabel();
        decafDMediumAdd = new javax.swing.JLabel();
        decafDMediumSubtract = new javax.swing.JLabel();
        decafDPriceMedium = new javax.swing.JLabel();
        decafDLargeAdd = new javax.swing.JLabel();
        decafDLargeSubtract = new javax.swing.JLabel();
        decafDPriceLarge = new javax.swing.JLabel();
        iceCoffee = new javax.swing.JCheckBox();
        iceCoffeeSmallSubtract = new javax.swing.JLabel();
        iceCoffeePriceSmall = new javax.swing.JLabel();
        iceCoffeeSmallAdd = new javax.swing.JLabel();
        iceCoffeeMediumAdd = new javax.swing.JLabel();
        iceCoffeeMediumSubtract = new javax.swing.JLabel();
        iceCoffeePriceMedium = new javax.swing.JLabel();
        iceCoffeeLargeAdd = new javax.swing.JLabel();
        iceCoffeeLargeSubtract = new javax.swing.JLabel();
        iceCoffeePriceLarge = new javax.swing.JLabel();
        cheesecakePrice = new javax.swing.JLabel();
        croissantPrice = new javax.swing.JLabel();
        browniesPrice = new javax.swing.JLabel();
        strawBerryPrice = new javax.swing.JLabel();
        chocolatePrice = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBox11 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 539));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabell.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menuLabell.setForeground(new java.awt.Color(255, 153, 0));
        menuLabell.setText("Menu");
        jPanel1.add(menuLabell, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 90, 70, 20));

        header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 102, 0));
        header.setText("TnC Cafe");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("Since 2024");
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        itemSelection.setBackground(new java.awt.Color(0, 0, 0, 0));
        itemSelection.setOpaque(false);
        itemSelection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPriceSmall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        headerPriceSmall.setForeground(new java.awt.Color(255, 102, 0));
        headerPriceSmall.setText("Small");
        itemSelection.add(headerPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        headerPriceMedium.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        headerPriceMedium.setForeground(new java.awt.Color(255, 102, 0));
        headerPriceMedium.setText("Medium");
        itemSelection.add(headerPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        headerPriceLarge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        headerPriceLarge.setForeground(new java.awt.Color(255, 102, 0));
        headerPriceLarge.setText("Large");
        itemSelection.add(headerPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        Espresso.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Espresso.setForeground(new java.awt.Color(255, 255, 255));
        Espresso.setText("Espresso");
        Espresso.setContentAreaFilled(false);
        Espresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspressoActionPerformed(evt);
            }
        });
        itemSelection.add(Espresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        espressoSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        espressoSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espressoSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        espressoSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espressoSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        espressoSmallAdd.setOpaque(true);
        espressoSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                espressoSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(espressoSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 15, 15));

        espressoSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        espressoSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espressoSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        espressoSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espressoSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        espressoSmallSubtract.setOpaque(true);
        espressoSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                espressoSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(espressoSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 15, 15));

        espressoMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        espressoMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espressoMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        espressoMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espressoMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        espressoMediumAdd.setOpaque(true);
        itemSelection.add(espressoMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 15, 15));

        espressoMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        espressoMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espressoMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        espressoMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espressoMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        espressoMediumSubtract.setOpaque(true);
        itemSelection.add(espressoMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 15, 15));

        espresssoLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        espresssoLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espresssoLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        espresssoLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espresssoLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        espresssoLargeAdd.setOpaque(true);
        itemSelection.add(espresssoLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 15, 15));

        espresssoLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        espresssoLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        espresssoLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        espresssoLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espresssoLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        espresssoLargeSubtract.setOpaque(true);
        itemSelection.add(espresssoLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 15, 15));

        espressoPriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        espressoPriceSmall.setText("₱75.00");
        itemSelection.add(espressoPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        espressoPriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        espressoPriceMedium.setText("₱95.00");
        itemSelection.add(espressoPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        espressoPriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        espressoPriceLarge.setText("₱125.00");
        itemSelection.add(espressoPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        Americano.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Americano.setForeground(new java.awt.Color(255, 255, 255));
        Americano.setText("Americano");
        Americano.setContentAreaFilled(false);
        itemSelection.add(Americano, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        americanoSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        americanoSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        americanoSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        americanoSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        americanoSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        americanoSmallAdd.setOpaque(true);
        americanoSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                americanoSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(americanoSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 15, 15));

        americanoSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        americanoSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        americanoSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        americanoSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        americanoSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        americanoSmallSubtract.setOpaque(true);
        americanoSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                americanoSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(americanoSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 15, 15));

        americanoPriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        americanoPriceSmall.setText("₱75.00");
        itemSelection.add(americanoPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        americanoMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        americanoMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        americanoMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        americanoMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        americanoMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        americanoMediumAdd.setOpaque(true);
        itemSelection.add(americanoMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 15, 15));

        americanoMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        americanoMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        americanoMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        americanoMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        americanoMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        americanoMediumSubtract.setOpaque(true);
        itemSelection.add(americanoMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 15, 15));

        americanoPriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        americanoPriceMedium.setText("₱95.00");
        itemSelection.add(americanoPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        americanoLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        americanoLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        americanoLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        americanoLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        americanoLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        americanoLargeAdd.setOpaque(true);
        itemSelection.add(americanoLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 15, 15));

        americanoLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        americanoLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        americanoLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        americanoLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        americanoLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        americanoLargeSubtract.setOpaque(true);
        itemSelection.add(americanoLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 15, 15));

        americanoPriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        americanoPriceLarge.setText("₱125.00");
        itemSelection.add(americanoPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        cappuccino.setBackground(new java.awt.Color(51, 51, 51));
        cappuccino.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cappuccino.setForeground(new java.awt.Color(255, 255, 255));
        cappuccino.setText("Cappuccino");
        cappuccino.setContentAreaFilled(false);
        itemSelection.add(cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        cappuccinoSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        cappuccinoSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cappuccinoSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccinoSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        cappuccinoSmallAdd.setOpaque(true);
        cappuccinoSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cappuccinoSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(cappuccinoSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 15, 15));

        cappuccinoSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        cappuccinoSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cappuccinoSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccinoSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        cappuccinoSmallSubtract.setOpaque(true);
        cappuccinoSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cappuccinoSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(cappuccinoSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 15, 15));

        cappuccinoMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        cappuccinoMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cappuccinoMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccinoMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        cappuccinoMediumAdd.setOpaque(true);
        itemSelection.add(cappuccinoMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 15, 15));

        cappuccinoMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        cappuccinoMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cappuccinoMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccinoMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        cappuccinoMediumSubtract.setOpaque(true);
        itemSelection.add(cappuccinoMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 15, 15));

        cappuccinoPriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoPriceMedium.setText("₱95.00");
        itemSelection.add(cappuccinoPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        cappuccinoLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        cappuccinoLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cappuccinoLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccinoLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        cappuccinoLargeAdd.setOpaque(true);
        itemSelection.add(cappuccinoLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 15, 15));

        cappuccinoLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        cappuccinoLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cappuccinoLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cappuccinoLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        cappuccinoLargeSubtract.setOpaque(true);
        itemSelection.add(cappuccinoLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 15, 15));

        cappuccinoPriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoPriceLarge.setText("₱125.00");
        itemSelection.add(cappuccinoPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        cappuccinoPriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        cappuccinoPriceSmall.setText("₱75.00");
        itemSelection.add(cappuccinoPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        macchiato.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        macchiato.setForeground(new java.awt.Color(255, 255, 255));
        macchiato.setText("Caffe Macchiato");
        macchiato.setContentAreaFilled(false);
        itemSelection.add(macchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        macchiatoSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        macchiatoSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macchiatoSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        macchiatoSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        macchiatoSmallAdd.setOpaque(true);
        macchiatoSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                macchiatoSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(macchiatoSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 15, 15));

        macchiatoSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        macchiatoSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macchiatoSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        macchiatoSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        macchiatoSmallSubtract.setOpaque(true);
        macchiatoSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                macchiatoSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(macchiatoSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 15, 15));

        macchiatoPriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoPriceSmall.setText("₱75.00");
        itemSelection.add(macchiatoPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        macchiatoMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        macchiatoMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macchiatoMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        macchiatoMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        macchiatoMediumAdd.setOpaque(true);
        itemSelection.add(macchiatoMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 15, 15));

        macchiatoMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        macchiatoMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macchiatoMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        macchiatoMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        macchiatoMediumSubtract.setOpaque(true);
        itemSelection.add(macchiatoMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 15, 15));

        macchiatoPriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoPriceMedium.setText("₱95.00");
        itemSelection.add(macchiatoPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        macchiatoLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        macchiatoLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macchiatoLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        macchiatoLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        macchiatoLargeAdd.setOpaque(true);
        itemSelection.add(macchiatoLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 15, 15));

        macchiatoLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        macchiatoLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macchiatoLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        macchiatoLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        macchiatoLargeSubtract.setOpaque(true);
        itemSelection.add(macchiatoLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 15, 15));

        macchiatoPriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        macchiatoPriceLarge.setText("₱125.00");
        itemSelection.add(macchiatoPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        caramelC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        caramelC.setForeground(new java.awt.Color(255, 255, 255));
        caramelC.setText("Caramel Cream");
        caramelC.setContentAreaFilled(false);
        itemSelection.add(caramelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        caramelCPriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        caramelCPriceLarge.setText("₱125.00");
        itemSelection.add(caramelCPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        caramelCSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        caramelCSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caramelCSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        caramelCSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caramelCSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        caramelCSmallAdd.setOpaque(true);
        caramelCSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caramelCSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(caramelCSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 15, 15));

        caramelCSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        caramelCSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caramelCSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        caramelCSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caramelCSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        caramelCSmallSubtract.setOpaque(true);
        caramelCSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caramelCSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(caramelCSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 15, 15));

        caramelCPriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        caramelCPriceSmall.setText("₱75.00");
        itemSelection.add(caramelCPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        caramelCMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        caramelCMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caramelCMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        caramelCMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caramelCMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        caramelCMediumAdd.setOpaque(true);
        itemSelection.add(caramelCMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 15, 15));

        caramelCMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        caramelCMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caramelCMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        caramelCMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caramelCMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        caramelCMediumSubtract.setOpaque(true);
        itemSelection.add(caramelCMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 15, 15));

        caramelCPriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        caramelCPriceMedium.setText("₱95.00");
        itemSelection.add(caramelCPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        caramelCLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        caramelCLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caramelCLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        caramelCLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caramelCLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        caramelCLargeAdd.setOpaque(true);
        itemSelection.add(caramelCLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 15, 15));

        caramelCLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        caramelCLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caramelCLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        caramelCLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caramelCLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        caramelCLargeSubtract.setOpaque(true);
        itemSelection.add(caramelCLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 15, 15));

        decafD.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        decafD.setForeground(new java.awt.Color(255, 255, 255));
        decafD.setText("Decaf Delight");
        decafD.setContentAreaFilled(false);
        itemSelection.add(decafD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        decafDSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        decafDSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decafDSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        decafDSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decafDSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        decafDSmallAdd.setOpaque(true);
        decafDSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decafDSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(decafDSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 15, 15));

        decafDSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        decafDSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decafDSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        decafDSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decafDSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        decafDSmallSubtract.setOpaque(true);
        decafDSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decafDSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(decafDSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 15, 15));

        decafDPriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        decafDPriceSmall.setText("₱75.00");
        itemSelection.add(decafDPriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        decafDMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        decafDMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decafDMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        decafDMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decafDMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        decafDMediumAdd.setOpaque(true);
        itemSelection.add(decafDMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 15, 15));

        decafDMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        decafDMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decafDMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        decafDMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decafDMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        decafDMediumSubtract.setOpaque(true);
        itemSelection.add(decafDMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 15, 15));

        decafDPriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        decafDPriceMedium.setText("₱95.00");
        itemSelection.add(decafDPriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        decafDLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        decafDLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decafDLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        decafDLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decafDLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        decafDLargeAdd.setOpaque(true);
        itemSelection.add(decafDLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 15, 15));

        decafDLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        decafDLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decafDLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        decafDLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        decafDLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        decafDLargeSubtract.setOpaque(true);
        itemSelection.add(decafDLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 15, 15));

        decafDPriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        decafDPriceLarge.setText("₱125.00");
        itemSelection.add(decafDPriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        iceCoffee.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        iceCoffee.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffee.setText("Iced Coffee");
        iceCoffee.setContentAreaFilled(false);
        itemSelection.add(iceCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        iceCoffeeSmallSubtract.setBackground(new java.awt.Color(204, 0, 0));
        iceCoffeeSmallSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iceCoffeeSmallSubtract.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeeSmallSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCoffeeSmallSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        iceCoffeeSmallSubtract.setOpaque(true);
        iceCoffeeSmallSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iceCoffeeSmallSubtractMouseClicked(evt);
            }
        });
        itemSelection.add(iceCoffeeSmallSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 15, 15));

        iceCoffeePriceSmall.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeePriceSmall.setText("₱75.00");
        itemSelection.add(iceCoffeePriceSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        iceCoffeeSmallAdd.setBackground(new java.awt.Color(0, 153, 0));
        iceCoffeeSmallAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iceCoffeeSmallAdd.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeeSmallAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCoffeeSmallAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        iceCoffeeSmallAdd.setOpaque(true);
        iceCoffeeSmallAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iceCoffeeSmallAddMouseClicked(evt);
            }
        });
        itemSelection.add(iceCoffeeSmallAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 15, 15));

        iceCoffeeMediumAdd.setBackground(new java.awt.Color(0, 153, 0));
        iceCoffeeMediumAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iceCoffeeMediumAdd.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeeMediumAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCoffeeMediumAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        iceCoffeeMediumAdd.setOpaque(true);
        itemSelection.add(iceCoffeeMediumAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 15, 15));

        iceCoffeeMediumSubtract.setBackground(new java.awt.Color(204, 0, 0));
        iceCoffeeMediumSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iceCoffeeMediumSubtract.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeeMediumSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCoffeeMediumSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        iceCoffeeMediumSubtract.setOpaque(true);
        itemSelection.add(iceCoffeeMediumSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 15, 15));

        iceCoffeePriceMedium.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeePriceMedium.setText("₱95.00");
        itemSelection.add(iceCoffeePriceMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        iceCoffeeLargeAdd.setBackground(new java.awt.Color(0, 153, 0));
        iceCoffeeLargeAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iceCoffeeLargeAdd.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeeLargeAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCoffeeLargeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/add_icon.png"))); // NOI18N
        iceCoffeeLargeAdd.setOpaque(true);
        itemSelection.add(iceCoffeeLargeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 15, 15));

        iceCoffeeLargeSubtract.setBackground(new java.awt.Color(204, 0, 0));
        iceCoffeeLargeSubtract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        iceCoffeeLargeSubtract.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeeLargeSubtract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCoffeeLargeSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/subract_icon.png"))); // NOI18N
        iceCoffeeLargeSubtract.setOpaque(true);
        itemSelection.add(iceCoffeeLargeSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 15, 15));

        iceCoffeePriceLarge.setForeground(new java.awt.Color(255, 255, 255));
        iceCoffeePriceLarge.setText("₱125.00");
        itemSelection.add(iceCoffeePriceLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        cheesecakePrice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cheesecakePrice.setForeground(new java.awt.Color(255, 255, 255));
        cheesecakePrice.setText("₱99.00");
        itemSelection.add(cheesecakePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        croissantPrice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        croissantPrice.setForeground(new java.awt.Color(255, 255, 255));
        croissantPrice.setText("₱75.00");
        itemSelection.add(croissantPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        browniesPrice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        browniesPrice.setForeground(new java.awt.Color(255, 255, 255));
        browniesPrice.setText("₱75.00");
        itemSelection.add(browniesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        strawBerryPrice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        strawBerryPrice.setForeground(new java.awt.Color(255, 255, 255));
        strawBerryPrice.setText("₱70.00");
        itemSelection.add(strawBerryPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        chocolatePrice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        chocolatePrice.setForeground(new java.awt.Color(255, 255, 255));
        chocolatePrice.setText("₱70.00");
        itemSelection.add(chocolatePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jCheckBox10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Brownies");
        jCheckBox10.setContentAreaFilled(false);
        itemSelection.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Cheesecake");
        jCheckBox8.setContentAreaFilled(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        itemSelection.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        jCheckBox12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Chocolate Muffin");
        jCheckBox12.setContentAreaFilled(false);
        itemSelection.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Croissant");
        jCheckBox9.setContentAreaFilled(false);
        itemSelection.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        itemSelection.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 250, 100));

        jCheckBox11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Strawberry Waffle");
        jCheckBox11.setContentAreaFilled(false);
        itemSelection.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        itemSelection.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Foods");
        itemSelection.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Coffee");
        itemSelection.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(itemSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 600, 350));

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backgrounds/Menu.jpg"))); // NOI18N
        jPanel1.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(614, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspressoActionPerformed
//       if(Espresso.isSelected()){
//            eSmall.setEnabled(true);
//            eMedium.setEnabled(true);
//            eLarge.setEnabled(true);
//        }else{
//            eSmall.setEnabled(false); eSmall.setSelected(false);
//            eMedium.setEnabled(false); eMedium.setSelected(false);
//            eLarge.setEnabled(false); eLarge.setSelected(false);
//        }
    }//GEN-LAST:event_EspressoActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Order o = new Order();
    o.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void espressoSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espressoSmallSubtractMouseClicked
        if(Espresso.isSelected())  setTable("Cappuccino", false);
    }//GEN-LAST:event_espressoSmallSubtractMouseClicked

    private void espressoSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espressoSmallAddMouseClicked
        if(Espresso.isSelected()) setTable("Cappuccino", true);
    }//GEN-LAST:event_espressoSmallAddMouseClicked

    private void americanoSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_americanoSmallAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_americanoSmallAddMouseClicked

    private void americanoSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_americanoSmallSubtractMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_americanoSmallSubtractMouseClicked

    private void cappuccinoSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cappuccinoSmallAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cappuccinoSmallAddMouseClicked

    private void cappuccinoSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cappuccinoSmallSubtractMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cappuccinoSmallSubtractMouseClicked

    private void macchiatoSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_macchiatoSmallAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_macchiatoSmallAddMouseClicked

    private void macchiatoSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_macchiatoSmallSubtractMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_macchiatoSmallSubtractMouseClicked

    private void caramelCSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caramelCSmallAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_caramelCSmallAddMouseClicked

    private void caramelCSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caramelCSmallSubtractMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_caramelCSmallSubtractMouseClicked

    private void decafDSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decafDSmallAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_decafDSmallAddMouseClicked

    private void decafDSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decafDSmallSubtractMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_decafDSmallSubtractMouseClicked

    private void iceCoffeeSmallSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iceCoffeeSmallSubtractMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iceCoffeeSmallSubtractMouseClicked

    private void iceCoffeeSmallAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iceCoffeeSmallAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iceCoffeeSmallAddMouseClicked

   
    
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
    private javax.swing.ButtonGroup americanoBtns;
    private javax.swing.JLabel americanoLargeAdd;
    private javax.swing.JLabel americanoLargeSubtract;
    private javax.swing.JLabel americanoMediumAdd;
    private javax.swing.JLabel americanoMediumSubtract;
    private javax.swing.JLabel americanoPriceLarge;
    private javax.swing.JLabel americanoPriceMedium;
    private javax.swing.JLabel americanoPriceSmall;
    private javax.swing.JLabel americanoSmallAdd;
    private javax.swing.JLabel americanoSmallSubtract;
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel browniesPrice;
    private javax.swing.ButtonGroup cCreamBtns;
    private javax.swing.ButtonGroup cMacchiatoBtns;
    private javax.swing.JCheckBox cappuccino;
    private javax.swing.ButtonGroup cappuccinoBtns;
    private javax.swing.JLabel cappuccinoLargeAdd;
    private javax.swing.JLabel cappuccinoLargeSubtract;
    private javax.swing.JLabel cappuccinoMediumAdd;
    private javax.swing.JLabel cappuccinoMediumSubtract;
    private javax.swing.JLabel cappuccinoPriceLarge;
    private javax.swing.JLabel cappuccinoPriceMedium;
    private javax.swing.JLabel cappuccinoPriceSmall;
    private javax.swing.JLabel cappuccinoSmallAdd;
    private javax.swing.JLabel cappuccinoSmallSubtract;
    private javax.swing.JCheckBox caramelC;
    private javax.swing.JLabel caramelCLargeAdd;
    private javax.swing.JLabel caramelCLargeSubtract;
    private javax.swing.JLabel caramelCMediumAdd;
    private javax.swing.JLabel caramelCMediumSubtract;
    private javax.swing.JLabel caramelCPriceLarge;
    private javax.swing.JLabel caramelCPriceMedium;
    private javax.swing.JLabel caramelCPriceSmall;
    private javax.swing.JLabel caramelCSmallAdd;
    private javax.swing.JLabel caramelCSmallSubtract;
    private javax.swing.JLabel cheesecakePrice;
    private javax.swing.JLabel chocolatePrice;
    private javax.swing.JLabel croissantPrice;
    private javax.swing.ButtonGroup dDelightBtns;
    private javax.swing.JCheckBox decafD;
    private javax.swing.JLabel decafDLargeAdd;
    private javax.swing.JLabel decafDLargeSubtract;
    private javax.swing.JLabel decafDMediumAdd;
    private javax.swing.JLabel decafDMediumSubtract;
    private javax.swing.JLabel decafDPriceLarge;
    private javax.swing.JLabel decafDPriceMedium;
    private javax.swing.JLabel decafDPriceSmall;
    private javax.swing.JLabel decafDSmallAdd;
    private javax.swing.JLabel decafDSmallSubtract;
    private javax.swing.ButtonGroup espressoBtns;
    private javax.swing.JLabel espressoMediumAdd;
    private javax.swing.JLabel espressoMediumSubtract;
    private javax.swing.JLabel espressoPriceLarge;
    private javax.swing.JLabel espressoPriceMedium;
    private javax.swing.JLabel espressoPriceSmall;
    private javax.swing.JLabel espressoSmallAdd;
    private javax.swing.JLabel espressoSmallSubtract;
    private javax.swing.JLabel espresssoLargeAdd;
    private javax.swing.JLabel espresssoLargeSubtract;
    private javax.swing.JLabel header;
    private javax.swing.JLabel headerPriceLarge;
    private javax.swing.JLabel headerPriceMedium;
    private javax.swing.JLabel headerPriceSmall;
    private javax.swing.ButtonGroup iCoffeeBtns;
    private javax.swing.JCheckBox iceCoffee;
    private javax.swing.JLabel iceCoffeeLargeAdd;
    private javax.swing.JLabel iceCoffeeLargeSubtract;
    private javax.swing.JLabel iceCoffeeMediumAdd;
    private javax.swing.JLabel iceCoffeeMediumSubtract;
    private javax.swing.JLabel iceCoffeePriceLarge;
    private javax.swing.JLabel iceCoffeePriceMedium;
    private javax.swing.JLabel iceCoffeePriceSmall;
    private javax.swing.JLabel iceCoffeeSmallAdd;
    private javax.swing.JLabel iceCoffeeSmallSubtract;
    private javax.swing.JPanel itemSelection;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JCheckBox macchiato;
    private javax.swing.JLabel macchiatoLargeAdd;
    private javax.swing.JLabel macchiatoLargeSubtract;
    private javax.swing.JLabel macchiatoMediumAdd;
    private javax.swing.JLabel macchiatoMediumSubtract;
    private javax.swing.JLabel macchiatoPriceLarge;
    private javax.swing.JLabel macchiatoPriceMedium;
    private javax.swing.JLabel macchiatoPriceSmall;
    private javax.swing.JLabel macchiatoSmallAdd;
    private javax.swing.JLabel macchiatoSmallSubtract;
    private javax.swing.JLabel menuLabell;
    private javax.swing.JLabel strawBerryPrice;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
