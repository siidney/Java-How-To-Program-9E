/*
 *       Filename:  BarChart.java
 *
 *    Description:  7.6 - Bar chart printing program
 *
 *        Created:  16/10/15 15:47:03
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class BarChart{
    public static void main(String[] args){
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution.");

        for(int i=0; i<array.length; i++){
            // output bar label
            if(i == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        i * 10, i * 10 + 9);

            // print bar of asterisks
            for(int stars=0; stars<array[i]; stars++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
