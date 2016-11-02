/*
 *       Filename:  IntValueOfChar.java
 *
 *    Description:  Exercise 2.29 - Integer Value of a Character
 *
 *        Created:  05/10/15 15:37:40
 *       Revision:  01/11/16 17:09:22
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class IntValueOfChar{
    public static void main(String[] args){
        char[] cArr = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '+', '/', ' '};

        for(char c : cArr){
            printResults(c);
        }
    }
    // print results
    private static void printResults(char c){
        System.out.printf("The character %c has the value of %d\n", c, ((int) c));
    }
}
