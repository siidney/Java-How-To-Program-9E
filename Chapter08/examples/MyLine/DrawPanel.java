/*
 *       Filename:  DrawPanel.java
 *
 *    Description:  8.19 - Program that uses class MyLine to draw random lines
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
    private MyLine[] lines;

    // constructor
    public DrawPanel(){
        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // create lines
        for(int count=0; count<lines.length; count++){
            // generate random coords
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // generate a random colour
            Color color = new Color(randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256),
                                    randomNumbers.nextInt(256));

            // add the line to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }
    // for each shape array, draw the individual shapes
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // draw the lines
        for(MyLine line : lines)
            line.draw(g);
    }
}
