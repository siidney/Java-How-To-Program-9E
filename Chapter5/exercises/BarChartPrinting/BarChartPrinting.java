/*
 *       Filename:  BarChartPrinting.java
 *
 *    Description:  5.16 - Write an application that reads five numbers between
 *                  1 and 30. For each number that's read, your program should
 *                  display the same number of adjacent asterisks.
 *                  Display the bar of asterisks after you read all 5 numbers.
 *
 *        Created:  07/10/15 00:22:55
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class BarChartPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];
        int count = 0;

        // get input
        for(int i=0; i<5; i++){
            values[i] = requestInput("Enter number " + ++count + ": ", sc);
        }

        count = 0;
        // print values
        for(int i=0; i<5; i++){
            System.out.printf("%d:  ", ++count);
            for(int j=0; j<values[i]; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
