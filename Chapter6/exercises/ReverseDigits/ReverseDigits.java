/*
 *       Filename:  ReverseDigits.java
 *
 *    Description:  6.26 - Write a method that takes an integer value and
 *                  returns the number with its digits reversed.
 *
 *        Created:  14/10/15 17:28:18
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ReverseDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer to see it reversed: ");
        System.out.printf("%d\n", reverseInt(sc.nextInt()));
    }
    // reverse, concatenate to string, return string converted to int
    public static int reverseInt(int x){
        String reversed = "";

        while(x != 0){
            reversed += x % 10;
            x /= 10;
        }

        return Integer.parseInt(reversed);
    }
}
