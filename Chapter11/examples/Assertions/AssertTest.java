/*
 *       Filename:  AssertTest.java
 *
 *    Description:  11.7 - Checking with assert that a value is within range
 *
 *        Created:  02/12/15 00:49:52
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class AssertTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = sc.nextInt();

        // assert that the value is >= 0 and <= 10
        assert (number >= 0 && number <= 10) : "bad number: " + number;

        System.out.printf("You entered %d\n", number);
    }
}
