package assingmenthibernate2;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Forma extends javax.swing.JFrame {

    Zapos z;
    public Session session = HibernateUtil.getSessionFactory().openSession();
    public Transaction tx = null;

    public Forma() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fklijent = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imeip = new javax.swing.JTextField();
        brojgodina = new javax.swing.JTextField();
        adresa = new javax.swing.JTextField();
        visinadohotka = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        fsvi = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaSVI = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        pokrit = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imer = new javax.swing.JRadioButton();
        adrer = new javax.swing.JRadioButton();
        godr = new javax.swing.JRadioButton();
        vdr = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        imetx = new javax.swing.JTextField();
        vdtx = new javax.swing.JTextField();
        godtx = new javax.swing.JTextField();
        adrtx = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textK = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        del = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        delID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textDEL = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        update = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        EdID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jRadioime = new javax.swing.JRadioButton();
        jRadiogod = new javax.swing.JRadioButton();
        jRadioadresa = new javax.swing.JRadioButton();
        jRadiovd = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        imetxt = new javax.swing.JTextField();
        godtxt = new javax.swing.JTextField();
        adresatxt = new javax.swing.JTextField();
        vdtxt = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        fklijent.setBounds(new java.awt.Rectangle(380, 100, 397, 458));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unesi zaposlenika");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 30, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 397, 75));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Ime i prezime:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 131, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Broj godina:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 186, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Adresa:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 239, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Visina dohotka:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 294, -1, -1));

        imeip.setColumns(8);
        jPanel3.add(imeip, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 130, -1, -1));

        brojgodina.setColumns(8);
        jPanel3.add(brojgodina, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 182, -1, -1));

        adresa.setColumns(8);
        jPanel3.add(adresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 238, -1, -1));

        visinadohotka.setColumns(8);
        jPanel3.add(visinadohotka, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 293, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton5.setText("Unesi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, 48));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 368, 397, 90));

        javax.swing.GroupLayout fklijentLayout = new javax.swing.GroupLayout(fklijent.getContentPane());
        fklijent.getContentPane().setLayout(fklijentLayout);
        fklijentLayout.setHorizontalGroup(
            fklijentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fklijentLayout.setVerticalGroup(
            fklijentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fsvi.setBounds(new java.awt.Rectangle(380, 100, 391, 405));
        fsvi.setSize(new java.awt.Dimension(391, 405));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Svi zaposlenici");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 391, 82));

        textareaSVI.setColumns(20);
        textareaSVI.setRows(5);
        jScrollPane1.setViewportView(textareaSVI);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 379, 199));

        jButton7.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton7.setText("Prikazi");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, 45));

        jButton8.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton8.setText("Ocisti");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 110, 45));

        javax.swing.GroupLayout fsviLayout = new javax.swing.GroupLayout(fsvi.getContentPane());
        fsvi.getContentPane().setLayout(fsviLayout);
        fsviLayout.setHorizontalGroup(
            fsviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fsviLayout.setVerticalGroup(
            fsviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pokrit.setBounds(new java.awt.Rectangle(380, 100, 501, 503));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 102, 102));

        jLabel8.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prikazi zaposlenike");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(19, 19, 19))
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 501, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("Izaberite kriterij");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 75, -1, -1));

        buttonGroup1.add(imer);
        imer.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        imer.setText("Ime");
        imer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imerActionPerformed(evt);
            }
        });
        jPanel8.add(imer, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 120, -1, -1));

        buttonGroup1.add(adrer);
        adrer.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        adrer.setText("Adresa");
        adrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrerActionPerformed(evt);
            }
        });
        jPanel8.add(adrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 120, -1, -1));

        buttonGroup1.add(godr);
        godr.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        godr.setText("Godine");
        godr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                godrActionPerformed(evt);
            }
        });
        jPanel8.add(godr, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 120, -1, -1));

        buttonGroup1.add(vdr);
        vdr.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        vdr.setText("Visina Dohotka");
        vdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vdrActionPerformed(evt);
            }
        });
        jPanel8.add(vdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setText("Ime i prezime:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 174, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel11.setText("Adresa:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 229, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel12.setText("Godine:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 174, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel13.setText("Visina dohotka:");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        imetx.setColumns(7);
        jPanel8.add(imetx, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 173, -1, -1));

        vdtx.setColumns(7);
        jPanel8.add(vdtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 228, -1, -1));

        godtx.setColumns(7);
        jPanel8.add(godtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 174, -1, -1));

        adrtx.setColumns(7);
        jPanel8.add(adrtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 230, -1, -1));

        textK.setColumns(20);
        textK.setRows(5);
        jScrollPane2.setViewportView(textK);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 272, 446, 150));

        jButton9.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton9.setText("Prikazi");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 435, 110, 40));

        jButton10.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton10.setText("Ocisti");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 435, 100, 40));

        javax.swing.GroupLayout pokritLayout = new javax.swing.GroupLayout(pokrit.getContentPane());
        pokrit.getContentPane().setLayout(pokritLayout);
        pokritLayout.setHorizontalGroup(
            pokritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pokritLayout.setVerticalGroup(
            pokritLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        del.setBounds(new java.awt.Rectangle(380, 100, 531, 470));
        del.setSize(new java.awt.Dimension(531, 470));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 102, 102));

        jLabel14.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Obrisi zaposlenike");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(20, 20, 20))
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, -1));

        jLabel15.setText("Odaberi ID zaposlenika");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        delID.setColumns(4);
        jPanel10.add(delID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        textDEL.setColumns(20);
        textDEL.setRows(5);
        jScrollPane3.setViewportView(textDEL);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 519, 224));

        jButton11.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton11.setText("Pretrazi");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 50));

        jButton12.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton12.setText("Ocisti");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 110, 50));

        jButton13.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jButton13.setText("Obrisi");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        javax.swing.GroupLayout delLayout = new javax.swing.GroupLayout(del.getContentPane());
        del.getContentPane().setLayout(delLayout);
        delLayout.setHorizontalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        delLayout.setVerticalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        update.setBounds(new java.awt.Rectangle(380, 100, 555, 457));
        update.setSize(new java.awt.Dimension(555, 457));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 102, 102));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Izmjeni zaposlenika");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 555, 58));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel17.setText("Unesite ID zaposlenika:");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 70, -1, -1));

        EdID.setColumns(4);
        jPanel12.add(EdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 56, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel18.setText("Izaberite sta zelite promijeniti");
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        buttonGroup2.add(jRadioime);
        jRadioime.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jRadioime.setText("Ime");
        jPanel12.add(jRadioime, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 191, -1, -1));

        buttonGroup2.add(jRadiogod);
        jRadiogod.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jRadiogod.setText("Godine");
        jPanel12.add(jRadiogod, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 191, -1, -1));

        buttonGroup2.add(jRadioadresa);
        jRadioadresa.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jRadioadresa.setText("Adresa");
        jPanel12.add(jRadioadresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 191, -1, -1));

        buttonGroup2.add(jRadiovd);
        jRadiovd.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jRadiovd.setText("Visina dohotka");
        jPanel12.add(jRadiovd, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 191, -1, -1));

        jButton15.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton15.setText("Izmjeni");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 385, 110, 40));

        jButton16.setFont(new java.awt.Font("Apple Braille", 0, 16)); // NOI18N
        jButton16.setText("Ocisti");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 385, 100, 40));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel19.setText("Ime:");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel20.setText("Godine:");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel21.setText("Adresa:");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel22.setText("Visina dohotka:");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        imetxt.setColumns(7);
        jPanel12.add(imetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        godtxt.setColumns(7);
        jPanel12.add(godtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        adresatxt.setColumns(7);
        jPanel12.add(adresatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        vdtxt.setColumns(7);
        jPanel12.add(vdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update.getContentPane());
        update.getContentPane().setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(380, 100, 397, 460));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Apple Braille", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zaposlenici");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 45, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jButton1.setText("Unos zaposlenika");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jButton2.setText("Prikazi zaposlenika");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jButton3.setText("Edituj zaposlenika");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Apple Braille", 0, 20)); // NOI18N
        jButton4.setText("Obrisi zaposlenika");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fklijent.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        boolean state = true;

        Thread t = new Thread() {
            @Override
            public void run() {

                if (state == true) {

                    String ime = imeip.getText();

                    String god = brojgodina.getText();
                    int bg = Integer.parseInt(god);

                    String adr = adresa.getText();

                    String vd = visinadohotka.getText();
                    int vdd = Integer.parseInt(vd);

                    z = new Zapos(ime, bg, adr, vdd);

                    try {
                        
                        tx = session.beginTransaction();

                        session.persist(z);
                        
                        
                        tx.commit();

                        JOptionPane.showMessageDialog(null, "Unos uspjesan!!!");

                    } catch (HibernateException e) {

                        System.out.println(e);
                        if (tx != null) {
                            tx.rollback();

                        }
                        System.out.println(e);

                    } finally {
                        HibernateUtil.close();
                    }
                    
                    
                    imeip.setText("");
                    brojgodina.setText("");
                    adresa.setText("");
                    visinadohotka.setText("");
                }

            };

        };
               t.start();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int opcija = JOptionPane.showOptionDialog(null, "Prikazi", "Prikaz zaposlenika", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sve zaposlenike", "Po kriterijumu"}, null);

        switch (opcija) {

            case JOptionPane.YES_OPTION:

                fsvi.show();
                fklijent.hide();

                break;

            case JOptionPane.NO_OPTION:

                pokrit.show();

                break;

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String hql = "from Zapos zap ";
        Query query = session.createQuery(hql);

        List<Zapos> zap = null;

        try {

            tx = session.beginTransaction();

            zap = query.list();

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
//                    HibernateUtil.close();
        }

        StringBuilder rezultat = new StringBuilder();

        for (Zapos zap1 : zap) {

            rezultat.append(zap1.getZaposleniId());
            rezultat.append("  ");
            rezultat.append(zap1.getZIme());
            rezultat.append("  ");
            rezultat.append(zap1.getZGod());
            rezultat.append("  ");
            rezultat.append(zap1.getZAdresa());
            rezultat.append("  ");
            rezultat.append(zap1.getZVisinad());
            rezultat.append(" \n");

            textareaSVI.setText(rezultat.toString());

        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void imerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imerActionPerformed

        imer.setEnabled(true);
        adrer.setEnabled(false);
        godr.setEnabled(false);
        vdr.setEnabled(false);

        imetx.setEnabled(true);
        adrtx.setEnabled(false);
        godtx.setEnabled(false);
        vdtx.setEnabled(false);


    }//GEN-LAST:event_imerActionPerformed

    private void adrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrerActionPerformed

        imer.setEnabled(false);
        adrer.setEnabled(true);
        godr.setEnabled(false);
        vdr.setEnabled(false);

        imetx.setEnabled(false);
        adrtx.setEnabled(true);
        godtx.setEnabled(false);
        vdtx.setEnabled(false);


    }//GEN-LAST:event_adrerActionPerformed

    private void godrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_godrActionPerformed

        imer.setEnabled(false);
        adrer.setEnabled(false);
        godr.setEnabled(true);
        vdr.setEnabled(false);

        imetx.setEnabled(false);
        adrtx.setEnabled(false);
        godtx.setEnabled(true);
        vdtx.setEnabled(false);


    }//GEN-LAST:event_godrActionPerformed

    private void vdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vdrActionPerformed

        imer.setEnabled(false);
        adrer.setEnabled(false);
        godr.setEnabled(false);
        vdr.setEnabled(true);

        imetx.setEnabled(false);
        adrtx.setEnabled(false);
        godtx.setEnabled(false);
        vdtx.setEnabled(true);


    }//GEN-LAST:event_vdrActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        boolean state = true;
        Thread t5 = new Thread() {

            @Override
            public void run() {

                if (state == true) {

//                           ime
                    if (imer.isSelected()) {

                        String nam = imetx.getText();

                        String hql = "from Zapos zap where zap.ZIme = '" + nam + "'";
                        Query query = session.createQuery(hql);

                        List<Zapos> zap = null;

                        try {

                            tx = session.beginTransaction();

                            zap = query.list();

                            tx.commit();

                        } catch (HibernateException e) {
                            if (tx != null) {
                                tx.rollback();
                            }
                            System.out.println(e);
                        } finally {
//                        HibernateUtil.close();
                        }

                        StringBuilder rezultat = new StringBuilder();

                        for (Zapos zap1 : zap) {

                            rezultat.append(zap1.getZIme());
                            rezultat.append("  ");
                            rezultat.append(zap1.getZGod());
                            rezultat.append("  ");
                            rezultat.append(zap1.getZAdresa());
                            rezultat.append("  ");
                            rezultat.append(zap1.getZVisinad());
                            rezultat.append(" \n");

                            textK.setText(rezultat.toString());

                        }
                    }

                    {
                        //                           GODINE
                        if (godr.isSelected()) {
                            String g = godtx.getText();
                            int go = Integer.parseInt(g);

                            String hql1 = "from Zapos zap where zap.ZGod = '" + go + "'";
                            Query query1 = session.createQuery(hql1);

                            List<Zapos> zap2 = null;

                            try {

                                tx = session.beginTransaction();

                                zap2 = query1.list();

                                tx.commit();

                            } catch (HibernateException e) {
                                if (tx != null) {
                                    tx.rollback();
                                }
                                System.out.println(e);
                            } finally {
//                        HibernateUtil.close();
                            }

                            StringBuilder rezultat1 = new StringBuilder();

                            for (Zapos zap3 : zap2) {

                                rezultat1.append(zap3.getZIme());
                                rezultat1.append("  ");
                                rezultat1.append(zap3.getZGod());
                                rezultat1.append("  ");
                                rezultat1.append(zap3.getZAdresa());
                                rezultat1.append("  ");
                                rezultat1.append(zap3.getZVisinad());
                                rezultat1.append(" \n");

                                textK.setText(rezultat1.toString());

                            }
                        }

                        //                    adresa 
                        if (adrer.isSelected()) {
                            String ad = adrtx.getText();

                            String hql1 = "from Zapos zap where zap.ZAdresa = '" + ad + "'";
                            Query query1 = session.createQuery(hql1);

                            List<Zapos> zap3 = null;

                            try {

                                tx = session.beginTransaction();

                                zap3 = query1.list();

                                tx.commit();

                            } catch (HibernateException e) {
                                if (tx != null) {
                                    tx.rollback();
                                }
                                System.out.println(e);
                            } finally {
//                        HibernateUtil.close();
                            }

                            StringBuilder rezultat2 = new StringBuilder();

                            for (Zapos zap5 : zap3) {

                                rezultat2.append(zap5.getZIme());
                                rezultat2.append("  ");
                                rezultat2.append(zap5.getZGod());
                                rezultat2.append("  ");
                                rezultat2.append(zap5.getZAdresa());
                                rezultat2.append("  ");
                                rezultat2.append(zap5.getZVisinad());
                                rezultat2.append("  ");
                                rezultat2.append(" \n");

                                textK.setText(rezultat2.toString());

                            }
                        }

                        //                visina dohotka
                        if (vdr.isSelected()) {

                            String da = vdtx.getText();
                            int v = Integer.parseInt(da);

                            String hql1 = "from Zapos zap where zap.ZVisinad = '" + v + "'";
                            Query query1 = session.createQuery(hql1);

                            List<Zapos> zap4 = null;

                            try {

                                tx = session.beginTransaction();

                                zap4 = query1.list();

                                tx.commit();

                            } catch (HibernateException e) {
                                if (tx != null) {
                                    tx.rollback();
                                }
                                System.out.println(e);
                            } finally {
//                        HibernateUtil.close();
                            }

                            StringBuilder rezultat4 = new StringBuilder();

                            for (Zapos zap7 : zap4) {

                                rezultat4.append(zap7.getZIme());
                                rezultat4.append("  ");
                                rezultat4.append(zap7.getZGod());
                                rezultat4.append("  ");
                                rezultat4.append(zap7.getZAdresa());
                                rezultat4.append("  ");
                                rezultat4.append(zap7.getZVisinad());
                                rezultat4.append("  ");
                                rezultat4.append(" \n");

                                textK.setText(rezultat4.toString());

                            }

                        }

                        imer.setEnabled(true);
                        adrer.setEnabled(true);
                        godr.setEnabled(true);
                        vdr.setEnabled(true);

                        imetx.setText("");
                        godtx.setText("");
                        adrtx.setText("");
                        vdtx.setText("");
                    }
                }

            }
        };
        t5.start();


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        del.show();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        String hql = "from Zapos zap ";
        Query query = session.createQuery(hql);

        List<Zapos> zap = null;

        try {

            tx = session.beginTransaction();

            zap = query.list();

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
//                    HibernateUtil.close();
        }

        StringBuilder rezultat = new StringBuilder();

        for (Zapos zap1 : zap) {

            rezultat.append(zap1.getZaposleniId());
            rezultat.append("  ");
            rezultat.append(zap1.getZIme());
            rezultat.append("  ");
            rezultat.append(zap1.getZGod());
            rezultat.append("  ");
            rezultat.append(zap1.getZAdresa());
            rezultat.append("  ");
            rezultat.append(zap1.getZVisinad());
            rezultat.append(" \n");

            textDEL.setText(rezultat.toString());

        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        String del = delID.getText();
        int dele = Integer.parseInt(del);

        String hql = "delete from Zapos zap where zap.zaposleniId ='" + dele + "'";
        Query query = session.createQuery(hql);

        List<Zapos> zap = null;

        try {

            tx = session.beginTransaction();

            query.executeUpdate();

            tx.commit();

            JOptionPane.showMessageDialog(null, "Uspjesno obrisan zaposlenik.");

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
//                    HibernateUtil.close();
        }


    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        update.show();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

//              na osnovi  imena
        if (jRadioime.isSelected()) {

            String id = EdID.getText();
            int idd = Integer.parseInt(id);

            String nam = imetxt.getText();

            String hql = "update Zapos zap set zap.ZIme = '" + nam + "' " + " where zap.zaposleniId = '" + idd + "'";
            Query query = session.createQuery(hql);

            List<Zapos> zap = null;

            try {

                tx = session.beginTransaction();

                query.executeUpdate();

                session.flush();
                session.clear();

                tx.commit();

                JOptionPane.showMessageDialog(null, "Izmjena uspjesno izvrsena.");

            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                System.out.println(e);
            } finally {
//                        HibernateUtil.close();
            }

            EdID.setText("");
            imetxt.setText("");
            adresatxt.setText("");
            godtxt.setText("");
            vdtxt.setText("");

        }

//                na osnovu godina 
        if (jRadiogod.isSelected()) {

            String id = EdID.getText();
            int idd = Integer.parseInt(id);

            String go = godtxt.getText();
            int god = Integer.parseInt(go);

            String hql = "update Zapos zap set zap.ZGod = '" + god + "' " + " where zap.zaposleniId = '" + idd + "'";
            Query query = session.createQuery(hql);

            List<Zapos> zap = null;

            try {

                tx = session.beginTransaction();

                query.executeUpdate();

                session.flush();
                session.clear();

                tx.commit();

                JOptionPane.showMessageDialog(null, "Izmjena uspjesno izvrsena.");

            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                System.out.println(e);
            } finally {
//                        HibernateUtil.close();
            }

        }

//                na osnovu adrese
        if (jRadioadresa.isSelected()) {

            String id = EdID.getText();
            int idd = Integer.parseInt(id);

            String adr = adresatxt.getText();

            String hql = "update Zapos zap set zap.ZAdresa = '" + adr + "' " + " where zap.zaposleniId = '" + idd + "'";
            Query query = session.createQuery(hql);

            List<Zapos> zap = null;

            try {

                tx = session.beginTransaction();

                query.executeUpdate();

                session.flush();
                session.clear();

                tx.commit();

                JOptionPane.showMessageDialog(null, "Izmjena uspjesno izvrsena.");

            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                System.out.println(e);
            } finally {
//                        HibernateUtil.close();
            }

        }
//                na osnovu dohotka
        if (jRadiovd.isSelected()) {
            String id = EdID.getText();
            int idd = Integer.parseInt(id);

            String vd = vdtxt.getText();
            int vdd = Integer.parseInt(vd);

            String hql = "update Zapos zap set zap.ZVisinad = '" + vdd + "' " + " where zap.zaposleniId = '" + idd + "'";
            Query query = session.createQuery(hql);

            List<Zapos> zap = null;

            try {

                tx = session.beginTransaction();

                query.executeUpdate();
                session.flush();
                session.clear();

                tx.commit();

                JOptionPane.showMessageDialog(null, "Izmjena uspjesno izvrsena.");

            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                System.out.println(e);
            } finally {
//                        HibernateUtil.close();
            }

        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        textareaSVI.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        textDEL.setText("");
        delID.setText("");

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed


    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EdID;
    private javax.swing.JRadioButton adrer;
    private javax.swing.JTextField adresa;
    private javax.swing.JTextField adresatxt;
    private javax.swing.JTextField adrtx;
    private javax.swing.JTextField brojgodina;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFrame del;
    private javax.swing.JTextField delID;
    private javax.swing.JFrame fklijent;
    private javax.swing.JFrame fsvi;
    private javax.swing.JRadioButton godr;
    private javax.swing.JTextField godtx;
    private javax.swing.JTextField godtxt;
    private javax.swing.JTextField imeip;
    private javax.swing.JRadioButton imer;
    private javax.swing.JTextField imetx;
    private javax.swing.JTextField imetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioadresa;
    private javax.swing.JRadioButton jRadiogod;
    private javax.swing.JRadioButton jRadioime;
    private javax.swing.JRadioButton jRadiovd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JFrame pokrit;
    private javax.swing.JTextArea textDEL;
    private javax.swing.JTextArea textK;
    private javax.swing.JTextArea textareaSVI;
    private javax.swing.JFrame update;
    private javax.swing.JRadioButton vdr;
    private javax.swing.JTextField vdtx;
    private javax.swing.JTextField vdtxt;
    private javax.swing.JTextField visinadohotka;
    // End of variables declaration//GEN-END:variables
}
