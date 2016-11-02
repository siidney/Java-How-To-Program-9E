/*
 *       Filename:  TwoDimensionalShape.java
 *
 *    Description:  Exercise 10.9 - Project: Shape Hierarchy
                    Generic 2D shape
 *
 *        Created:  17/11/15 17:37:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
