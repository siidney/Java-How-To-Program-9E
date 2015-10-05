/*
 *       Filename:  NumericalPalindrome.java
 *
 *    Description:  4.30 - Determine whether a 5 digit number is a palindrome.
 *
 *        Created:  01/10/15 19:38:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class NumericalPalindrome{
    public boolean isPalindrome(String x){
        char[] charArr = x.toCharArray();

        if(charArr[0] == charArr[4] && charArr[1] == charArr[3])
            return true;
        else
            return false;
    }
}
