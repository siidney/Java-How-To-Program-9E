/*
 *       Filename:  DisplayNumbers.java
 *
 *    Description:  2.14 - Write an application that displays the numbers 1 to 4
 *                  on the same line, with each pair of adjacent numbers
 *                  separated by one space. Use the following technique:
 *                  a) use one System.out.println() statement
 *                  b) use four System.out.print() statements
 *                  c) use one System.out.printf() statement
 *
 *        Created:  05/10/15 14:37:54
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class DisplayNumbers{
    public static void main(String[] args){
        // single println()
        System.out.println("1 2 3 4");

        // four print()
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");

        // single printf()
        System.out.printf("%d %d %d %d\n", 1, 2, 3, 4);
    }
}
