/*
 *       Filename:  DrawingSquareSpirals.java
 *
 *    Description:  Exercise 7.1a - Drawing Spirals - Square
 *
 *                  TODO : Fix lengths so it looks right.
 *
 *        Created:  18/10/15 16:16:05
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

public class DrawingSquareSpirals extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // center points
        int startX = getWidth() / 2;
        int startY = getHeight() / 2;
        int endX = startX;
        int endY = startY;
        int length = 20;

        g.setColor(Color.RED);


        for(int i=0; i<13; i++){

            if(i % 2 == 0){
                endY += length;
            }else{
                endX += -length;
                length = -length * 2;
            }


            g.drawLine(startX, startY, endX, endY);

            startX = endX;
            startY = endY;
        }
    }
}
