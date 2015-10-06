/*
 *       Filename:  ArithmeticSmallestLargest.java
 *
 *    Description:  2.17 - Write an application that inputs three integers from
 *                  the user and displays the sum, average, product, smallest
 *                  and largest of the numbers.
 *
 *        Created:  26/09/15 00:39:16
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ArithmeticSmallestLargest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        // sum
        printResult("Sum", x + y + z);

        // average
        printResult("Average", (x + y + z) / 3);

        // product
        printResult("Product", x * y * z);

        // calculate largest
        if(x > y){
            largest = x;
        }else{
            largest = y;
        }

        if(z > largest)
            largest = z;

        // calculate smallest
        if(x < y){
            smallest = x;
        }else{
            smallest = y;
        }

        if(z < smallest)
            smallest = z;

        // largest
        printResult("Largest", largest);

        // smallest
        printResult("Smallest", smallest);
    }

    // print result
    private static void printResult(String message, int x){
        System.out.printf("%s = %d\n", message, x);
    }
}
