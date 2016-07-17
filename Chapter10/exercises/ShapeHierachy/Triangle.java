/*
 *       Filename:  Triangle.java
 *
 *    Description:  10.1 - Triangle 2d shape class
 *                  length - height
 *                  width - base
 *
 *        Created:  17/11/15 17:55:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Triangle extends TwoDimensionalShape{
    // constructor
    public Triangle(double length, double width){
        super(length, width);
    }
    // GETTERS
    @Override
    public double getArea(){
        return 0.5 * super.getWidth() * super.getLength();
    }
    // String representation
    @Override
    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}
