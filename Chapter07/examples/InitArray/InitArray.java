/*
 *       Filename:  InitArray.java
 *
 *    Description:  7.2 - Initialising the elements of an array to default
 *                  values of zero.
 *
 *        Created:  16/10/15 14:22:55
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class InitArray{
    public static void main(String[] args){
        int[] array;
        array = new int[10];

        System.out.printf("%s%8s\n", "Index", "Value");

        for(int i=0; i<array.length; i++){
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}
