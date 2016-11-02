/*
 *       Filename:  Square.java
 *
 *    Description:  Exercise 10.9 - Project: Shape Hierarchy
 *                  2D Square
 *
 *        Created:  17/11/15 18:01:27
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Square extends TwoDimensionalShape{
    // constructor
    public Square(double length){
        super(length);
    }
    // GETTERS
    @Override
    public double getArea(){
        return Math.pow(super.getLength(),2);
    }
    // String representation
    @Override
    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}
