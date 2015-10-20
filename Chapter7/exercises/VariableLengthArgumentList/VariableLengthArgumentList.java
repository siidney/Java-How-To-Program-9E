/*
 *       Filename:  VariableLengthArgumentList.java
 *
 *    Description:  7.14 - Write an application that calculates the product of a
 *                  series of integers that are passed to method product using a
 *                  variable length argument list.
 *                  Test your method with several calls, each with a different
 *                  number of arguments.
 *
 *        Created:  19/10/15 15:32:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class VariableLengthArgumentList{
    public static void main(String[] args){

        System.out.printf("12 * 53 * 32 * 1 * 9 * 5 = %d\n",
                variableProduct(12, 53, 32, 1, 9, 5));

        System.out.printf("2 * 2 * 2 = %d\n",
                variableProduct(2, 2, 2));

        System.out.printf("3 * 3 = %d\n",
                variableProduct(3, 3));

        System.out.printf("1 * 0 = %d\n",
                variableProduct(1));
    }
    // returns the product of the arguments
    public static int variableProduct(int... args){
        for(int i=1; i<args.length; i++){
            args[0] *= args[i];
        }
        return args[0];
    }
}
