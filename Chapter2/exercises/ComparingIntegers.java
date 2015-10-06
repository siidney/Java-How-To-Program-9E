/*
 *       Filename:  ComparingIntegers.java
 *
 *    Description:  2.16 - Write an application that asks the user to enter two
 *                  integers, obtains them from the user and display the larger
 *                  followed by the words "is larger". If the numbers are equal,
 *                  print the message "These numbers are equal".
 *
 *        Created:  26/09/15 00:32:32
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ComparingIntegers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        if(x == y)
            System.out.print("These numbers are equal\n");

        if(x > y)
            System.out.printf("%d is larger\n", x);

        if(y > x)
            System.out.printf("%d is larger\n", y);
    }
}
