/*
 *       Filename:  DateAndTime.java
 *
 *    Description:  Exercise 8.12 - Date and Time Class
 *
 *        Created:  28/10/15 20:03:03
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
package com.watson.jhtp.ex812;

public class DateAndTime{
    Date date = new Date();
    Time time = new Time();

    // default constructor - default date and time
    public DateAndTime(){
        date.setMonth(1);
        date.setDay(1);
        date.setYear(1900);

        time.setHour(0);
        time.setMinute(0);
        time.setSecond(0);

        System.out.printf("DateAndTime default constructor : %s\n", this);
    }
    // constructor with both date and time specified
    public DateAndTime(int month, int day, int year, int hour, int min, int sec){
        date.setMonth(month);
        date.setDay(day);
        date.setYear(year);

        time.setHour(hour);
        time.setMinute(min);
        time.setSecond(sec);

        System.out.printf("DateAndTime time custom values constructor : %s\n", this);
    }
    // GETTERS
    public int getDay(){
        return date.getDay();
    }
    public int getMonth(){
        return date.getMonth();
    }
    public int getYear(){
        return date.getYear();
    }
    public int getHour(){
        return time.getHour();
    }
    public int getMinute(){
        return time.getMinute();
    }
    public int getSecond(){
        return time.getSecond();
    }
    // increment day
    public void nextDay(){
        date.nextDay();
    }
    // increment month
    public void nextMonth(){
        date.nextMonth();
    }
    // increment minutes
    public void incrementMinute(){
        time.incrementMinute(date);
    }
    // increment hours
    public void incrementHour(){
        time.incrementHour(date);
    }
    // return DateAndTime string representation
    public String toString(){
        return String.format("%02d/%02d/%04d - %02d:%02d:%02d %s",
                date.getMonth(), date.getDay(), date.getYear(),
                ((time.getHour() == 0 || time.getHour() == 12) ? 12 : time.getHour() % 12),
                time.getMinute(), time.getSecond(), (time.getHour() < 12 ? "AM" : "PM"));
    }
    // convert to String in universal time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d/%02d/%04d - %02d:%02d:%02d",
                date.getMonth(), date.getDay(), date.getYear(),
                time.getHour(), time.getMinute(), time.getSecond());
    }
}
