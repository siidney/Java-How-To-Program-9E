/*
 *       Filename:  DateEnhancedTest.java
 *
 *    Description:  8.8 - Write a program that tests method 'nextDay()' in a
 *                  loop that prints the date during each iteration to
 *                  illustrate that the method works correctly.
 *                  Test the following cases:
 *                  a) incremenenting the next month
 *                  c) incrementing the next year
 *
 *        Created:  28/10/15 18:38:05
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class DateEnhancedTest{
    public static void main(String[] args){
        final int END_DATE = 10000;

        DateEnhanced date = new DateEnhanced(11, 29, 2015);

        do{
            try{
                date.nextDay();
            }catch(IllegalArgumentException e){
                System.out.printf("Error fetching next day: %s\n", e.getMessage());
                break;
            }

            System.out.printf("%s\n", date.toString());
        }while(date.getYear() != END_DATE);
    }
}
