/*
 *       Filename:  EnhancedForTest.java
 *
 *    Description:  7.12 - Using the enhanced for statement to total integers in
 *                  array.
 *
 *        Created:  18/10/15 13:37:47
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class EnhancedForTest{
    public static void main(String[] args){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // add each elements value to total
        for(int number : array)
            total += number;

        System.out.printf("Total of array elements: %d\n", total);
    }
}
