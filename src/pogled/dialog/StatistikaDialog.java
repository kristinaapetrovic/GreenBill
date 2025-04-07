/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pogled.dialog;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import main.AppStyles;
import main.HistogramExample;
import main.StackedDiagram;

/**
 *
 * @author Andrej
 */
public class StatistikaDialog extends javax.swing.JDialog {

    private JFrame parent;
    /**
     * Creates new form StatistikaDialog
     */
    private static List<Integer> vreme = new ArrayList<>();
    private static List<Double> vrednosti = new ArrayList<>();
    private static List<String> mesta = new ArrayList<>();
    private static boolean isGodina;

    public StatistikaDialog(JFrame parent, boolean modal, ArrayList<Integer> vreme, boolean isGodina, ArrayList<Double> vrednosti, String cenaKolicina, String prosekUkupno) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.parent = parent;
        this.vreme = vreme;
        this.vrednosti = vrednosti;
        this.isGodina = isGodina;
        HistogramExample.kreirajGrafikon(jPanelGraph, vreme, isGodina, vrednosti, cenaKolicina,prosekUkupno);
        ChartPanel chartPanel = (ChartPanel) jPanelGraph.getComponent(0);  // Pretpostavljamo da je grafikon prvi komponent u jPanelGraph
        JFreeChart chart = chartPanel.getChart();  // Dobijanje JFreeChart objekta iz ChartPanel-a

        // Postavljanje stila na grafikon
        AppStyles.setChartStyles(chart);  // Postavljanje stila
    }

    public StatistikaDialog(java.awt.Frame parent, boolean modal, List<Integer> vreme, boolean isGodina, List<String> mesta, List<Double> vrednosti, String cenaKolicina, String prosekUkupno) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.vreme = vreme;
        this.vrednosti = vrednosti;
        this.isGodina = isGodina;
        this.mesta = mesta;
        StackedDiagram.createStackedBarChart(jPanelGraph, mesta, vreme, isGodina, vrednosti, cenaKolicina,prosekUkupno);
        ChartPanel chartPanel = (ChartPanel) jPanelGraph.getComponent(0);  // Pretpostavljamo da je grafikon prvi komponent u jPanelGraph
        JFreeChart chart = chartPanel.getChart();  // Dobijanje JFreeChart objekta iz ChartPanel-a

        // Postavljanje stila na grafikon
        AppStyles.setChartStyles(chart);  // Postavljanje stila

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGraph = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelGraph.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelGraphLayout = new javax.swing.GroupLayout(jPanelGraph);
        jPanelGraph.setLayout(jPanelGraphLayout);
        jPanelGraphLayout.setHorizontalGroup(
            jPanelGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanelGraphLayout.setVerticalGroup(
            jPanelGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelGraph;
    // End of variables declaration//GEN-END:variables
}
