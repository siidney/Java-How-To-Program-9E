/*
 *       Filename:  FindTheMinimum.java
 *
 *    Description:  6.23 - Write a method 'minimum3' that returns the smallest
 *                  of 3 floating point numbers.
 *                  Use the Math.min() method to implement 'minimum3'.
 *                  Incorporate the method into an application that reads 3
 *                  values from the user, determines the smallest value and
 *                  displays the results.
 *
 *        Created:  14/10/15 16:35:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class FindTheMinimum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 space separated numbers: ");
        System.out.printf("Minimum value is: %.2f\n",
                minumum3(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
    public static double minumum3(double x, double y, double z){
        return Math.min(x, Math.min(y, z));
    }
}
