/*
 *       Filename:  DivideByZeroExceptionHandling.java
 *
 *    Description:  11.1 - Integer division without exception handling.
 *
 *        Created:  23/11/15 16:56:47
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class DivideByZeroExceptionHandling{
    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator){
        return numerator / denominator;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Please enter an integer denominator: ");
        int denominator = sc.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("\nResult: %d / %d = %d\n",
                numerator, denominator, result);
    }
}
