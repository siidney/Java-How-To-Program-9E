/*
 *       Filename:  OddEven.java
 *
 *    Description:  Exercise 2.25 - Odd or Even
 *
 *        Created:  26/09/15 01:02:02
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter an integer: ");
        x = input.nextInt();

        System.out.printf("%d is %s\n", x, (x % 2 == 0 ? "even": "odd"));
    }
}
