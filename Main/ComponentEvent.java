package Main;


import java.awt.event.ComponentListener;

public class ComponentEvent implements ComponentListener{

    private Display display;

    public ComponentEvent(Display display) {
        this.display= display;
    }


    @Override
    public void componentResized(java.awt.event.ComponentEvent e) {
        display.setWidth(e.getComponent().getWidth());  
    }

    @Override
    public void componentMoved(java.awt.event.ComponentEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void componentShown(java.awt.event.ComponentEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void componentHidden(java.awt.event.ComponentEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
