/*
 *       Filename:  EnhancedForStatement.java
 *
 *    Description:  7.16 - Write an application that uses an enhanced for
 *                  statement to sum the double values passed by the command
 *                  line arguments.
 *
 *        Created:  19/10/15 15:54:21
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class EnhancedForStatement{
    public static void main(String[] args){

        double total = 0.0f;

        for(String arg : args)
            total += Double.parseDouble(arg);

        System.out.println("Total: " + total);
    }
}
