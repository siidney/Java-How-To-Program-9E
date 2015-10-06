/*
 *       Filename:  LargestSmallest.java
 *
 *    Description:  2.24 - Write an application that reads five integers and
 *                  determines and prints the largest and smallest integers in
 *                  the group.
 *
 *        Created:  26/09/15 00:53:21
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class LargestSmallest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c, d, e;
        int highest, lowest;

        System.out.print("Enter the first integer: ");
        a = input.nextInt();

        System.out.print("Enter the second integer: ");
        b = input.nextInt();

        System.out.print("Enter the third integer: ");
        c = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        d = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        e = input.nextInt();

        // calculate highest
        if(a > b){
            highest = a;
        }else{
            highest = b;
        }

        if(c > highest)
            highest = c;

        if(d > highest)
            highest = d;

        if(e > highest)
            highest = e;

        // calculate lowest
        if(a < b){
            lowest = a;
        }else{
            lowest = b;
        }

        if(c < lowest)
            highest = c;

        if(d < lowest)
            highest = d;

        if(e < lowest)
            lowest = e;

        System.out.printf("highest = %d\nlowest = %d\n", highest, lowest);
    }
}
