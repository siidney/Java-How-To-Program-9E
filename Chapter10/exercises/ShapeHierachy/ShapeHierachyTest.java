/*
 *       Filename:  ShapeHierachyTest.java
 *
 *    Description:  10.9 - Create a program that uses an array of Shape
 *                  references to objects of each concrete class in the
 *                  hierarchy.
 *                  The program should print a text description of the object to
 *                  which each array element refers.
 *                  Also, in the loop that processes all the shapes in the
 *                  array, determine whether each shape is a TwoDimensionalShape
 *                  or a ThreeDimensionalShape.
 *                  TwoDimensionalShape - display area
 *                  ThreeDimensionalShape - display area and volume.
 *
 *
 *        Created:  17/11/15 17:27:55
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ShapeHierachyTest{
    public static void main(String[] args){
        Shape[] shapes = new Shape[6];

        shapes[0] = new Triangle(3, 4);
        shapes[1] = new Square(5);
        shapes[2] = new Circle(7);
        shapes[3] = new Sphere(11);
        shapes[4] = new Cube(5);
        shapes[5] = new Tetrahedron(4);

        for(int i=0; i<shapes.length; i++){
            System.out.printf("%s\n%s\n",
                    shapes[i].getClass().getName(),
                    shapes[i].toString());
        }

    }
}
