package Main;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        // Verändert das aussehen je nach Betriebssystem
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Rechner(); // Den Rechner erstellen.

    }

}