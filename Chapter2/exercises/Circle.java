/*
 *       Filename:  Circle.java
 *
 *    Description:  2.28 - Write an application that inputs from the user the
 *                  radius of a circle as an integer and prints the circle's
 *                  diameter, circumference and area using the floating point
 *                  value 3.14159 for pi.
 *
 *                  Do not store the results of each calculation in a variable.
 *                  Rather, specify each calculation as the value that will be
 *                  output in a printf statement.
 *
 *        Created:  26/09/15 10:58:54
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int r;

        System.out.print("Enter a circle's radius: ");
        r = input.nextInt();

        System.out.printf("Diameter = %d\n", 2 * r);
        System.out.printf("Circumference = %.2f\n", 2 * Math.PI * r);
        System.out.printf("Area = %.2f\n", Math.PI * r * r);
    }
}
