/*
 *       Filename:  Time.java
 *
 *    Description:  8.12 - Enhanced Time class
 *
 *        Created:  22/10/15 19:06:50
 *       Revision:  28/10/15 18:08:44
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
package com.watson.jhtp.ex812;

public class Time{
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR   = 60;
    private static final int SECONDS_IN_HOUR   = 3600;
    private static final int HOURS_IN_DAY      = 24;

    private int secondsSinceMidnight;

    // Time no argument constructor:
    // Initialises each instance variable to zero
    public Time(){
        this(0, 0, 0);  // invoke Time constructor with three arguments
    }
    // Time constructor: hour supplied, minute and second defaulted to 0
    public Time(int h){
        this(h, 0, 0);
    }
    // Time constructor: hour and minute supplied, second defaulted to 0
    public Time(int h, int m){
        this(h, m, 0);
    }
    // Time constructor: hour, minute and second supplied
    public Time(int h, int m, int s){
        setTime(h, m, s);
    }
    // Time constructor: another Time object supplied
    public Time(Time time){
        // invoke Time three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    // SETTERS
    // set a new time value using universal time
    // validate the data
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    // validate and set the hour
    public void setHour(int h){
        if(h >= 0 && h < HOURS_IN_DAY)
            secondsSinceMidnight += h * SECONDS_IN_HOUR;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }
    // validate and set minute
    public void setMinute(int m){
        if(m >= 0 && m < MINUTES_IN_HOUR)
            secondsSinceMidnight += m * SECONDS_IN_MINUTE;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    // validate and set second
    public void setSecond(int s){
        if(s >= 0 && s < SECONDS_IN_MINUTE)
            secondsSinceMidnight += s;
        else
            throw new IllegalArgumentException("second must be 0-59");
    }
    // increment minute
    public void incrementMinute(Date date){
        // ensure minute isn't at hours limit
        if(getMinute() < MINUTES_IN_HOUR - 1)
            secondsSinceMidnight += SECONDS_IN_MINUTE;
        // if so reset minutes to zero and increment hour
        else{
            secondsSinceMidnight -= (MINUTES_IN_HOUR - 1) * SECONDS_IN_MINUTE;
            incrementHour(date);
        }
    }
    // increment hour
    public void incrementHour(Date date){
        // ensure hours isn't at day's limit
        if(getHour() < HOURS_IN_DAY - 1){
            secondsSinceMidnight += SECONDS_IN_HOUR;
        // if so reset hours to zero
        }else{
            secondsSinceMidnight -= (HOURS_IN_DAY - 1) * SECONDS_IN_HOUR;
            date.nextDay();
        }
    }
    // GETTERS
    // get hour
    public int getHour(){
        return secondsSinceMidnight / SECONDS_IN_HOUR;
    }
    // get minute
    public int getMinute(){
        return (secondsSinceMidnight % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }
    // get second
    public int getSecond(){
        return secondsSinceMidnight % SECONDS_IN_MINUTE;
    }
}
