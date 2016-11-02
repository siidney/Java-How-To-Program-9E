/*
 *       Filename:  MultiplesOf2.java
 *
 *    Description:  Exercise 4.33 - Multiples of 2 with an Infinite Loop
 *
 *        Created:  05/10/15 22:29:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class MultiplesOf2{
    public static void main(String[] args){
        int x = 2;

        while(true){
            System.out.printf("%d\n", x *= 2);
        }
    }
}
