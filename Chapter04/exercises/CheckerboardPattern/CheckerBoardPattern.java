/*
 *       Filename:  CheckerBoardPattern.java
 *
 *    Description:  4.32 - Write an application that only uses the output
 *                  statements:
 *                      System.out.print("* ");
 *                      System.out.print(" ");
 *                      System.out.println();
 *                  to display the checkerboard pattern that follows.
 *                  * * * * * * * *
 *                   * * * * * * * *
 *                  * * * * * * * *
 *                   * * * * * * * *
 *                  * * * * * * * *
 *                   * * * * * * * *
 *                  * * * * * * * *
 *                   * * * * * * * *
 *
 *        Created:  05/10/15 22:20:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CheckerBoardPattern{
    public static void main(String[] args){
        for(int i=0; i<8; i++){
            // even lines prepend extra space
            if(i % 2 == 0)
                System.out.print(" ");
            for(int j=0; j<8; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
