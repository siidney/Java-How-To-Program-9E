/*
 *       Filename:  Rectangle.java
 *
 *    Description:  Exercise 8.4 - Rectangle Class
 *
 *        Created:  28/10/15 16:07:12
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Rectangle{
    private double length;
    private double width;

    // constructor
    public Rectangle(){
        setLength(1.0f);
        setWidth(1.0f);
    }
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    // SETTERS
    public void setLength(double length){
        if(length >= 0.0f && length <=20.0f)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be between 0.0 and 20.0");
    }
    public void setWidth(double width){
        if(width >= 0.0f && width <= 20.0f)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be between 0.0 and 20.0");
    }
    // GETTERS
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    // calculate perimiter
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }
    // calculate area
    public double getArea(){
        return length * width;
    }
    // convert length, width, area and perimiter to string
    public String toString(){
        return String.format(
                "Width: %.2f\nLength: %.2f\nArea: %.2f\nPerimeter: %.2f\n",
                getLength(), getWidth(), getArea(), getPerimeter());
    }
}
