package Main;

import javax.swing.BoxLayout;
import javax.swing.JFrame;


public class Rechner extends JFrame {

    private int lastErg;
    private int currentNumber;
    private String currentOpeation = "none";

    public Rechner() {
        super("Taschenrechner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));


        Display display = new Display();

        
        
        add(display);
        add(new Keys(this, display));

        setSize(400,700);
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


