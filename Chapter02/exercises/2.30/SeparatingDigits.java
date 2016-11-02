/*
 *       Filename:  SeparatingDigits.java
 *
 *    Description:  Exercise 2.30 - Separating the Digits in an Integer
 *
 *        Created:  26/09/15 11:10:59
 *       Revision:  01/11/16 17:12:22
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SeparatingDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.print("Enter a 5 digit number: ");
        int x = input.nextInt();

        // countdown to ensure numbers don't get reversed
        for(int i=4; i>=0; --i){
            num[i] = x % 10;
            x /= 10;
        }

        for(int i : num){
            System.out.printf("%d   ", i);
        }
        System.out.println();
    }
}
