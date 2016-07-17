/*
 *       Filename:  NumericalPalindromeTest.java
 *
 *    Description:  4.30 - determine whether a 5 digit number is a palindrone
 *
 *        Created:  01/10/15 19:44:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class NumericalPalindromeTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NumericalPalindrome np = new NumericalPalindrome();

        while(true){
            System.out.print("Enter a 5 digit number to test: ");
            int testCase = sc.nextInt();

            if(np.validate(testCase)){
                if(np.isPalindrome(testCase))
                    System.out.printf("%s is a palindrone.\n", testCase);
                else
                    System.out.printf("%s is not a palindrone.\n", testCase);
                break;
            }
        }
    }
}
