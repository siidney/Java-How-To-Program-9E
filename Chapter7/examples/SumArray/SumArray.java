/*
 *       Filename:  SumArray.java
 *
 *    Description:  7.5 - Computing the sum of the elements of an array
 *
 *        Created:  16/10/15 15:15:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */

public class SumArray{
    public static void main(String[] args){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for(int i=0; i<array.length; i++){
            total += array[i];
        }

        System.out.printf("Total of array elements: %d\n", total);
    }
}
