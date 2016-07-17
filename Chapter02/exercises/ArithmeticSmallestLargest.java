/*
 *       Filename:  ArithmeticSmallestLargest.java
 *
 *    Description:  2.17 - Write an application that inputs three integers from
 *                  the user and displays the sum, average, product, smallest
 *                  and largest of the numbers.
 *
 *        Created:  26/09/15 00:39:16
 *       Revision:  09/10/15 15:43:50
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ArithmeticSmallestLargest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three spaced separated integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // sum
        printResult("Sum", x + y + z);

        // average
        printResult("Average", (x + y + z) / 3);

        // product
        printResult("Product", x * y * z);

        // largest
        printResult("Largest", Math.max(x, Math.max(y, z)));

        // smallest
        printResult("Smallest", Math.min(x, Math.min(y, z)));
    }

    // print result
    private static void printResult(String message, int x){
        System.out.printf("%s = %d\n", message, x);
    }
}
