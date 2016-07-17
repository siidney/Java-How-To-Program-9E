/*
 *       Filename:  DrawPanel.java
 *
 *    Description:  8.1 - Extend 8.18-8.20 to randomly draw rectangles and
 *                  ovals.
 *
 *        Created:  26/10/15 18:08:25
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    private Random randomNumbers = new Random();
    private Random randomBoolean = new Random();
    private MyLine[] lines;
    private MyOval[] ovals;
    private MyRectangle[] rectangles;

    // constructor
    public DrawPanel(){
        setBackground(Color.WHITE);

        lines = new MyLine[1 + randomNumbers.nextInt(5)];
        ovals = new MyOval[1 + randomNumbers.nextInt(5)];
        rectangles = new MyRectangle[1 + randomNumbers.nextInt(5)];

        // create lines
        for(int count=0; count<lines.length; count++){
            // generate random coords
            int x1 = randomNumbers.nextInt(600);
            int y1 = randomNumbers.nextInt(600);
            int x2 = randomNumbers.nextInt(600);
            int y2 = randomNumbers.nextInt(600);

            // generate a random colour
            Color color = new Color(randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256));

            // add the line to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
        // create ovals
        for(int count=0; count<ovals.length; count++){
            // generate random coords
            int x1 = randomNumbers.nextInt(600);
            int y1 = randomNumbers.nextInt(600);
            int x2 = randomNumbers.nextInt(600);
            int y2 = randomNumbers.nextInt(600);

            // generate a random colour
            Color color = new Color(randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256));

            // add the oval to the list of ovals to be displayed
            ovals[count] = new MyOval(x1, y1, x2, y2, color,
                    randomBoolean.nextBoolean());
        }
        // create rectangless
        for(int count=0; count<rectangles.length; count++){
            // generate random coords
            int x1 = randomNumbers.nextInt(600);
            int y1 = randomNumbers.nextInt(600);
            int x2 = randomNumbers.nextInt(600);
            int y2 = randomNumbers.nextInt(600);

            // generate a random colour
            Color color = new Color(randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256));

            // add the oval to the list of ovals to be displayed
            rectangles[count] = new MyRectangle(x1, y1, x2, y2, color,
                    randomBoolean.nextBoolean());
        }

    }
    // for each shape array, draw the individual shapes
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // draw the lines
        for(MyLine line : lines)
            line.draw(g);
        // draw the ovals
        for(MyOval oval : ovals)
            oval.draw(g);
        // draw the rectangles
        for(MyRectangle rect : rectangles)
            rect.draw(g);
    }
}
