package Main;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumButton extends JButton implements ActionListener{

    private Display display;

    NumButton(int number, Display display) {
        super(Integer.toString(number));
        addActionListener(this);
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

        if(display.getText().equals("0")) {
            display.clearDisplay();
            display.addNum(e.getActionCommand());
        } else {
            display.addNum(e.getActionCommand());
        }

    }


}
