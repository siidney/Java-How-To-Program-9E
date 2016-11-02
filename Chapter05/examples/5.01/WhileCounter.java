/*
 *       Filename:  WhileCounter.java
 *
 *    Description:  Fig. 5.1 - Counter-controlled repeitition with the while
 *                  repetition statement.
 *
 *        Created:  06/10/15 13:25:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class WhileCounter{
    public static void main(String[] args){
        int counter = 1;

        while(counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;
        }
        System.out.println();
    }
}
