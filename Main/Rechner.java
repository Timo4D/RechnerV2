package Main;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;

public class Rechner extends JFrame {

    private int lastErg;
    private int currentNumber;
    private String currentOpeation = null;
    private JLabel label = new JLabel("Statusmeldungen");

    public Rechner() {
        super("Taschenrechner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));


        Display display = new Display(this);

        add(display);
        add(new Keys(this, display));
        add(label);

        setSize(400,700);
        setVisible(true);
        pack();
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

    public void setCurrentOpeatio(String currentOpeation) {
        this.currentOpeation = currentOpeation;
    }

    public String getCurrentOpeation() {
        return currentOpeation;
    }

    public String getMessage() {
        return label.getText();
    }

    public void setMessage(String message) {
        label.setText(message);
    } 

}


