/*
 *       Filename:  Date.java
 *
 *    Description:  Exercise 8.12 - Date and Time Class
 *
 *        Created:  26/10/15 16:09:54
 *       Revision:  28/10/15 19:11:05
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
package com.watson.jhtp.ex812;

public class Date{
    private static final int MONTHS_IN_YEAR = 12;
    private static final int[] daysPerMonth =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int month;
    private int day;
    private int year;

    // constructor
    // defaults to 01/01/1900
    public Date(){
        setMonth(1);
        setDay(1);
        setYear(1900);
    }
    // call checkMonth & checkDay to ensure correct values for each
    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    // SETTERS
    public void setDay(int day){
        this.day = checkDay(day);
    }
    public void setMonth(int month){
        this.month = checkMonth(month);
    }
    public void setYear(int year){
        this.year = checkYear(year);
    }
    // GETTERS
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    // utility method to confirm proper month value
    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= MONTHS_IN_YEAR)
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
    // utility method to confirm proper year value
    private int checkYear(int testYear){
        // check year is a positive integer and does not exceed 9999
        if(testYear >= 0 && testYear <= 9999)
            return testYear;
        else
            throw new IllegalArgumentException("year must be within the range 0-9999");
    }
    // increment day by one
    public void nextDay(){
        // check for end of month
        if(getDay() + 1 <= daysPerMonth[getMonth()])
            setDay(getDay() + 1);
        // if end of month reset day and increment month
        else{
            setDay(1);
            nextMonth();
        }
    }
    // increment month
    // see if month is within year range. If not reset to 1 and increment year
    public void nextMonth(){
        if(getMonth() + 1 <= MONTHS_IN_YEAR)
            setMonth(getMonth() + 1);
        else{
            setMonth(1);
            setYear(getYear() + 1);
        }
    }
}
