/*
 *       Filename:  DateTest.java
 *
 *    Description:  Exercise 8.14 - Date Class
 *
 *        Created:  29/10/15 01:48:04
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class DateTest{
    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date(11, 13, 2016);
        Date d3 = new Date("February", 29, 1988);
        Date d4 = new Date(317, 2015);

        System.out.println("\nFormat A: MM/DD/YYY");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());

        System.out.println("\nFormat B: MONTH DD, YYYY");
        System.out.println(d1.toLongDateString());
        System.out.println(d2.toLongDateString());
        System.out.println(d3.toLongDateString());
        System.out.println(d4.toLongDateString());

        System.out.println("\nFormat C: DDD YYYY");
        System.out.println(d1.toDayOfYearString());
        System.out.println(d2.toDayOfYearString());
        System.out.println(d3.toDayOfYearString());
        System.out.println(d4.toDayOfYearString());
    }
}
