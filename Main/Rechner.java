package Main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Rechner extends JFrame {

    private int lastErg;
    private int currentNumber;
    private String currentOpeation = "none";

    public Rechner() {
        super("Taschenrechner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        setLayout(new BorderLayout());
        setSize(400, 450);
        Display display = new Display(this);

        add(display, BorderLayout.NORTH);
        add(new Keys(this, display));

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
