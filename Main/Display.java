package Main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Display extends Container {

    private JTextField t1;
    private Rechner rechner;

    public Display(Rechner rechner) {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        this.rechner = rechner;

        t1 = new JTextField("0");

        int width = rechner.getWidth();
        System.out.println(width);

        t1.setPreferredSize(new Dimension(width, 50));
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setFont(new Font("Calibri", Font.BOLD, 40));

        add(t1);

    }

    public String getText() {
        return t1.getText();
    }

    public int getNumber() {

        try {
            System.out.println(Integer.parseInt(t1.getText()));
            return Integer.parseInt(t1.getText());
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Keine Buchstaben erlaubt", "Buchstaben error",
                    JOptionPane.ERROR_MESSAGE);
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
        t1.setText(t1.getText() + text);
    }

    public void setWidth(int width) {
        t1.setPreferredSize(new Dimension(width, 50));
    }

}
