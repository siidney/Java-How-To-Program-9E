/*
 *       Filename:  DrawPanel.java
 *
 *    Description:  10.1 - Drawing with Polymorphism
 *
 *        Created:  26/10/15 18:08:25
 *       Revision:  17/11/15 00:21:34
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    private final static int NUM_SHAPES = 3;

    private Random randomNumbers = new Random();
    private Random randomBoolean = new Random();
    private MyShape[] myShape;

    private int lineCount = 0;
    private int ovalCount = 0;
    private int rectCount = 0;

    // constructor
    public DrawPanel(int numShapes){
        if(numShapes <= 0)
            throw new IllegalArgumentException("numShapes must be > 0");

        setBackground(Color.WHITE);

        myShape = new MyShape[numShapes];

        // add all shapes to unsorted 1d array
        // makes it easier to separate into user defined numShapes
        for(int i=0; i<myShape.length; i++){
            // randomly select next shape
            int shape = getRandomInt(NUM_SHAPES);

            // generate coords for each shape
            int x1 = getRandomInt(600);
            int y1 = getRandomInt(600);
            int x2 = getRandomInt(600);
            int y2 = getRandomInt(600);

            // generate a random colour
            Color color = new Color(getRandomInt(256),
                    getRandomInt(256),
                    getRandomInt(256));

            // lines
            if(shape == 0){
                myShape[i] = new MyLine(x1, x2, y1, y2, color);
                lineCount++;
            }
            // ovals
            if(shape == 1){
                myShape[i] = new MyOval(x1, x2, y1, y2, color,
                        randomBoolean.nextBoolean());
                ovalCount++;
            }
            // rectangles
            if(shape == 2){
                myShape[i] = new MyRectangle(x1, x2, y1, y2, color,
                        randomBoolean.nextBoolean());
                rectCount++;
            }
        }
    }
    // generate random ints
    public int getRandomInt(int limit){
        return randomNumbers.nextInt(limit);
    }
    // return string representation of the count of each shape
    public String getStatus(){
        return String.format("%s: %s, %s: %s, %s: %s",
                "Lines", this.lineCount,
                "Ovals", this.ovalCount,
                "Rectangles", this.rectCount);
    }
    // for each shape array, draw the individual shapes
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(MyShape shape : myShape)
            shape.draw(g);
    }
}
