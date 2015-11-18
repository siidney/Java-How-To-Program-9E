/*
 *       Filename:  TwoDimensionalShape.java
 *
 *    Description:  10.9 - Represents a 2 dimensional shape
 *
 *        Created:  17/11/15 17:37:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public abstract class TwoDimensionalShape extends Shape{
    // constructor
    public TwoDimensionalShape(){
        super();
    }
    public TwoDimensionalShape(double length){
        super(length);
    }
    public TwoDimensionalShape(double length, double width){
        super(length, width);
    }
    // ABSTRACT METHODS
    // get area
    public abstract double getArea();
}
