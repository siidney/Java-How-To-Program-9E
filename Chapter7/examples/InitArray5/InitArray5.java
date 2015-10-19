/*
 *       Filename:  InitArray5.java
 *
 *    Description:  7.21 - Initialising an array with command line arguments
 *
 *        Created:  18/10/15 15:23:05
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class InitArray5{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println(
                    "Error: Please re-enter the entire command, including\n" +
                    "an array size, intial value and increment.");
        }else{
            // get array size from first element
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // get initial value and increment from 2nd and 3rd elements
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calculate value for each array element
            for(int counter=0; counter<array.length; counter++){
                array[counter] = initialValue + increment * counter;
            }

            System.out.printf("%s%8s\n", "Index", "Value");

            // display array and index value
            for(int counter=0; counter<array.length; counter++){
                System.out.printf("%5d%8d\n", counter, array[counter]);
            }
        }
    }
}
