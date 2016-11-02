/*
 *       Filename:  Cube.java
 *
 *    Description:  Exercise 10.9 - Project: Shape Hierarchy
 *                  3D Cube
 *
 *        Created:  17/11/15 18:18:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Cube extends ThreeDimensionalShape{
    // constructor
    public Cube(double length){
        super(length);
    }
    // GETTERS
    @Override
    public double getArea(){
        return 6 * Math.pow(super.getLength(), 2);
    }
    @Override
    public double getVolume(){
        return Math.pow(super.getLength(), 3);
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s:%.2f\n",
                "Area", getArea(), "Volume", getVolume());
    }
}
