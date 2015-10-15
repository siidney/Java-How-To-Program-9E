/*
 *       Filename:  CircleArea.java
 *
 *    Description:  6.20 - Write an application that prompts the user for the
 *                  radius of a circle and uses a method call circleArea to
 *                  calculate the ares of the circle.
 *
 *        Created:  14/10/15 14:55:03
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle get its area: ");
        System.out.printf("Area: %.2f\n", circleArea(sc.nextDouble()));
    }
    // area = pi * radius^2
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
}
