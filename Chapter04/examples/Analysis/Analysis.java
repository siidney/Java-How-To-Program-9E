/*
 *       Filename:  Analysis.java
 *
 *    Description:  4.12 - Analysis of examination results using nested control
 *                  statements
 *
 *        Created:  30/09/15 12:34:16
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Analysis{
    public static void main(String[] args){
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result;

        Scanner sc = new Scanner(System.in);

        // process 10 students using counter controlled loop
        while(studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = sc.nextInt();

            if(result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }

        System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

        if(passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
