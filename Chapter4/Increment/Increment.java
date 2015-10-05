/*
 *       Filename:  Increment.java
 *
 *    Description:  4.15 - Pre and postfix increment operators.
 *
 *        Created:  30/09/15 12:52:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Increment{
    public static void main(String[] args){
        int c;

        // postfix
        c = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);

        System.out.println();

        // prefix
        c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);
    }
}
