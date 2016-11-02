/*
 *       Filename:  Circle.java
 *
 *    Description:  Exercise 10.9 - Project: Shape Hierarchy
 *                  2D circle
 *
 *        Created:  17/11/15 18:06:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Circle extends TwoDimensionalShape{
    // constructor
    public Circle(double radius){
        super(radius);
    }
    // GETTERS
    @Override
    public double getArea(){
        return Math.PI * Math.pow(super.getLength(), 2);
    }
    // String representation
    @Override
    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}
