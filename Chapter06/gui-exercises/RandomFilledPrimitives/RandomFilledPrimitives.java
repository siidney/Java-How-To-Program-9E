/*
 *       Filename:  RandomFilledPrimitives.java
 *
 *    Description:  6.2 - Create a program that draws 10 random filled shapes in
 *                  random colors, positions and sizes. Method paintComponent
 *                  should contain a loop that iterates 10 times. In each
 *                  iteration the loop should determine whether to draw a filled
 *                  rectangle or an oval, create a random color and choose
 *                  coordinates and dimensions at random. The coordiantes should
 *                  be chosen based on the panels width and height. Lengths of
 *                  sides should be limited to half the width or height of the
 *                  window.
 *
 *        Created:  10/10/15 00:32:19
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
import java.util.Random;

public class RandomFilledPrimitives extends JPanel{
    Random randomGenerator = new Random();

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        for(int i=0; i<10; i++){

            // set random colour
            Color color = new Color(randomGenerator.nextInt(255),
                                    randomGenerator.nextInt(255),
                                    randomGenerator.nextInt(255));

            g.setColor(color);

            // determine shaped and set coords/size
            if(randomGenerator.nextInt(2) == 0)
                g.fillRect(randomGenerator.nextInt(width),
                           randomGenerator.nextInt(height),
                           randomGenerator.nextInt(width / 2),
                           randomGenerator.nextInt(height / 2));
            else
                g.fillOval(randomGenerator.nextInt(width),
                           randomGenerator.nextInt(height),
                           randomGenerator.nextInt(width / 2),
                           randomGenerator.nextInt(height / 2));
        }
    }
}
