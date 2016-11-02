/*
 *       Filename:  DateEnhancedTest.java
 *
 *    Description:  Exercise 8.8 - Enhancing Class Date
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
