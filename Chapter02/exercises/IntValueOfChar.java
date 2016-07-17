/*
 *       Filename:  IntValueOfChar.java
 *
 *    Description:  2.29 - Write an application that displays the integer
 *                  equivalents of some uppercase letters, lowercase letters,
 *                  digits and special symbols.
 *
 *                  Display the integer equivalents of the following:
 *                  A B C a b c 0 1 2 $ * + / and the blank character.
 *
 *        Created:  05/10/15 15:37:40
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class IntValueOfChar{
    public static void main(String[] args){
        printResults('A');
        printResults('B');
        printResults('B');
        printResults('a');
        printResults('b');
        printResults('c');
        printResults('0');
        printResults('1');
        printResults('2');
        printResults('$');
        printResults('*');
        printResults('+');
        printResults('/');
        printResults(' ');
    }
    // print results
    private static void printResults(char c){
        System.out.printf("The character %c has the value of %d\n", c, ((int) c));
    }
}
