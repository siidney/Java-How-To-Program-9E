/*
 *       Filename:  MyBoundedShape.java
 *
 *    Description:  10.2 - bounded shapes (oval rectangle) abstract class
 *
 *        Created:  17/11/15 00:59:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape{
    private boolean isFilled;

    // constructor
    public MyBoundedShape(){
        // call MyShape empty constructor
        super();
        setIsFilled(false);
    }
    public MyBoundedShape(int x1, int y1, int x2, int y2, Color color, boolean isFilled){
        // call my shape args constructor
        super(x1, x2, y1, y2, color);

        setIsFilled(isFilled);
    }
    // SETTERS
    public void setIsFilled(boolean isFilled){
        this.isFilled = isFilled;
    }
    // GETTERS
    public boolean getIsFilled(){
        return this.isFilled;
    }
    // gets upper left x coord
    public int getUpperLeftX(){
        return Math.min(this.getX1(), this.getX2());
    }
    // get upper left y coord
    public int getUpperLeftY(){
        return Math.min(this.getY1(), this.getY2());
    }
    // get width
    public int getWidth(){
        return Math.abs(Math.max(this.getX1(), this.getX2())
                - Math.min(this.getX1(), this.getX2()));
    }
    // get height
    public int getHeight(){
        return Math.abs(Math.max(this.getY1(), this.getY2())
                - Math.min(this.getY1(), this.getY2()));
    }
    // ABSTRACT METHODS
    // draw shape
    public abstract void draw(Graphics g);
}
