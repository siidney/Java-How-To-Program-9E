/*
 *       Filename:  BreakTest.java
 *
 *    Description:  Fig. 5.12: Break statement exiting a for statment
 *
 *        Created:  01/11/16 18:57:46
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class BreakTest{
    public static void main (String[] args) {
        int count;  // control variable also used after loop terminates

        for(count = 1; count <=10; ++count){
            if(count == 5)
                break;  // terminate loop

            System.out.printf("%d ", count);
        }

        System.out.printf("\nBroke out of loop at count = %d\n", count);
    }
}
