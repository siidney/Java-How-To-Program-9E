/*
 *       Filename:  Arithmetic2.java
 *
 *    Description:  2.17 - Display the sum, average, product, smallest and
 *                  largest of 2 integers.
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

public class Arithmetic2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int sum;
        int average;
        int product;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        sum = x + y;
        average = (x + y) / 2;
        product = x * y;

        System.out.printf("Sum = %d\n", sum);
        System.out.printf("Average = %d\n", average);
        System.out.printf("Product = %d\n", product);

        if(x > y)
            System.out.printf("%d > %d\n", x, y);

        if(y > x)
            System.out.printf("%d > %d\n", y, x);
    }
}
