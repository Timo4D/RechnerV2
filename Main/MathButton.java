package Main;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//MathButtons sind Buttons die Rechenopearationen auswählen, alle haben fast den gleichen code, deshalb die eigene Klasse

public class MathButton extends JButton implements ActionListener {

    private Rechner rechner;
    private Display display;

    public MathButton(String operator, Rechner rechner, Display display, Font font) {
        super(operator);
        this.rechner = rechner;
        this.display = display;
        setFont(font);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        rechner.setCurrentOpeation(action);
        System.out.println(action);
        rechner.setCurrentNumber(display.getNumber());
        display.setZero();

    }

}
