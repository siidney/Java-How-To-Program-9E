/*
 *       Filename:  SeparatingDigits.java
 *
 *    Description:  2.30 - separates a 5 digit number into separate digits.
 *
 *        Created:  26/09/15 11:10:59
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SeparatingDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter a 5 digit number: ");
        x = input.nextInt();

        int n1 = x % 10;
        x /= 10;

        int n2 = x % 10;
        x /= 10;

        int n3 = x % 10;
        x /= 10;

        int n4 = x % 10;
        x /= 10;

        int n5 = x % 10;
        x /= 10;

        System.out.printf("%d %d %d %d %d\n", n5, n4, n3, n2, n1);
    }
}
