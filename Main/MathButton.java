package Main;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathButton extends JButton implements ActionListener {

    private Rechner rechner;
    private Display display;

    public MathButton(String operator, Rechner rechner, Display display) {
        super(operator);
        this.rechner = rechner;
        this.display = display;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        rechner.setCurrentOpeatio(action);
        System.out.println(action);
        rechner.setCurrentNumber(display.getNumber());
        display.setZero();

    }

}
