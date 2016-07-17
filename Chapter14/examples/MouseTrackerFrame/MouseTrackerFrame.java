/*
 *       Filename:  MouseTrackerFrame.java
 *
 *    Description:  14.28 - Demonstrating mouse events
 *
 *        Created:  11/12/15 18:38:08
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame{
    private JPanel mousePanel;
    private JLabel statusBar;

    // MouseTrackerFrame constructor sets up GUI and registers
    // mouse event handlers
    public MouseTrackerFrame(){
        super("Demonstrating mouse events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH);

        // create and register listener for mouse and mouse motion events
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener{
        // MouseListener event handlers
        // handle event when mouse released immediately after press
        public void mouseClicked(MouseEvent event){
            statusBar.setText(String.format("Clicked at [%d, %d]",
                        event.getX(), event.getY()));
        }
        // handle event when mouse pressed
        public void mousePressed(MouseEvent event){
            statusBar.setText(String.format("Pressed at [%d, %d]",
                        event.getX(), event.getY()));
        }
        // handle event when mouse released
        public void mouseReleased(MouseEvent event){
            statusBar.setText(String.format("Released at [%d, %d]",
                        event.getX(), event.getY()));
        }
        // handle event when mouse enters area
        public void mouseEntered(MouseEvent event){
            statusBar.setText(String.format("Mouse entered at [%d, %d]",
                        event.getX(), event.getY()));
            mousePanel.setBackground(Color.GREEN);
        }
        // handle event when mouse exits area
        public void mouseExited(MouseEvent event){
            statusBar.setText(String.format("Mouse outside JPanel"));
            mousePanel.setBackground(Color.WHITE);
        }
        // MouseMotionListener event handlers
        // handle event when user drags mouse with button pressed
        public void mouseDragged(MouseEvent event){
            statusBar.setText(String.format("Dragged at [%d, %d]",
                        event.getX(), event.getY()));
        }
        // handle event when user moves mouse
        public void mouseMoved(MouseEvent event){
            statusBar.setText(String.format("Moved at [%d, %d]",
                        event.getX(), event.getY()));
        }
    }
}
