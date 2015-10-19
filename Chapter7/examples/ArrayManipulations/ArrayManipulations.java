/*
 *       Filename:  ArrayManipulations.java
 *
 *    Description:  7.22 - Array class methods and System.arraycopy
 *
 *        Created:  18/10/15 15:29:57
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Arrays;

public class ArrayManipulations{
    public static void main(String[] args){
        // sort double array into ascending order
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};

        Arrays.sort(doubleArray);

        System.out.printf("\ndoubleArray: ");

        for(double value : doubleArray)
            System.out.printf("%.1f", value);

        // fill 10-element array with 7's
        int[] filledIntArray = new int[10];

        Arrays.fill(filledIntArray, 7);

        displayArray(filledIntArray, "filledIntArray");

        // copy array intArray int array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);

        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n",
                (b ? "==" : "!="));

        // compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray\n",
                (b ? "==" : "!="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);

        if(location >= 0)
            System.out.printf(
                    "Found 5 at element %d in intArray\n", location);
        else
            System.out.println("5 not found in intArray.");

        // search intArray for the value 8763
        location = Arrays.binarySearch(intArray, 8763);

        if(location >= 0)
            System.out.printf(
                    "Found 8763 at element %d in intArray\n", location);
        else
            System.out.println("8763 not found in intArray.");
    }
    // output values of each array
    public static void displayArray(int[] array, String description){
        System.out.printf("\n%s: ", description);

        for(int value : array)
            System.out.printf("%d", value);
    }
}
