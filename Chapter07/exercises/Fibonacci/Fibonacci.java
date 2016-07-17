/*
 *       Filename:  Fibonacci.java
 *
 *    Description:  7.29 -
 *                  a) write a method 'fibonacci(n)' that calculates the nth
 *                  fibonacci number. Incorporte this method into an application
 *                  that enables the user to enter the value of n.
 *                  b) Determine the largest fibonacci number that can be
 *                  displayed on you system.
 *                  c) Modify the application you wrote in (a) to use double
 *                  instead of int to calculate and return fibonacci numbers,
 *                  and use this modified application to repeat (b).
 *
 *        Created:  20/10/15 18:34:33
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth number to calculate fibonacci to: ");
        System.out.println(fibonacci(sc.nextInt()));
    }
    // fibonacci
    public static double fibonacci(double n){
        // base case (not possible to positively reduce)
        if(n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
