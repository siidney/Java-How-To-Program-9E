/*
 *       Filename:  MyOval.java
 *
 *    Description:  10.1 - MyOval class represents an oval
 *
 *        Created:  26/10/15 18:05:45
 *       Revision:  17/11/15 01:06:13
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape{
    // constructor
    public MyOval(){
        super();
    }
    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean isFilled){
        super(x1, x2, y1, y2, color, isFilled);
    }
    // ABSTRACT IMPLEMENTATIONS
    // draw the line in the specified colour
    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());

        if(super.getIsFilled())
            g.fillOval(super.getUpperLeftX(), super.getUpperLeftY(),
                    super.getWidth(), super.getHeight());
        else
            g.drawOval(super.getUpperLeftX(), super.getUpperLeftY(),
                    super.getWidth(), super.getHeight());
    }
}
