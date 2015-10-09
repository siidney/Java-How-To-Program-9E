/*
 *       Filename:  ModifiedDiamondPrinting.java
 *
 *    Description:  5.25 - Modify the application you wrote in 5.24 to read an
 *                  odd number in the range 1 to 19 to specify the number of
 *                  rows in the diamond.
 *                  Your program should then display a diamond of the
 *                  appropriate size
 *
 *        Created:  08/10/15 14:29:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ModifiedDiamondPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int i = sc.nextInt();

        int half = (i / 2) + 1;
        int extra = 0;

        // top half
        for(i=1; i<half; i++){
            // blank spaces
            for(int j=half - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra++;
        }

        // bottom half
        for(i=half; i>=0; i--){
            // blank spaces
            for(int j=0; j<half - i; j++){
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
