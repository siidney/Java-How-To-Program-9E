/*
 *       Filename:  DrawingCircularSpirals.java
 *
 *    Description:  Exercise 7.1b - Drawing Spirals - Circular
 *
 *        Created:  18/10/15 17:51:30
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingCircularSpirals extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // center points
        int startX = getWidth() / 2;
        int startY = getHeight() / 2;
        int endX = startX;
        int endY = startY;
        int radius = 40;

        g.setColor(Color.BLUE);


        for(int i=0; i<13; i++){
            //          x       y       w       h     start angle, sweep
            g.fillArc(startX, startY, radius, radius, 0, 180);
        }
    }
}
