/*
 *       Filename:  SmallestValue.java
 *
 *    Description:  Exercise 5.11 - Find the Smallest Value
 *
 *        Created:  06/10/15 23:25:39
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SmallestValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numValues = requestInput("Enter number of values to sort: ", sc);

        int smallest = requestInput("Enter value: ", sc);
        --numValues;

        while(numValues > 0){
            int current = requestInput("Enter values: ", sc);

            smallest = Math.min(current, smallest);

            --numValues;
        }
        System.out.printf("The smallest value is %d\n", smallest);
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
