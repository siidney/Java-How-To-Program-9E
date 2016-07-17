/*
 *       Filename:  MyLine.java
 *
 *    Description:  10.1 - MyLine class represents a line
 *
 *        Created:  26/10/15 18:05:45
 *       Revision:  17/11/15 00:23:41
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape{
    // constructor
    public MyLine(){
        super();
    }
    public MyLine(int x1, int x2, int y1, int y2, Color color){
        super(x1, x2, y1, y2, color);
    }
    // ABSTRACT IMPLEMENTATIONS
    // draw the line in the specified colour
    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.drawLine(super.getX1(), super.getY1(), super.getX2(), super.getY2());
    }
}
