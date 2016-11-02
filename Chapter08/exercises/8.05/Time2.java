/*
 *       Filename:  Time2.java
 *
 *    Description:  Exercise 8.5 - Modifying the Internal Data Representation of
 *                  a Class
 *
 *        Created:  22/10/15 19:06:50
 *       Revision:  28/10/15 17:03:30
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class Time2{
    private final int SECONDS_IN_MINUTE = 60;
    private final int MINUTES_IN_HOUR = 60;
    private final int SECONDS_IN_HOUR = 3600;

    private int secondsSinceMidnight;

    // Time2 no argument constructor:
    // Initialises each instance variable to zero
    public Time2(){
        this(0, 0, 0);  // invoke Time2 constructor with three arguments
    }
    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int h){
        this(h, 0, 0);
    }
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int h, int m){
        this(h, m, 0);
    }
    // Time2 constructor: hour, minute and second supplied
    public Time2(int h, int m, int s){
        setTime(h, m, s);
    }
    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time){
        // invoke Time2 three-argument constructor
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
        if(h >= 0 && h < 24)
            secondsSinceMidnight += h * SECONDS_IN_HOUR;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }
    // validate and set minute
    public void setMinute(int m){
        if(m >= 0 && m < 60)
            secondsSinceMidnight += m * SECONDS_IN_MINUTE;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    // validate and set second
    public void setSecond(int s){
        if(s >= 0 && s < 60)
            secondsSinceMidnight += s;
        else
            throw new IllegalArgumentException("second must be 0-59");
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

    // convert to String in universal time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    // convert to String in standard time format (H:MM:MM AM/PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
