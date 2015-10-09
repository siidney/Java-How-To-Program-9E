/*
 *       Filename:  MaximumFinder.java
 *
 *    Description:  6.3 - Programmer declared method maximum wiht three double
 *                  parameters.
 *
 *        Created:  09/10/15 15:07:55
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class MaximumFinder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);
    }
    // returns the maximum of its three double paramters
    public static double maximum(double x, double y, double z){
        return Math.max(x, Math.max(y, z));
    }
}
