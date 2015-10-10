/*
 *       Filename:  BullsEye.java
 *
 *    Description:  6.1 - Using method fillOval, draw a bull's-eye that
 *                  alternates between two random colours, as in Fig. 6.13. Use
 *                  the constructor Color(int r, int g, int b) with random
 *                  arguments to generate random colours.
 *
 *        Created:  09/10/15 23:49:51
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class BullsEye extends JPanel{
    Random randomColor = new Random();

    Color color1 = new Color(randomColor.nextInt(255),
                             randomColor.nextInt(255),
                             randomColor.nextInt(255));

    Color color2 = new Color(randomColor.nextInt(255),
                             randomColor.nextInt(255),
                             randomColor.nextInt(255));

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int circleWidth = 200;
        int circleHeight = 200;

        int centerPosX = (getWidth() / 2) - circleWidth / 2;
        int centerPosY = (getHeight() / 2) - circleHeight / 2;

        // need to start from outside in else colours get overwrote
        for(int i=0; i<5; i++){

            if(i % 2 == 0)
                g.setColor(color1);
            else
                g.setColor(color2);

            g.fillOval(centerPosX, centerPosY, circleWidth, circleHeight);

            centerPosX += 20;
            centerPosY += 20;
            circleWidth -= 40;
            circleHeight -= 40;
        }
    }
}
