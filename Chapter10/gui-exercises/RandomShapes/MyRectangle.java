/*
 *       Filename:  MyRectangle.java
 *
 *    Description:  10.1 - MyRectangle class represents a rectangle.
 *
 *        Created:  26/10/15 18:05:45
 *       Revision:  17/11/15 01:06:03
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape{
    // constructor
    public MyRectangle(){
        super();
    }
    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean isFilled){
        super(x1, x2, y1, y2, color, isFilled);
    }
    // ABSTRACT IMPLEMENTATIONS
    // draw the line in the specified colour
    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());

        if(super.getIsFilled())
            g.fillRect(super.getUpperLeftX(), super.getUpperLeftY(),
                    super.getWidth(), super.getHeight());
        else
            g.drawRect(super.getUpperLeftX(), super.getUpperLeftY(),
                    super.getWidth(), super.getHeight());
    }
}
