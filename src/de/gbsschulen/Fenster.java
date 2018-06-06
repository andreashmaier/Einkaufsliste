package de.gbsschulen;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private JPanel jpNorth, jpSouth;
    private JComboBox<String> jComboBox;
    private JTextField jtxtAnzahl;
    private JButton jbtnEitnragen;
    private JLabel jlGesamtpreis;
    private JMenuBar jMenuBar;
    private JMenu jmenuDatei;
    private JMenuItem jmiNeu, jmiSpeichern, jmiBeenden;



    public Fenster() throws HeadlessException {
        super("Einkaufsliste");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initMenu();
        this.initComponents();
        this.setSize(400, 400);
        this.setVisible(true);
    }

    private void initMenu() {
        jMenuBar = new JMenuBar();
        jmenuDatei = new JMenu("Datei");
        jmiNeu = new JMenuItem("Neu");
        jmiSpeichern = new JMenuItem("Speichern...");
        jmiBeenden = new JMenuItem("Beenden");
    }

    private void initComponents() {
        jpNorth = new JPanel();
        jComboBox = new JComboBox<>();
        jComboBox.addItem("Bitte auswählen...");
        jtxtAnzahl = new JTextField(2);
        jbtnEitnragen = new JButton("Eintragen");
        jpNorth.add(jComboBox);
        jpNorth.add(new JLabel("Anzahl: "));
        jpNorth.add(jtxtAnzahl);
        jpNorth.add(jbtnEitnragen);

        jpSouth = new JPanel();
        jpSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jpSouth.add(new JLabel("Gesamtpreis: "));
        jlGesamtpreis = new JLabel("0.00");
        jpSouth.add(jlGesamtpreis);


        this.add(jpNorth, BorderLayout.NORTH);
        this.add(jpSouth, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Fenster();
    }
}
