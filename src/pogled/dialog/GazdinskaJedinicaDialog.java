/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pogled.dialog;

import controller.Controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.GazdinskaJedinica;
import model.Lokalitet;
import pogled.GlavnaForma;

/**
 *
 * @author Andrej
 */
public class GazdinskaJedinicaDialog extends javax.swing.JDialog {

    private GazdinskaJedinica gj;
    private GlavnaForma parent;

    /**
     * Creates new form KupciDialog
     */
    public GazdinskaJedinicaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("Kreiraj gazdinsku jedinicu");
        inicijalizacija();
        popuniComboBox();
        this.parent = (GlavnaForma) parent;
    }

    public GazdinskaJedinicaDialog(java.awt.Frame parent, boolean modal, GazdinskaJedinica gj) {
        super(parent, modal);
        this.gj = gj;
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("Izmeni gazdinsku jedinicu");
        inicijalizacija(gj);
        popuniComboBox();
        this.parent = (GlavnaForma) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabelNazivError = new javax.swing.JLabel();
        jComboBoxLokaliteti = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSifra = new javax.swing.JTextField();
        jLabelSifraError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonIzmeni = new javax.swing.JButton();
        jButtonSacuvajIzmene = new javax.swing.JButton();
        jButtonKreiraj = new javax.swing.JButton();
        jButtonObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Naziv");

        jLabel2.setText("Lokalitet");

        jLabelNazivError.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabelNazivError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNazivError.setText("jLabel3");

        jLabel3.setText("Šifra");

        jLabelSifraError.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabelSifraError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSifraError.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNazivError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxLokaliteti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSifraError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSifra, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSifraError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNazivError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxLokaliteti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonIzmeni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        jButtonSacuvajIzmene.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSacuvajIzmene.setText("Sačuvaj izmene");
        jButtonSacuvajIzmene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajIzmeneActionPerformed(evt);
            }
        });

        jButtonKreiraj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonKreiraj.setText("Kreiraj");
        jButtonKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKreirajActionPerformed(evt);
            }
        });

        jButtonObrisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonObrisi.setText("Obriši");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonKreiraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSacuvajIzmene, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButtonObrisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIzmeni)
                .addGap(4, 4, 4)
                .addComponent(jButtonKreiraj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSacuvajIzmene)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonObrisi)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreirajActionPerformed
        String sifra = jTextFieldSifra.getText();
        String naziv = jTextFieldNaziv.getText();
        Lokalitet lokalitet = (Lokalitet) jComboBoxLokaliteti.getSelectedItem();

        if (sifra.isEmpty() || !sifra.matches("^\\d+$") || naziv.isEmpty()) {
            jLabelSifraError.setText(sifra.isEmpty() ? "Unesite šifru" : (!sifra.matches("^\\d+$") ? "Pogrešan format" : ""));
            jLabelNazivError.setText(naziv.isEmpty() ? "Unesite naziv" : "");
            return;
        }
        int brojSifre = Integer.valueOf(sifra);
        GazdinskaJedinica gj = new GazdinskaJedinica(brojSifre, lokalitet, naziv);
        boolean uspesno = Controller.getInstance().kreirajGazdinskaJedinica(gj);
        if (uspesno) {
            JOptionPane.showMessageDialog(this, "Gazdinska jedinica uspešno kreirana", "Obaveštenje", JOptionPane.INFORMATION_MESSAGE);
            parent.azurirajTabelu("gj");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Greška prilikom kreiranja gazdinske jedinice", "Greška", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonKreirajActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        jButtonSacuvajIzmene.setEnabled(true);
        jTextFieldNaziv.setEnabled(true);
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    private void jButtonSacuvajIzmeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajIzmeneActionPerformed
        String naziv = jTextFieldNaziv.getText();
        String sifra = jTextFieldSifra.getText();
        Lokalitet l = (Lokalitet) jComboBoxLokaliteti.getSelectedItem();

        if (sifra.isEmpty() || !sifra.matches("^\\d+$") || naziv.isEmpty()) {
            jLabelSifraError.setText(sifra.isEmpty() ? "Unesite šifru" : (!sifra.matches("^\\d+$") ? "Pogrešan format" : ""));
            jLabelNazivError.setText(naziv.isEmpty() ? "Unesite naziv" : "");
            return;
        }
        int brojSifre = Integer.valueOf(sifra);
        this.gj.setNaziv(naziv);
        this.gj.setLokalitet(l);
        this.gj.setSifra(brojSifre);
        boolean uspesno = Controller.getInstance().izmeniGazdinskaJedinica(gj);
        if (!uspesno) {
            JOptionPane.showMessageDialog(this, "Greška prilikom izmene gazdinske jedinice", "Greška", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Uspešno izmenjena gazdinska jedinica", "Uspešno", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSacuvajIzmeneActionPerformed

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed
        int odgovor = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da obrišete gazdinsku jedinicu?", "Potvrda", JOptionPane.YES_NO_OPTION);
        if (odgovor == JOptionPane.YES_OPTION) {
            boolean uspesno = Controller.getInstance().obrisiGazdinskuJedinicu(gj);
            if (!uspesno) {
                JOptionPane.showMessageDialog(this, "Greška prilikom brisanja gazdinske jedinice", "Greška", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Uspešno obrisana gazdinska jedinica", "Uspešno", JOptionPane.INFORMATION_MESSAGE);
                parent.azurirajTabelu("gj");
                this.dispose();
            }
        }
        return;
    }//GEN-LAST:event_jButtonObrisiActionPerformed

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
            java.util.logging.Logger.getLogger(GazdinskaJedinicaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GazdinskaJedinicaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GazdinskaJedinicaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GazdinskaJedinicaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GazdinskaJedinicaDialog dialog = new GazdinskaJedinicaDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonKreiraj;
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JButton jButtonSacuvajIzmene;
    private javax.swing.JComboBox<Lokalitet> jComboBoxLokaliteti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNazivError;
    private javax.swing.JLabel jLabelSifraError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldNaziv;
    private javax.swing.JTextField jTextFieldSifra;
    // End of variables declaration//GEN-END:variables

    private void inicijalizacija() {
        jButtonIzmeni.setVisible(false);
        jButtonSacuvajIzmene.setVisible(false);
        jButtonKreiraj.setVisible(true);
        jButtonObrisi.setVisible(false);
        jLabelNazivError.setText("");
        jLabelSifraError.setText("");
    }

    private void inicijalizacija(GazdinskaJedinica gj) {
        jTextFieldNaziv.setText(gj.getNaziv());
        jComboBoxLokaliteti.setSelectedItem(gj.getLokalitet());

        jTextFieldNaziv.setEnabled(false);
        jButtonIzmeni.setVisible(true);
        jButtonSacuvajIzmene.setVisible(true);
        jButtonSacuvajIzmene.setEnabled(false);
        jButtonKreiraj.setVisible(false);
        jButtonObrisi.setVisible(true);
        jLabelNazivError.setText("");
        jLabelSifraError.setText("");

    }

    private void popuniComboBox() {
        List<Lokalitet> lista = new ArrayList<>();
        boolean uspesno = Controller.getInstance().vratiListuLokalitet(lista);
        if (uspesno) {
            for (Lokalitet l : lista) {
                jComboBoxLokaliteti.addItem(l);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sistem ne može da učita listu lokaliteta", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }
}
