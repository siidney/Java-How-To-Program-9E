/*
 *       Filename:  MyLine.java
 *
 *    Description:  8.18 - MyLine class represents a line
 *
 *        Created:  26/10/15 18:05:45
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public class MyLine{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;

    // constructor
    public MyLine(int x1, int y1, int x2, int y2, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        myColor = color;
    }
    // draw the line in the specified colour
    public void draw(Graphics g){
        g.setColor(myColor);
        g.drawLine(x1, y1, x2, y2);
    }
}
