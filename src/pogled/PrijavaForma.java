
package pogled;

import controller.Controller;
import hashing.Hash;
import java.awt.Color;
import java.io.File;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import konfiguracija.Konfiguracija;
import model.Menadzer;
import model_enum.Privilegija;

/**
 *
 * @author Andrej
 */
public class PrijavaForma extends javax.swing.JFrame {

   
    public PrijavaForma() {
        initComponents();
        setTitle("Prijava");
        setResizable(false);
        inicijalizacija();
        setLocationRelativeTo(null);
        popuniComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLevo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanelDesno = new javax.swing.JPanel();
        jPanelPodesavanja = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldURL = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordFieldPodesavanja = new javax.swing.JPasswordField();
        jPanel25 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButtonPronadjiWord = new javax.swing.JButton();
        jTextFieldPutanjaWord = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButtonPronadji = new javax.swing.JButton();
        jTextFieldPutanja = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jButtonSacuvaj = new javax.swing.JButton();
        jPanelPrijava = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldJmbgPrijava = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jButtonPrijava = new javax.swing.JButton();
        jPanelRegistracija = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldJMBG = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldImePrezime = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldRegistracija = new javax.swing.JPasswordField();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldKontakt = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jComboBoxPrivilegija = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jButtonRegistracija = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanelLevo.setBackground(new java.awt.Color(0, 153, 51));
        jPanelLevo.setMaximumSize(new java.awt.Dimension(200, 400));
        jPanelLevo.setMinimumSize(new java.awt.Dimension(200, 400));
        jPanelLevo.setPreferredSize(new java.awt.Dimension(200, 400));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dobrodošli nazad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanelLevo.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 150));

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PRIJAVA");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRACIJA");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PODEŠAVANJA");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jPanelLevo.add(jPanel3);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-tree-96.png"))); // NOI18N
        jPanelLevo.add(jLabel9);

        getContentPane().add(jPanelLevo);

        jPanelDesno.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDesno.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanelDesno.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanelDesno.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanelDesno.setLayout(new java.awt.CardLayout());

        jPanelPodesavanja.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPodesavanja.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanelPodesavanja.setLayout(new java.awt.GridBagLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanel10.setMinimumSize(new java.awt.Dimension(300, 200));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 400));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel23.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("URL");
        jLabel13.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel23.add(jLabel13);

        jTextFieldURL.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldURL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldURL.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldURL.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldURL.setText("jdbc:mysql://localhost:3306/greenbill");
        jTextFieldURL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldURL.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel23.add(jTextFieldURL);

        jPanel10.add(jPanel23);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel22.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Username");
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel22.add(jLabel12);

        jTextFieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel22.add(jTextFieldUsername);

        jPanel10.add(jPanel22);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel20.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Lozinka");
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel20.add(jLabel11);

        jPasswordFieldPodesavanja.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPodesavanja.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldPodesavanja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordFieldPodesavanja.setPreferredSize(new java.awt.Dimension(200, 20));
        jPasswordFieldPodesavanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPodesavanjaActionPerformed(evt);
            }
        });
        jPanel20.add(jPasswordFieldPodesavanja);

        jPanel10.add(jPanel20);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel25.setPreferredSize(new java.awt.Dimension(300, 70));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Word export");
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel25.add(jLabel15);

        jButtonPronadjiWord.setText("Pronadji");
        jButtonPronadjiWord.setPreferredSize(new java.awt.Dimension(100, 27));
        jButtonPronadjiWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPronadjiWordActionPerformed(evt);
            }
        });
        jPanel25.add(jButtonPronadjiWord);

        jTextFieldPutanjaWord.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPutanjaWord.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPutanjaWord.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPutanjaWord.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldPutanjaWord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPutanjaWord.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel25.add(jTextFieldPutanjaWord);

        jPanel10.add(jPanel25);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel24.setPreferredSize(new java.awt.Dimension(300, 70));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Excel export");
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel24.add(jLabel14);

        jButtonPronadji.setText("Pronadji");
        jButtonPronadji.setPreferredSize(new java.awt.Dimension(100, 27));
        jButtonPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPronadjiActionPerformed(evt);
            }
        });
        jPanel24.add(jButtonPronadji);

        jTextFieldPutanja.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPutanja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPutanja.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPutanja.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldPutanja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldPutanja.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel24.add(jTextFieldPutanja);

        jPanel10.add(jPanel24);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMinimumSize(new java.awt.Dimension(300, 60));
        jPanel21.setPreferredSize(new java.awt.Dimension(300, 60));

        jButtonSacuvaj.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSacuvaj.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSacuvaj.setText("Sačuvaj");
        jButtonSacuvaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSacuvaj.setPreferredSize(new java.awt.Dimension(200, 30));
        jButtonSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajActionPerformed(evt);
            }
        });
        jPanel21.add(jButtonSacuvaj);

        jPanel10.add(jPanel21);

        jPanelPodesavanja.add(jPanel10, new java.awt.GridBagConstraints());

        jPanelDesno.add(jPanelPodesavanja, "card2");

        jPanelPrijava.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrijava.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanelPrijava.setMinimumSize(new java.awt.Dimension(300, 200));
        jPanelPrijava.setPreferredSize(new java.awt.Dimension(300, 200));
        jPanelPrijava.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanel9.setMinimumSize(new java.awt.Dimension(300, 200));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 60));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("JMBG");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel6.add(jLabel2);

        jTextFieldJmbgPrijava.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldJmbgPrijava.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldJmbgPrijava.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldJmbgPrijava.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldJmbgPrijava.setText("0202003773622");
        jTextFieldJmbgPrijava.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldJmbgPrijava.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel6.add(jTextFieldJmbgPrijava);

        jPanel9.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 60));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Lozinka");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel7.add(jLabel3);

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField.setText("emperijeri");
        jPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField.setPreferredSize(new java.awt.Dimension(200, 30));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel7.add(jPasswordField);

        jPanel9.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 60));

        jButtonPrijava.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPrijava.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPrijava.setText("Prijavi se");
        jButtonPrijava.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonPrijava.setPreferredSize(new java.awt.Dimension(200, 30));
        jButtonPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrijavaActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonPrijava);

        jPanel9.add(jPanel8);

        jPanelPrijava.add(jPanel9, new java.awt.GridBagConstraints());

        jPanelDesno.add(jPanelPrijava, "card2");

        jPanelRegistracija.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistracija.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanelRegistracija.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanelRegistracija.setLayout(new java.awt.GridBagLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(300, 200));
        jPanel11.setMinimumSize(new java.awt.Dimension(300, 200));
        jPanel11.setPreferredSize(new java.awt.Dimension(300, 400));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel12.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("JMBG");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel12.add(jLabel4);

        jTextFieldJMBG.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldJMBG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldJMBG.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldJMBG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldJMBG.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel12.add(jTextFieldJMBG);

        jPanel11.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel13.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ime i prezime");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel13.add(jLabel5);

        jTextFieldImePrezime.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldImePrezime.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldImePrezime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldImePrezime.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel13.add(jTextFieldImePrezime);

        jPanel11.add(jPanel13);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel15.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel15.add(jLabel6);

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel15.add(jTextFieldEmail);

        jPanel11.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(300, 60));
        jPanel16.setPreferredSize(new java.awt.Dimension(300, 60));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Lozinka");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel16.add(jLabel7);

        jPasswordFieldRegistracija.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldRegistracija.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordFieldRegistracija.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel16.add(jPasswordFieldRegistracija);

        jPanel11.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel17.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Kontakt");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel17.add(jLabel8);

        jTextFieldKontakt.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldKontakt.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldKontakt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldKontakt.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel17.add(jTextFieldKontakt);

        jPanel11.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel18.setPreferredSize(new java.awt.Dimension(300, 50));

        jComboBoxPrivilegija.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxPrivilegija.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxPrivilegija.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel18.add(jComboBoxPrivilegija);

        jPanel11.add(jPanel18);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 60));

        jButtonRegistracija.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistracija.setText("Registruj se");
        jButtonRegistracija.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonRegistracija.setPreferredSize(new java.awt.Dimension(200, 30));
        jButtonRegistracija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistracijaActionPerformed(evt);
            }
        });
        jPanel14.add(jButtonRegistracija);

        jPanel11.add(jPanel14);

        jPanelRegistracija.add(jPanel11, new java.awt.GridBagConstraints());

        jPanelDesno.add(jPanelRegistracija, "card2");

        getContentPane().add(jPanelDesno);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanelRegistracija.setVisible(true);
        jPanelPodesavanja.setVisible(false);
        jPanelPrijava.setVisible(false);
        jButton1.setBackground(new Color(0, 153, 51));
        jButton2.setBackground(new Color(0, 102, 51));
        jButton3.setBackground(new Color(0, 153, 51));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanelRegistracija.setVisible(false);
        jPanelPodesavanja.setVisible(false);
        jPanelPrijava.setVisible(true);
        jButton1.setBackground(new Color(0, 102, 51));
        jButton2.setBackground(new Color(0, 153, 51));
        jButton3.setBackground(new Color(0, 153, 51));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrijavaActionPerformed

        if(jTextFieldJmbgPrijava.getText().length() > 15 || jPasswordField.getPassword().length > 20 || !proveriPodesavanja() ){
             JOptionPane.showMessageDialog(this, "Proverite podatke", "Greška", JOptionPane.ERROR_MESSAGE);
             return;
        }
        String jmbg = jTextFieldJmbgPrijava.getText().trim();
        String lozinka = new String(jPasswordField.getPassword());
        String kriptovana = "";
        try {
            kriptovana = Hash.kriptuj(lozinka);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PrijavaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean uspesno = Controller.getInstance().prijaviMenadzer(jmbg, kriptovana);
        if (uspesno) {
            GlavnaForma gf = new GlavnaForma();
            gf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Pogrešni kredencijali", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPrijavaActionPerformed

    private void jButtonRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistracijaActionPerformed
        if (jTextFieldJMBG.getText().isEmpty()
                || !jTextFieldJMBG.getText().matches("^\\d{13}$")
                || jTextFieldImePrezime.getText().isEmpty()
                || jTextFieldImePrezime.getText().length() > 30
                || jTextFieldEmail.getText().isEmpty()
                || !jTextFieldEmail.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
                || jTextFieldEmail.getText().length() > 30
                || jTextFieldKontakt.getText().isEmpty()
                || jTextFieldKontakt.getText().length() > 30
                || jPasswordFieldRegistracija.getText().isEmpty()
                || jPasswordFieldRegistracija.getPassword().length > 20){
            JOptionPane.showMessageDialog(this, "Proverite format unetih podataka", "Greška", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String jmbg = jTextFieldJMBG.getText();
        String imePrezime = jTextFieldImePrezime.getText();
        String email = jTextFieldEmail.getText();
        String kontakt = jTextFieldKontakt.getText();
        Privilegija privilegija = (Privilegija) jComboBoxPrivilegija.getSelectedItem();
        String lozinka = String.valueOf(jPasswordFieldRegistracija.getPassword());
        String kriptovana = "";
        try {
            kriptovana = Hash.kriptuj(lozinka);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PrijavaForma.class.getName()).log(Level.SEVERE, null, ex);
        }

        Menadzer menadzer = new Menadzer(jmbg, imePrezime, email, kriptovana, kontakt, privilegija);
        boolean uspesno = Controller.getInstance().kreirajMenadzer(menadzer);
        if (uspesno) {
            JOptionPane.showMessageDialog(this, "Dobili ste jednokratnu lozinku na mail " + email, "Uspešno", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Greška prilikom registracije na sistem", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistracijaActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanelRegistracija.setVisible(false);
        jPanelPrijava.setVisible(false);
        jPanelPodesavanja.setVisible(true);
        jButton1.setBackground(new Color(0, 153, 51));
        jButton2.setBackground(new Color(0, 153, 51));
        jButton3.setBackground(new Color(0, 102, 51));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordFieldPodesavanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPodesavanjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPodesavanjaActionPerformed

    private void jButtonSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajActionPerformed
        if (proveriPodesavanja()) {
            JOptionPane.showMessageDialog(this, "Unesite sve podatke", "Greška", JOptionPane.ERROR_MESSAGE);
            return;
        }
  

        String url = jTextFieldURL.getText().trim();
        String username = jTextFieldUsername.getText().trim();
        String password = String.valueOf(jPasswordFieldPodesavanja.getPassword());
        Konfiguracija.getInstance().setPropertie("url", url);
        Konfiguracija.getInstance().setPropertie("username", username);
        Konfiguracija.getInstance().setPropertie("password", password);

        String putanja = jTextFieldPutanja.getText().trim();
        Konfiguracija.getInstance().setPropertie("excel.file.path", putanja);

        String putanjaWord = jTextFieldPutanjaWord.getText().trim();
        Konfiguracija.getInstance().setPropertie("word.file.path", putanjaWord);

        Konfiguracija.getInstance().sacuvajIzmene();
        JOptionPane.showMessageDialog(this, "Uspešno izmenjeni podaci", "Uspešno", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButtonSacuvajActionPerformed

    private void jButtonPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPronadjiActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Excel Files", "xls", "xlsx"));

        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            jTextFieldPutanja.setText(selectedFile.getAbsolutePath());

        }
    }//GEN-LAST:event_jButtonPronadjiActionPerformed

    private void jButtonPronadjiWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPronadjiWordActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Word Files", "docx"));

        int returnValue = fileChooser.showOpenDialog(this);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            jTextFieldPutanjaWord.setText(selectedFile.getAbsolutePath());

        }
    }//GEN-LAST:event_jButtonPronadjiWordActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrijavaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrijavaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrijavaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrijavaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrijavaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonPrijava;
    private javax.swing.JButton jButtonPronadji;
    private javax.swing.JButton jButtonPronadjiWord;
    private javax.swing.JButton jButtonRegistracija;
    private javax.swing.JButton jButtonSacuvaj;
    private javax.swing.JComboBox<Privilegija> jComboBoxPrivilegija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDesno;
    private javax.swing.JPanel jPanelLevo;
    private javax.swing.JPanel jPanelPodesavanja;
    private javax.swing.JPanel jPanelPrijava;
    private javax.swing.JPanel jPanelRegistracija;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldPodesavanja;
    private javax.swing.JPasswordField jPasswordFieldRegistracija;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldImePrezime;
    private javax.swing.JTextField jTextFieldJMBG;
    private javax.swing.JTextField jTextFieldJmbgPrijava;
    private javax.swing.JTextField jTextFieldKontakt;
    private javax.swing.JTextField jTextFieldPutanja;
    private javax.swing.JTextField jTextFieldPutanjaWord;
    private javax.swing.JTextField jTextFieldURL;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBox() {
        for (Privilegija p : Privilegija.values()) {
            jComboBoxPrivilegija.addItem(p);
        }
    }

    private void inicijalizacija() {
        jPanelPrijava.setVisible(true);
        jPanelRegistracija.setVisible(false);
        jPanelPodesavanja.setVisible(false);
        
        jTextFieldURL.setText(Konfiguracija.getInstance().getPropertie("url"));
        jTextFieldUsername.setText(Konfiguracija.getInstance().getPropertie("username"));
        jTextFieldPutanja.setText(Konfiguracija.getInstance().getPropertie("excel.file.path"));
        jTextFieldPutanjaWord.setText(Konfiguracija.getInstance().getPropertie("word.file.path"));
    }

    private boolean proveriPodesavanja() {
        return !jTextFieldPutanja.getText().isEmpty() && !jTextFieldPutanjaWord.getText().isEmpty() && !jTextFieldURL.getText().isEmpty() && !jTextFieldUsername.getText().isEmpty();
    }
}
