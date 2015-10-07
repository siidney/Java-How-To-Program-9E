/*
 *       Filename:  SmallestValue.java
 *
 *    Description:  5.11 - Write an application that find the smallest of
 *                  several integers. Assume that the first value read specifies
 *                  the number of values to input from the user.
 *
 *        Created:  06/10/15 23:25:39
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SmallestValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int current, smallest, numValues, count = 0;

        numValues = requestInput("Enter number of values to sort: ", sc);

        smallest = requestInput("Enter value: ", sc);
        count++;

        while(count != numValues){
            current = requestInput("Enter value: ", sc);

            if(current < smallest)
                smallest = current;
            ++count;
        }

        System.out.printf("The smallest value is %d\n", smallest);
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
