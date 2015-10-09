/*
 *       Filename:  Arithmetic.java
 *
 *    Description:  2.15 - Write an application that asks the user to enter two
 *                  integers, obtains them from the user and prints their sum,
 *                  product, difference and quotient (division).
 *
 *        Created:  26/09/15 00:25:00
 *       Revision:  09/10/15 15:40:40
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int difference = 0;
        int quotient = 0;

        System.out.print("Enter 2 integers separated by a space: ");
        int x = input.nextInt();
        int y = input.nextInt();

        // sum
        printSolution("Sum", x + y);

        // product
        printSolution("Product", x * y);

        // difference - take absolute value to avoid negative numbers
        printSolution("Difference", Math.abs(x - y));

        if(x != 0 && y != 0)
            printSolution("Quotient", y % x);
        else
            printSolution("Quotient error: Cannot divide by zero", 0);
    }
    // show the solution/any error messages (division by zero)
    private static void printSolution(String message, int value){
        System.out.printf("%s = %d\n", message, value);
    }
}
