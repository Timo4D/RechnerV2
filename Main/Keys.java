package Main;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Erstellt die Tastatur und beinhaltet die Rechenmethoden

public class Keys extends JPanel {

    private Rechner rechner;
    private Display display;
    private Font font = new Font("Aharoni", Font.BOLD, 15);

    public Keys(Rechner rechner, Display display) {
        super();

        this.rechner = rechner;
        this.display = display;

        setLayout(new GridLayout(5, 4));

        NumButton b0 = new NumButton(0, display, font);
        NumButton b1 = new NumButton(1, display, font);
        NumButton b2 = new NumButton(2, display, font);
        NumButton b3 = new NumButton(3, display, font);
        NumButton b4 = new NumButton(4, display, font);
        NumButton b5 = new NumButton(5, display, font);
        NumButton b6 = new NumButton(6, display, font);
        NumButton b7 = new NumButton(7, display, font);
        NumButton b8 = new NumButton(8, display, font);
        NumButton b9 = new NumButton(9, display, font);
        MathButton bPlus = new MathButton("+", rechner, display, font);
        MathButton bMinus = new MathButton("-", rechner, display, font);
        MathButton bMal = new MathButton("*", rechner, display, font);
        MathButton bDurch = new MathButton("/", rechner, display, font);
        MathButton bMod = new MathButton("mod", rechner, display, font);
        MathButton bSum = new MathButton("sum", rechner, display, font);
        JButton bErg = new JButton("erg");
        JButton bGleich = new JButton("=");
        JButton bQuer = new JButton("quer");
        JButton bClear = new JButton("clear");

        bErg.addActionListener(e -> {
            System.out.println("erg");
            display.setDisplay(rechner.getLastErg());
        });

        bErg.setFont(font);

        bClear.addActionListener(e -> {
            display.setZero();
            System.out.println(e.getActionCommand());
        });

        bClear.setFont(font);

        bQuer.addActionListener(e -> {
            System.out.println("quer");
            int x = Integer.parseInt(display.getText());

            int erg = 0;

            while (0 != x) {
                // addiere die letzte ziffer der uebergebenen zahl zur summe
                erg = erg + (x % 10);
                // entferne die letzte ziffer der uebergebenen zahl
                x = x / 10;
            }

            rechner.setLastErg(erg);
            rechner.setCurrentNumber(erg);
            display.setDisplay(erg);

        });

        bQuer.setFont(font);

        bGleich.addActionListener(e -> rechnen(rechner, display));

        bGleich.setFont(font);

        add(bErg);
        add(bQuer);
        add(bSum);
        add(bMod);
        add(b7);
        add(b8);
        add(b9);
        add(bPlus);
        add(b4);
        add(b5);
        add(b6);
        add(bMinus);
        add(b1);
        add(b2);
        add(b3);
        add(bMal);
        add(b0);
        add(bClear);
        add(bGleich);
        add(bDurch);

    }

    private int rechnen(Rechner rechner, Display display) {
        System.out.println("=");
        int erg = 0;

        switch (rechner.getCurrentOpeation()) {
            case "+":
                erg = rechner.getCurrentNumber() + display.getNumber();
                break;
            case "/":
                erg = division(rechner.getCurrentNumber(), display.getNumber());
                break;
            case "*":
                erg = rechner.getCurrentNumber() * display.getNumber();
                break;
            case "-":
                erg = rechner.getCurrentNumber() - display.getNumber();
                break;
            case "mod":
                erg = rechner.getCurrentNumber() % display.getNumber();
                break;
            case "sum":
                erg = sum(rechner.getCurrentNumber(), display.getNumber());
                break;
            case "none":
                JOptionPane.showMessageDialog(null, "Es wurde keie Rechenoperation ausgewählt", "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ein Fehler mit den Rechenopeartionen ist aufgetreten", "Error",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }

        rechner.setCurrentOpeation("none");
        rechner.setLastErg(erg);
        display.setDisplay(erg);
        return erg;
    }

    private int sum(int start, int end) {

        int erg = 0;

        for (int i = start; i < end; i++) {
            erg += i;
        }

        return erg;
    }

    private int division(int x, int y) {

        int erg = 0;

        if (y == 0) {
            JOptionPane.showMessageDialog(null, "Es kann nicht durch 0 geteilt werden", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            erg = x / y;
        }

        return erg;

    }

}
