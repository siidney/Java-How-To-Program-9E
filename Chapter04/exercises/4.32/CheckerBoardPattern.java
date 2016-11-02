/*
 *       Filename:  CheckerBoardPattern.java
 *
 *    Description:  Exercise 4.32 - Checkerboard Pattern of Asterisks
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
