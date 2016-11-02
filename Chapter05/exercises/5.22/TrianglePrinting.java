/*
 *       Filename:  TrianglePrinting.java
 *
 *    Description:  Exercise 5.22 - Modified Triangle Printing Program
 *
 *                  TODO: Start this.
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
