/*
 *       Filename:  GreatestCommonDivisor.java
 *
 *    Description:  6.27 - Write a method gcd that returns the greatest common
 *                  divisor or two integers.
 *
 *                  The greatest common divisor of two integers is the largest
 *                  integer that evenly divides each of the numbers.
 *
 *        Created:  14/10/15 17:53:12
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class GreatestCommonDivisor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two space separated positive integers: ");
        System.out.printf("The Greatest Common divisor is: %d\n",
                gcd(sc.nextInt(), sc.nextInt()));

    }
    // Euclid's method.
    // start with 2 numbers (x, y)
    // if y == 0 then gcd = x
    // if not x = y, y = x % y
    public static int gcd(int x, int y){
        // base case
        return (y == 0) ? x : gcd(y, x % y);
    }
}
