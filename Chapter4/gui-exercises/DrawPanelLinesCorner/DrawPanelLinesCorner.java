/*
 *       Filename:  DrawPanelLinesCorner.java
 *
 *    Description:  4.1 - Create a program to mimic the design of 4.20.
 *
 *        Created:  30/09/15 16:16:32
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelLinesCorner extends JPanel{
    public void paintComponent(Graphics g){
        // call paintComponent to ensure correct panel display
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int wSteps = width / 15;
        int hSteps = height / 15;

        int xDelta = wSteps;
        int yDelta = height;

        // draw a series of lines fanning from top corner
        for(int i=0; i<15; i++){
            g.drawLine(0, 0, xDelta, yDelta);

            xDelta º+= wSteps;
            yDelta -= hSteps;

        }
    }
}
