/*
 *       Filename:  ComparingIntegers.java
 *
 *    Description:  2.16 - Compares 2 integers and displays which is larger or
 *                  if they are both equal.
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
