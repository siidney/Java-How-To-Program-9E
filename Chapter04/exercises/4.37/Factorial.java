/*
 *       Filename:  Factorial.java
 *
 *    Description:  Exericse 4.37 - Factorial
 *
 *                  NOTE: I have no idea if b or c are correct or not as I am
 *                  not mathematically inclined.
 *
 *        Created:  05/10/15 23:06:41
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // A
        System.out.print("Enter a number to compute its factorial: ");
        int f = sc.nextInt();

        System.out.printf("The factorial of %d = %d\n", f, getFactorial(f));

        // B
        System.out.print("Enter the number of times to calculate e: ");
        int n = sc.nextInt();

        System.out.printf("e = %.2f\n", getConstantE(n));

        // C
        System.out.print("Enter the number of times to calculate e^x: ");
        n = sc.nextInt();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.printf("e^%d %d times = %.2f\n", n, n, getValueE(n, x));
    }
    // A - compute and return factorial
    // x! = x-1 * x-1 * x-1 * x-1 ...
    private static int getFactorial(int x){
        int factorial = x;

        if(x > 1)
            x--;

        while(x > 0){
            factorial *= x;
            x--;
        }
        return factorial;
    }
    // B - compute mathematical constant e
    // e = 1 + 1/1! + 1/2! + 1/3...
    private static double getConstantE(int x){
        double e = 1.0;

        for(int i=1; i<=x; i++){
            e += 1.0/getFactorial(i);
        }
        return e;
    }
    // C - compute value of e^x.
    // e^x = 1 + x/1! + x^2/2! + x^3/3!...
    private static double getValueE(int n, int x){
        double e = 1.0;

        for(int i=1; i<=n; i++){
            e += x/getFactorial(i);
            x = (int)Math.pow(x, i);
        }
        return e;
    }
}
