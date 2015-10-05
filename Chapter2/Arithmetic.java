/*
 *       Filename:  Arithmetic.java
 *
 *    Description:  2.15 - Prints the sum, product, difference and quotient (division)
 *                  of 2 integers
 *
 *        Created:  26/09/15 00:25:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        sum = x + y;
        product = x * y;

        if(x > y){
            difference = x - y;
            quotient = x % y;
        }else{
            difference = y - x;
            quotient = y % x;
        }

        System.out.printf("sum = %d\nproduct = %d\ndifference = %d\nquotient = %d\n", sum, product, difference, quotient);
    }
}
