/*
 *       Filename:  SeparatingDigits.java
 *
 *    Description:  6.24 - Write methods that accomplish each of the following:
 *                  a) Calculate the integer part of the quotient when integer a
 *                     is divided by integer b.
 *                  b) Calculate the integer remainder when integer a is divided
 *                     by integer b.
 *                  c) Use the methods developed in a and b to write a method
 *                     'displayDigits' that receives an integer between 1 and
 *                     99999 and displays it as a sequence of digits, separating
 *                     each of the digits by two spaces.
 *                  Incorporate the methods into an application that inputs an
 *                  integer and calls 'displayDigits' by passing the method the
 *                  integer entered.
 *                  Display the results.
 *
 *        Created:  14/10/15 15:00:35
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SeparatingDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 0-99999: ");
        displayDigits(sc.nextInt());
    }
    // A - calculate the integer part of the quotient when a is divided by b
    private static int getQuotient(int a, int b){
        return a % b;
    }
    // B - calculate the integer remainder when a is divided by b
    private static int getRemainder(int a, int b){
        return a / b;
    }
    // C
    public static void displayDigits(int x){
        int[] numVal = new int[String.valueOf(x).length()];

        // add separated digits to list
        for(int i=numVal.length-1; i>=0; i--){
            numVal[i] = getQuotient(x, 10);
            x = getRemainder(x, 10);
        }

        for(int i=0; i<numVal.length; i++){
            System.out.printf("%d  ", numVal[i]);
        }

        System.out.println();
    }
}
