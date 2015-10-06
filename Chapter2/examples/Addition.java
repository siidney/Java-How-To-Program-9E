/*
 *       Filename:  Addition.java
 *
 *    Description:  Addition program to display the sum of 2 numbers
 *
 *        Created:  25/09/15 23:50:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        // create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d\n", sum);
    }
}
