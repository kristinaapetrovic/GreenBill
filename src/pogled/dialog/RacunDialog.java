package pogled.dialog;

import controller.Controller;
import data_export.InvoiceExport;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import konfiguracija.Konfiguracija;
import model.Otpremnica;
import model.Racun;
import model.StavkaOtpremnice;
import pogled.GlavnaForma;
import table_models.StavkaOtpremniceModelTabele;

/**
 *
 * @author Andrej
 */
public class RacunDialog extends javax.swing.JDialog {

    private GlavnaForma parent;
    private Otpremnica otpremnica;
    private Racun racun;

    public RacunDialog(java.awt.Frame parent, boolean modal, Otpremnica otpremnica) {
        super(parent, modal);
        initComponents();
        this.parent = (GlavnaForma) parent;
        this.otpremnica = otpremnica;
        inicijalizacija(otpremnica);
        setTitle("Kreiraj račun");
        setLocationRelativeTo(null);
    }

    public RacunDialog(java.awt.Frame parent, boolean modal, Racun racun) {
        super(parent, modal);
        initComponents();
        this.parent = (GlavnaForma) parent;
        this.racun = racun;
        inicijalizacija(racun);
        setTitle("Detalji račun");
        setLocationRelativeTo(null);
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
        jTextFieldBrojOtpremnice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBrojRacuna = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDatum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPozivNaBroj = new javax.swing.JTextField();
        jButtonKreiraj = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNacinPlacanja = new javax.swing.JTextField();
        jTextFieldKomercijalista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldOsnovica = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPDV = new javax.swing.JTextField();
        jTextFieldNapomena = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStavke = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 200));

        jLabel1.setText("Broj otpremnice");

        jLabel2.setText("Broj računa");

        jLabel3.setText("Napomena");

        jLabel4.setText("Mesto");

        jLabel5.setText("Datum");

        jLabel6.setText("Poziv na broj");

        jButtonKreiraj.setText("Kreiraj račun");
        jButtonKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKreirajActionPerformed(evt);
            }
        });

        jLabel7.setText("Način plaćanja");

        jTextFieldNacinPlacanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNacinPlacanjaActionPerformed(evt);
            }
        });

        jTextFieldKomercijalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKomercijalistaActionPerformed(evt);
            }
        });

        jLabel8.setText("Komercijalista");

        jLabel9.setText("Osnovica");

        jTextFieldOsnovica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOsnovicaActionPerformed(evt);
            }
        });

        jLabel10.setText("PDV");

        jTextFieldPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPDVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBrojOtpremnice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldKomercijalista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNacinPlacanja))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPozivNaBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldOsnovica)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jTextFieldPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonKreiraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNapomena, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBrojOtpremnice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPozivNaBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldKomercijalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNacinPlacanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKreiraj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldPDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldOsnovica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setMinimumSize(new java.awt.Dimension(800, 350));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 300));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 350));

        jTableStavke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableStavke.setPreferredSize(new java.awt.Dimension(800, 350));
        jTableStavke.setShowGrid(true);
        jScrollPane1.setViewportView(jTableStavke);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreirajActionPerformed

        if (racun != null) {

            String putanja = izaberiPutanju();
            if(putanja == null){
                return;
            }

            Otpremnica otpremnica = Controller.getInstance().vratiOtpremnicaForRacun(racun);
            System.out.println(otpremnica.getKupac().getNaziv());
            List<StavkaOtpremnice> listaStavki = new ArrayList<>();
            Controller.getInstance().vratiListuStavkiOtpremnica(listaStavki, otpremnica);
            try {
                InvoiceExport.replacePlaceholdersInDocument(Konfiguracija.getInstance().getPropertie("word.file.path"), putanja +"\\Racun-"+ racun.getBroj() + ".docx", listaStavki, otpremnica, racun);
            } catch (IOException ex) {
                Logger.getLogger(RacunDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(parent, "Kreiran dokument Racun_" + racun.getBroj() + ".docx", "Uspešno", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (!jTextFieldBrojRacuna.getText().matches("\\d+")
                || // Broj računa mora biti cel broj
                jTextFieldMesto.getText().length() > 50
                || // Mesto može imati najviše 50 znakova
                jTextFieldNapomena.getText().length() > 50
                || // Napomena može imati najviše 50 znakova
                jTextFieldPozivNaBroj.getText().length() > 30
                || // Poziv na broj može imati najviše 30 znakova
                jTextFieldNacinPlacanja.getText().length() > 50
                || // Način plačanja može imati najviše 50 znakova
                jTextFieldKomercijalista.getText().length() > 30
                || // Komercijalista može imati najviše 30 znakova
                Double.parseDouble(jTextFieldOsnovica.getText()) <= 0
                || // Osnovica mora biti veća od 0
                Double.parseDouble(jTextFieldPDV.getText()) < 0 // PDV ne može biti negativan
                ) {
            JOptionPane.showMessageDialog(this, "Proverite unete podatke.", "Greška", JOptionPane.ERROR_MESSAGE);
            return;  // Ako postoji bilo koja greška, izlazimo iz metode
        }

        // Ako su svi podaci validni, nastavite sa kreiranjem računa
        java.util.Date datum = new Date();
        Racun racun = new Racun();
        racun.setBroj(jTextFieldBrojRacuna.getText());
        racun.setDatum(datum);
        racun.setKomercijalista(jTextFieldKomercijalista.getText());
        racun.setMesto(jTextFieldMesto.getText());
        racun.setNacinPlacanja(jTextFieldNacinPlacanja.getText());
        racun.setNapomena(jTextFieldNapomena.getText());
        racun.setOsnovica(Double.parseDouble(jTextFieldOsnovica.getText()));
        racun.setOtpremnica(otpremnica);
        racun.setPozivNaBroj(jTextFieldPozivNaBroj.getText());
        racun.setPdv(Double.parseDouble(jTextFieldPDV.getText()));

        // Pozivanje metode za kreiranje računa
        boolean uspesno = Controller.getInstance().kreirajRacun(racun);
        if (uspesno) {
            JOptionPane.showMessageDialog(this, "Uspešno kreiran račun", "Uspešno", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();  // Zatvara prozor
        } else {
            JOptionPane.showMessageDialog(this, "Greška prilikom kreiranja računa", "Greška", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonKreirajActionPerformed

    private void jTextFieldNacinPlacanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNacinPlacanjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNacinPlacanjaActionPerformed

    private void jTextFieldKomercijalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKomercijalistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKomercijalistaActionPerformed

    private void jTextFieldOsnovicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOsnovicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOsnovicaActionPerformed

    private void jTextFieldPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPDVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKreiraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStavke;
    private javax.swing.JTextField jTextFieldBrojOtpremnice;
    private javax.swing.JTextField jTextFieldBrojRacuna;
    private javax.swing.JTextField jTextFieldDatum;
    private javax.swing.JTextField jTextFieldKomercijalista;
    private javax.swing.JTextField jTextFieldMesto;
    private javax.swing.JTextField jTextFieldNacinPlacanja;
    private javax.swing.JTextField jTextFieldNapomena;
    private javax.swing.JTextField jTextFieldOsnovica;
    private javax.swing.JTextField jTextFieldPDV;
    private javax.swing.JTextField jTextFieldPozivNaBroj;
    // End of variables declaration//GEN-END:variables

    private void inicijalizacija(Otpremnica otpremnica) {
        jTextFieldBrojOtpremnice.setText(otpremnica.getBroj());
        jTextFieldBrojOtpremnice.setEnabled(false);

        java.util.Date datum = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        jTextFieldDatum.setText(format.format(datum));

        jTextFieldDatum.setEnabled(false);

        List<StavkaOtpremnice> lista = new ArrayList<>();
        boolean uspesno = Controller.getInstance().vratiListuStavkiOtpremnica(lista, otpremnica);
        if (uspesno) {
            StavkaOtpremniceModelTabele somt = new StavkaOtpremniceModelTabele(lista, true);
            jTableStavke.setModel(somt);
        } else {
            JOptionPane.showMessageDialog(this, "Sistem ne može da učita listu otpremnica", "Greška", JOptionPane.ERROR_MESSAGE);
        }
        jTextFieldOsnovica.setText(izracunajOsnovicu(lista) + "");
        jTextFieldOsnovica.setEnabled(false);
        jTextFieldPDV.setText(izracunajPDV(lista) + "");
        jTextFieldPDV.setEnabled(false);
    }

    private double izracunajOsnovicu(List<StavkaOtpremnice> lista) {
        double osnovica = 0;
        for (StavkaOtpremnice so : lista) {
            osnovica += so.getIznos();
        }

        return osnovica;
    }

    private double izracunajPDV(List<StavkaOtpremnice> lista) {
        double iznosPdv = 0;
        for (StavkaOtpremnice so : lista) {
            iznosPdv += so.getIznosPdv();
        }

        return iznosPdv;
    }

    private void inicijalizacija(Racun racun) {

        jButtonKreiraj.setText("Kreiraj word dokument");
        Otpremnica otpremnica = Controller.getInstance().vratiOtpremnicaForRacun(racun);
        jTextFieldNapomena.setText(racun.getNapomena());
        jTextFieldNapomena.setEnabled(false);
        jTextFieldBrojOtpremnice.setText(otpremnica.getBroj());
        jTextFieldBrojOtpremnice.setEnabled(false);
        jTextFieldBrojRacuna.setText(racun.getBroj());
        jTextFieldBrojRacuna.setEnabled(false);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        jTextFieldDatum.setText(format.format(racun.getDatum()));
        jTextFieldDatum.setEnabled(false);
        jTextFieldKomercijalista.setText(racun.getKomercijalista());
        jTextFieldKomercijalista.setEnabled(false);
        jTextFieldMesto.setText(racun.getMesto());
        jTextFieldMesto.setEnabled(false);
        jTextFieldNacinPlacanja.setText(racun.getNacinPlacanja());
        jTextFieldNacinPlacanja.setEnabled(false);
        jTextFieldOsnovica.setText(racun.getOsnovica() + "");
        jTextFieldOsnovica.setEnabled(false);
        jTextFieldPDV.setText(racun.getPdv() + "");
        jTextFieldPDV.setEnabled(false);
        jTextFieldPozivNaBroj.setText(racun.getPozivNaBroj());
        jTextFieldPozivNaBroj.setEnabled(false);
        List<StavkaOtpremnice> lista = new ArrayList<>();
        boolean uspesno = Controller.getInstance().vratiListuStavkiOtpremnica(lista, otpremnica);
        if (uspesno) {
            StavkaOtpremniceModelTabele somt = new StavkaOtpremniceModelTabele(lista, true);
            jTableStavke.setModel(somt);
        } else {
            JOptionPane.showMessageDialog(this, "Sistem ne može da učita listu otpremnica", "Greška", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String izaberiPutanju() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
        fileChooser.setDialogTitle("Izaberite folder za Word dokumente");

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            return selectedFolder.getAbsolutePath();
        } else {
            this.dispose();
        }
        return null;
    }
}
