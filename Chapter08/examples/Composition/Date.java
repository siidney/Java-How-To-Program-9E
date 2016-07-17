/*
 *       Filename:  Date.java
 *
 *    Description:  8.7 - Date class declaration
 *
 *        Created:  26/10/15 16:09:54
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Date{
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor
    // call checkMonth & checkDay to ensure correct values for each
    public Date(int month, int day, int year){
        this.month = checkMonth(month);
        this.day = checkDay(day);
        this.year = year;

        System.out.printf("Date object constructor for day %s\n", this);
    }
    // utility method to confirm proper month value
    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }
    // utility method to confirm proper day value based on month and year
    private int checkDay(int testDay){
        // check if day in range for month
        if(testDay > 0 && testDay <= daysPerMonth[this.month])
            return testDay;

        // check for leap year
        if(this.month == 2 && testDay == 29 &&
                (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)))
            return testDay;

        throw new IllegalArgumentException("day out of range for the specified month and year");
    }
    // return a string of the form month/day/year
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
