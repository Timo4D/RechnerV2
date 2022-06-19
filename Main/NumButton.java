package Main;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

//Die NumButtons wählen die Zahlen aus, alle haben fast den gleichen Code, deshalb die eigene Klasse

public class NumButton extends JButton implements ActionListener {

    private Display display;

    NumButton(int number, Display display, Font font) {
        super(Integer.toString(number));
        setFont(font);
        addActionListener(this);
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

        if (display.getText().equals("0")) {
            display.clearDisplay();
            display.addNum(e.getActionCommand());
        } else {
            display.addNum(e.getActionCommand());
        }

    }

}
