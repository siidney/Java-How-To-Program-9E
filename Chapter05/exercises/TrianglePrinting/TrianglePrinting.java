/*
 *       Filename:  TrianglePrinting.java
 *
 *    Description:  5.15 - Write an application that displays the following (in
 *                  book) patterns separately, one below the other.
 *                  Use for loops to generate the patters. All asterisks should
 *                  be printed by a single statement of the form
 *                  System.out.print('*'); which causes the asterisks to print
 *                  side by side.
 *                  A statement of the form System.out.print(' '); can be used
 *                  to display a space for the last two patterns.
 *                  There should be no other output statements in the program.
 *
 *        Created:  07/10/15 00:01:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TrianglePrinting{
    public static void main(String[] args){
        // Pattern A
        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Pattern B
        for(int i=10; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Pattern C
        for(int i=10; i>=0; i--){
            // blank spaces
            for(int j=0; j<10 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Pattern D
        for(int i=1; i<=10; i++){
            // blank spaces
           for(int j=10 - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
