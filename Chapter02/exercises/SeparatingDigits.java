/*
 *       Filename:  SeparatingDigits.java
 *
 *    Description:  2.30 - Write an application that inputs one number
 *                  consisting of five digits from the user, separates the
 *                  number into its individual digits and prints the digits
 *                  separated from one another by three spaces each.
 *
 *        Created:  26/09/15 11:10:59
 *       Revision:  09/10/15 16:16:40
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
        for(int i=4; i>=0; i--){
            num[i] = x % 10;
            x /= 10;
        }

        for(int i=0; i<num.length; i++){
            System.out.printf("%d   ", num[i]);
        }
        System.out.println();
    }
}
