/*
 *       Filename:  Fibonacci.java
 *
 *    Description:  Exercise 7.29 - Fibonacci Series
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
