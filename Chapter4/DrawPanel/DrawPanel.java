/*
 *       Filename:  DrawPanel.java
 *
 *    Description:  4.18 - Using drawLine to connect the corners of a panel
 *
 *        Created:  30/09/15 13:05:11
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    // draws an x from the panel corners
    public void paintComponent(Graphics g){
        // call paintComponent to ensure correct panel display
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // draw a line from the upper left to lower right
        g.drawLine(0, 0, width, height);

        // draw a line from lower left to upper right
        g.drawLine(0, height, width, 0);
    }
}
