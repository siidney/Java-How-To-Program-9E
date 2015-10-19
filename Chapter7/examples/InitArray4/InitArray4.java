/*
 *       Filename:  InitArray4.java
 *
 *    Description:  7.17 - Initialising 2 dimensional arrays
 *
 *        Created:  18/10/15 14:33:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class InitArray4{
    public static void main(String[] args){
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are: ");
        outputArray(array1);

        System.out.println("\nValues in array2 by row are: ");
        outputArray(array2);
    }
    // output rows and columns of a two-dimensional array
    public static void outputArray(int[][] array){
        // rows
        for(int row=0; row<array.length; row++){
            // columns
            for(int column=0; column<array[row].length; column++){
                System.out.printf("%d  ", array[row][column]);
            }
            System.out.println();
        }
    }
}
