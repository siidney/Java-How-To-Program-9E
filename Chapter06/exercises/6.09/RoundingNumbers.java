/*
 *       Filename:  RoundingNumbers.java
 *
 *    Description:  Exercise 6.9 - Rounding Numbers
 *
 *        Created:  11/10/15 20:53:29
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class RoundingNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x = 0.0f, y = 0.0f;

        while(x != -1){
            System.out.print("Enter number for rounding (-1 to exit): ");
            x = sc.nextDouble();
            y = Math.floor(x + 0.5f);

            System.out.printf("Original: %.2f\nRounded: %d\n", x, (int)y);
        }
    }
}
