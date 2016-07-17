/*
 *       Filename:  ThreeDimensionalShape.java
 *
 *    Description:  10.9 - represents a three dimensional shape
 *
 *        Created:  17/11/15 17:38:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public abstract class ThreeDimensionalShape extends Shape{
    private double height;

    // constructor
    public ThreeDimensionalShape(){
        super();
        setHeight(0);
    }
    public ThreeDimensionalShape(double width){
        super(width);
    }
    public ThreeDimensionalShape(double length, double width){
        super(length, width);
    }
    public ThreeDimensionalShape(double length, double width, double height){
        super(length, width);
        setHeight(height);
    }
    // SETTERS
    public void setHeight(double h){
        this.height = (h > 0.0f) ? h : 0.0f;
    }
    // GETTERS
    public double getHeight(){
        return this.height;
    }
    // ABSTRACT METHODS
    // get area
    public abstract double getArea();
    // get volume
    public abstract double getVolume();
}
