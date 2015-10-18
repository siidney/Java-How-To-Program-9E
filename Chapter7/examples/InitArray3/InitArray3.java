/*
 *       Filename:  InitArray3.java
 *
 *    Description:  7.4 - Calculating the values to be placed into the elements
 *                  of an array.
 *
 *        Created:  16/10/15 15:06:37
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */

public class InitArray3{
    public static void main(String[] args){
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for(int i=0; i<array.length; i++){
            array[i] = 2 + 2 * i;
        }

        System.out.printf("%s%8s\n", "Index", "Values");

        for(int i=0; i<array.length; i++){
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}
