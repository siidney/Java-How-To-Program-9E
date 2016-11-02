/*
 *       Filename:  CommandLineArguments.java
 *
 *    Description:  Exercise 7.15 - Command-Line Arguments
 *
 *        Created:  19/10/15 15:46:30
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CommandLineArguments{
    public static void main(String[] args){
        int[] array;

        array = new int[(args.length == 1) ? Integer.parseInt(args[0]) : 10];

        System.out.printf("%s%8s\n", "Index", "Value");

        // output each elements array value
        for(int counter=0; counter<array.length; counter++){
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}
