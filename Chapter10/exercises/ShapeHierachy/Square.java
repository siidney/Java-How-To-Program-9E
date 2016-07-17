/*
 *       Filename:  Square.java
 *
 *    Description:  10.1 - Square 2d shape class
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
