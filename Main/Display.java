package Main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTextField;

public class Display extends Container {

    private JTextField t1;
    private Rechner rechner;

    public Display(Rechner rechner) {
        setLayout(new FlowLayout());

        this.rechner = rechner;

        t1 = new JTextField("0", 15);
        t1.setFont(new Font("Calibri", Font.BOLD, 20));
        add(t1);

    }

    public String getText() {
        return t1.getText();
    }
    
    public int getNumber() {

        try{
            return Integer.parseInt(t1.getText());
        } catch (Exception e) {
            System.out.println(e);
            clearDisplay();
            rechner.setMessage("Buchstaben sind nicht erlaubt");
        }

        return 0;
    }

    public void setDisplay(String text) {
        t1.setText(text);
    }

    public void setDisplay(int number) {
        t1.setText(Integer.toString(number));
    }

    public void clearDisplay() {
        t1.setText("");
    }

    public void setZero() {
        t1.setText("0");
    }

    public void addNum(String text) {
        t1.setText(t1.getText()+text);
    }

}
