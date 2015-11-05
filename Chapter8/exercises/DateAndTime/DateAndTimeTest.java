/*
 *       Filename:  DateAndTimeTest.java
 *
 *    Description:  8.12 - Test application
 *
 *        Created:  28/10/15 20:05:59
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
// import public interface
import com.watson.jhtp.ex812.DateAndTime;

public class DateAndTimeTest{
    public static void main(String[] args){
        final int END_DATE = 2016;

        DateAndTime dt1 = new DateAndTime();
        DateAndTime dt2 = new DateAndTime(10, 28, 2015, 20, 47, 59);

        // increment DateAndTime
        do{
            dt2.incrementMinute();
            System.out.printf("%s | %s\n", dt2.toUniversalString(), dt2.toString());
        }while(dt2.getYear() < END_DATE);

    }
}
