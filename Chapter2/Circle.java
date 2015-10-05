/*
 *       Filename:  Circle.java
 *
 *    Description:  2.28 - Returns a circles diameter, circumference and area from a radius.
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
        double diameter, circumference, area;

        System.out.print("Enter a circle's radius: ");
        r = input.nextInt();

        diameter = 2 * r;
        circumference = 2 * Math.PI * r;
        area = Math.PI * r * r;

        System.out.printf("Radius = %d\n", r);
        System.out.printf("Diamter = %.2f\n", diameter);
        System.out.printf("Circumference = %.2f\n", circumference);
        System.out.printf("Area = %.2f\n", area);
    }
}
