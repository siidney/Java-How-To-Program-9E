/*
 *       Filename:  ComparingIntegers.java
 *
 *    Description:  2.16 - Write an application that asks the user to enter two
 *                  integers, obtains them from the user and display the larger
 *                  followed by the words "is larger". If the numbers are equal,
 *                  print the message "These numbers are equal".
 *
 *        Created:  26/09/15 00:32:32
 *       Revision:  09/10/15 15:35:21
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ComparingIntegers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers separated by a space: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if(x != y)
            System.out.printf("%d is larger\n", Math.max(x, y));
        else
            System.out.print("These numbers are equal\n");
    }
}
