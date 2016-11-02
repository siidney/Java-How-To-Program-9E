/*
 *       Filename:  Circle.java
 *
 *    Description:  Exercise 2.28 - Diameter, Circumference and Area of a Circle
 *
 *        Created:  26/09/15 10:58:54
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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

        System.out.printf("Diameter = %d\nCircumference = %.2f\nArea = %.2f\n",
                            2 * r, 2 * Math.PI * r, Math.PI * r * r);
    }
}
