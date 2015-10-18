/*
 *       Filename:  InitArray2.java
 *
 *    Description:  7.3 - Initiaising the elements of an array with an array
 *                  initialiser.
 *
 *        Created:  16/10/15 14:27:02
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class InitArray2{
    public static void main(String[] args){
        int[] array = {32, 27, 64, 18, 95, 14, 30, 70, 60, 37};

        System.out.printf("%s%8s\n", "Index", "Value");

        for(int i=0; i<array.length; i++){
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}
