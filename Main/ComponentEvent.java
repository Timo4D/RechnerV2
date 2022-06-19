package Main;

import java.awt.event.ComponentListener;

//Verändet die Breite des display mit der Breite des Fensters

public class ComponentEvent implements ComponentListener {

    private Display display;

    public ComponentEvent(Display display) {
        this.display = display;
    }

    @Override
    public void componentResized(java.awt.event.ComponentEvent e) {
        display.setWidth(e.getComponent().getWidth());
    }

    @Override
    public void componentMoved(java.awt.event.ComponentEvent e) {

    }

    @Override
    public void componentShown(java.awt.event.ComponentEvent e) {

    }

    @Override
    public void componentHidden(java.awt.event.ComponentEvent e) {

    }

}
