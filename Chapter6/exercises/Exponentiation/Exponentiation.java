/*
 *       Filename:  Exponentiation.java
 *
 *    Description:  6.14 - Write a integerPower(base, exponent) that returns the
 *                  value of base^exponent.
 *
 *                  Assume that exponent is a positive, nonzero integer and that
 *                  base is an integer.
 *                  Use a for or while loop statement to control the
 *                  calculation.
 *                  Do not use any Math class methods.
 *                  Incorporate this method into an application that reads
 *                  integer values for base and exponent and performs the
 *                  calculations with the integerPower method.
 *
 *        Created:  11/10/15 21:20:30
 *       Revision:  14/10/15 14:07:46
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Exponentiation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long base = 0;
        int exponent = 0;

        while(base != -1){
            System.out.print("Enter base (-1 to exit): ");
            base = sc.nextInt();

            if(base != -1){
                System.out.print("Enter exponent: ");
                exponent = sc.nextInt();

                System.out.println(Math.pow(base, exponent));

                System.out.printf("%d^%d: %d\n",
                        base, exponent, integerPower(base, exponent));
            }
        }
    }
    public static long integerPower(long base, int exponent){
        // base condition
        if(exponent <= 1)
            return base;

        // call self after calculating power with reduced exponent
        return base * integerPower(base, --exponent);
    }
}
