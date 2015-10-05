/*
 *       Filename:  Multiples.java
 *
 *    Description:  2.26 - Takes 2 integers and determines whether the first is
 *                  a multiple of the second.
 *
 *        Created:  26/09/15 01:06:18
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        if(x % y == 0){
            System.out.printf("%d is a multiple of %d\n", x, y);
        }else{
            System.out.printf("%d is not a multiple of %d\n", x, y);
        }
    }
}
