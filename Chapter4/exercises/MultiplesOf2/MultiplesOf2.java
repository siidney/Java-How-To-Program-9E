/*
 *       Filename:  MultiplesOf2.java
 *
 *    Description:  4.33 - Write an application that keeps displaying in the
 *                  command window the multiples of the integer 2:
 *                      2, 4, 8, 16, 32, 64...
 *                  Your loop should not terminate (infinite loop)
 *
 *        Created:  05/10/15 22:29:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
