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
    private Color color;

    // constructor
    public MyLine(int x1, int y1, int x2, int y2, Color color){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);

        setColor(color);
    }
    // SETTERS
    public void setX1(int x1){
        this.x1 = (x1 >= 0) ? x1 : 0;
    }
    public void setX2(int x2){
        this.x2 = (x2 >= 0) ? x2 : 0;
    }
    public void setY1(int y1){
        this.y1 = (y1 >= 0) ? y1 : 0;
    }
    public void setY2(int y2){
        this.y2 = (y2 >= 0) ? y2 : 0;
    }
    public void setColor(Color color){
        this.color = color;
    }

    // draw the line in the specified colour
    public void draw(Graphics g){
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}
