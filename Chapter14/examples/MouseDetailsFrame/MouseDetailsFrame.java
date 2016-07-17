/*
 *       Filename:  MouseDetailsFrame.java
 *
 *    Description:  14.31 - Demonstrating mouse clicks and distinguishing
 *                  between mouse buttons.
 *
 *        Created:  14/12/15 17:40:56
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame{
    private String details;
    private JLabel statusBar;

    // constructor sets title bar String and registers mouse listener
    public MouseDetailsFrame(){
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());  // add handler
    }
    // inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter{
        // handle mouse click event and determine which button was pressed
        public void mouseClicked(MouseEvent event){
            int xPos = event.getX();
            int yPos = event.getY();

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if(event.isMetaDown())  // rmb
                details += " with right mouse button";
            else if(event.isAltDown())  // mmb
                details += " with middle mouse button";
            else    // lmb
                details += " with left mouse button";

            statusBar.setText(details);
        }
    }
}
