package Main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Rechner extends JFrame {

    private int lastErg; // Speichert das letzte ergebniss für die erg taste
    private int currentNumber; // Bei Opearationen mit 2 Nummern ist das die erste nummer, die zweite wird
                               // direkt aus dem Display gelesen
    private String currentOpeation = "none"; // Speichert die ausgewählte Rechenoperation

    public Rechner() {
        super("Taschenrechner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
        setSize(400, 450);
        Display display = new Display(this);

        add(display, BorderLayout.NORTH);
        add(new Keys(this, display));

        addComponentListener(new ComponentEvent(display));

        setVisible(true);

    }

    public void setLastErg(int erg) {
        this.lastErg = erg;
    }

    public int getLastErg() {
        return lastErg;
    }

    public void setCurrentNumber(int currentnumber) {
        this.currentNumber = currentnumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentOpeation(String currentOpeation) {
        this.currentOpeation = currentOpeation;
    }

    public String getCurrentOpeation() {
        return currentOpeation;
    }

}
