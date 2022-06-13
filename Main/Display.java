package Main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Display extends Container {

    private JTextField t1;

    public Display() {
        setLayout(new FlowLayout(FlowLayout.CENTER));


        t1 = new JTextField("0", 15);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setFont(new Font("Calibri", Font.BOLD, 20));
        add(t1);

    }

    public String getText() {
        return t1.getText();
    }
    
    public int getNumber() {

        try{
            System.out.println(Integer.parseInt(t1.getText()));
            return Integer.parseInt(t1.getText());
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Keine Buchstaben erlaubt", "Buchstaben error", JOptionPane.ERROR_MESSAGE);
            clearDisplay();
            
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
