/*
 *       Filename:  DiamondPrinting.java
 *
 *    Description:  5.24 - Write an application that prints the following
 *                  diamond shape (in book).
 *                  You may use ouput statements that print:
 *                  a single asterisk (*)
 *                  a single space
 *                  a single newline char (\n)
 *
 *                  Maximise your use of repetition (with nested statements), and
 *                  minimise the number of output statements
 *
 *        Created:  08/10/15 14:29:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
