/*
 *       Filename:  MyOval.java
 *
 *    Description:  8.18 - MyOval class represents an oval
 *
 *        Created:  26/10/15 18:05:45
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.Graphics;

public class MyOval{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private boolean isFilled;
    private Color color;

    // constructor
    public MyOval(){
        setX1(0);
        setY1(0);
        setX2(0);
        setY2(0);

        setIsFilled(false);
        setColor(Color.BLACK);
    }
    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean isFilled){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);

        setIsFilled(isFilled);
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
    public void setIsFilled(boolean isFilled){
        this.isFilled = isFilled;
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
    public boolean getIsFilled(){
        return this.isFilled;
    }
    public Color getColor(){
        return this.color;
    }
    // gets upper left x coord
    private int getUpperLeftX(){
        return Math.min(x1, x2);
    }
    // get upper left y coord
    private int getUpperLeftY(){
        return Math.min(y1, y2);
    }
    // get width
    private int getWidth(){
        return Math.abs(Math.max(getX1(), getX2()) - Math.min(getX1(), getX2()));
    }
    // get height
    private int getHeight(){
        return Math.abs(Math.max(getY1(), getY2()) - Math.min(getY1(), getY2()));
    }
    // draw the line in the specified colour
    public void draw(Graphics g){
        g.setColor(getColor());

        if(getIsFilled())
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        else
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }
}
