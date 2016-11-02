/*
 *       Filename:  DiamondPrinting.java
 *
 *    Description:  Exercise 5.24 - Diamond Printing Program
 *
 *        Created:  08/10/15 14:29:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class DiamondPrinting{
    public static void main(String[] args){
        // 2nd half of each half
        int extra = 0;

        // top half
        for(int i=1; i<5; i++){
            // blank spaces
            for(int j=5 - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra++;
        }

        // bottom half
        for(int i=5; i>=0; i--){
            // blank spaces
            for(int j=0; j<5 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra--;
        }
    }
}
