/*
 *       Filename:  Sphere.java
 *
 *    Description:  Exercise 10.9 - Project: Shape Hierarchy
 *                  3D Sphere
 *
 *        Created:  17/11/15 18:17:11
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Sphere extends ThreeDimensionalShape{
    // constructor
    public Sphere(double radius){
        super(radius);
    }
    // GETTERS
    // surface area
    @Override
    public double getArea(){
        return 4.0f * Math.PI * Math.pow(super.getLength(), 2);
        //return Math.PI * Math.pow(super.getLength(), 2);
    }
    @Override
    public double getVolume(){
        return (4.0f / 3.0f) * Math.PI * Math.pow(super.getLength(), 3);
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s:%.2f\n",
                "Area", getArea(), "Volume", getVolume());
    }
}
