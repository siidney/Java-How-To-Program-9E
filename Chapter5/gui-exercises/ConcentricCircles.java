/*
 *       Filename:  ConcentricCircles.java
 *
 *    Description:  5.1 - Draw 12 concentric circles in the center of a JPanel.
 *                  The innermost circle should have a radius of 10 pixels, and
 *                  each successive circle should have a radius 10 pixels larger
 *                  than the previous one.
 *
 *        Created:  06/10/15 16:21:12
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class ConcentricCircles extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int centerPosX = width / 2;
        int centerPosY = height / 2;

        for(int i=0; i<12; i++){
            g.drawOval(centerPosX, centerPosY, i * 10, i * 10);
            centerPosX -= 5;
            centerPosY -= 5;
        }
    }
}
