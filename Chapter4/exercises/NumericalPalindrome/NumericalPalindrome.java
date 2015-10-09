/*
 *       Filename:  NumericalPalindrome.java
 *
 *    Description:  4.30 - Write an application that reads in a five digit
 *                  integer and determines whether it's a palindrom. If the
 *                  number is not 5 digits long display an error message and
 *                  prompt the user for a new value.
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
    // ensure number is of length 5
    public boolean validate(int value){
        return (Integer.toString(value).length() == 5);
    }

    public boolean isPalindrome(int value){
        int arrValue[] = new int[5];

        // split the int
        // countdown so as to not reverse the original order
        for(int i=4; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        return ((arrValue[0] == arrValue[4]) && (arrValue[1] == arrValue[3]));
    }
}
