/*
 *       Filename:  PassArray.java
 *
 *    Description:  7.13 - Passing arrays and individual array elements to
 *                  methods.
 *
 *        Created:  18/10/15 13:42:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PassArray{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Effects of passing reference to entire array:\n" +
                           "The values of the original array are: ");

        for(int value : array)
            System.out.printf("     %d", value);

        modifyArray(array);
        System.out.println("\n\nThe values of the modified array are: ");

        for(int value : array)
            System.out.printf("     %d", value);

        System.out.printf("\n\nEffects of passing array element value:\n" +
                          "array[3] before modifying elements: %d\n", array[3]);

        modifyElement(array[3]);
        System.out.printf("array[3] after modifyElement: %d\n", array[3]);
    }
    // multiply each element of an array by 3
    public static void modifyArray(int[] array2){
        for(int counter=0; counter<array2.length; counter++){
            array2[counter] *= 2;
        }
    }
    // multiply argument by 2
    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d\n", element);
    }
}
