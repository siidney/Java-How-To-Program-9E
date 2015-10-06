/*
 *       Filename:  Arithmetic.java
 *
 *    Description:  2.15 - Write an application that asks the user to enter two
 *                  integers, obtains them from the user and prints their sum,
 *                  product, difference and quotient (division).
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

        int x = 0;
        int y = 0;
        int difference = 0;
        int quotient = 0;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        // sum
        printSolution("Sum", x + y);

        // product
        printSolution("Product", x * y);

        // difference - avoid negative numbers
        if(x > y)
            printSolution("Difference", x - y);
        else
            printSolution("Difference", y - x);

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
