/*
 *       Filename:  DateTest.java
 *
 *    Description:  3.15 - Write a test application name DateTest that
 *                  demonstrates class Date's capabilities.
 *
 *        Created:  05/10/15 17:42:16
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class DateTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int month, day, year;

        month = requestInput("Enter month: ", sc);
        day = requestInput("Enter day: ", sc);
        year = requestInput("Enter year: ", sc);

        Date dt = new Date(month, day, year);

        dt.displayDate();

    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
