/*
 *       Filename:  MyShape.java
 *
 *    Description:  10.1 - abstract shape class
 *
 *        Created:  16/11/15 19:11:08
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    // constructor
    public MyShape(){
        setX1(0);
        setX2(0);
        setY1(0);
        setY2(0);
        setColor(Color.BLACK);
    }
    public MyShape(int x1, int x2, int y1, int y2, Color color){
        setX1(x1);
        setX2(x2);
        setY1(y1);
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
    // GETTERS
    public int getX1(){
        return this.x1;
    }
    public int getX2(){
        return this.x2;
    }
    public int getY1(){
        return this.y1;
    }
    public int getY2(){
        return this.y2;
    }
    public Color getColor(){
        return this.color;
    }
    // ABSTRACT METHODS
    // draw shape
    public abstract void draw(Graphics g);
}
