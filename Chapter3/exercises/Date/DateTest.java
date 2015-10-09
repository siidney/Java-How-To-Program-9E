/*
 *       Filename:  DateTest.java
 *
 *    Description:  3.15 - Write a test application name DateTest that
 *                  demonstrates class Date's capabilities.
 *
 *        Created:  05/10/15 17:42:16
 *       Revision:  09/10/15 16:24:12
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class DateTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Date dt = new Date(requestInput("Enter month: ", sc),
                           requestInput("Enter day: ", sc),
                           requestInput("Enter year: ", sc));

        dt.displayDate();

    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
