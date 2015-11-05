/*
 *       Filename:  Time2Enhanced.java
 *
 *    Description:  8.7 - Modifiy class Time2 further to include a tick method
 *                  that increments the time stored in a Time2 object by one
 *                  second.
 *                  Provide method 'incrementMinute' to increment the minute by
 *                  one and method 'incrementHour' to increment the hour by one.
 *
 *        Created:  22/10/15 19:06:50
 *       Revision:  28/10/15 18:08:44
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
public class Time2Enhanced{
    private final int SECONDS_IN_MINUTE = 60;
    private final int MINUTES_IN_HOUR   = 60;
    private final int SECONDS_IN_HOUR   = 3600;
    private final int HOURS_IN_DAY      = 24;

    private int secondsSinceMidnight;

    // Time2Enhanced no argument constructor:
    // Initialises each instance variable to zero
    public Time2Enhanced(){
        this(0, 0, 0);  // invoke Time2Enhanced constructor with three arguments
    }
    // Time2Enhanced constructor: hour supplied, minute and second defaulted to 0
    public Time2Enhanced(int h){
        this(h, 0, 0);
    }
    // Time2Enhanced constructor: hour and minute supplied, second defaulted to 0
    public Time2Enhanced(int h, int m){
        this(h, m, 0);
    }
    // Time2Enhanced constructor: hour, minute and second supplied
    public Time2Enhanced(int h, int m, int s){
        setTime(h, m, s);
    }
    // Time2Enhanced constructor: another Time2Enhanced object supplied
    public Time2Enhanced(Time2Enhanced time){
        // invoke Time2Enhanced three-argument constructor
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
    public void incrementMinute(){
        // ensure minute isn't at hours limit
        if(getMinute() < MINUTES_IN_HOUR - 1)
            secondsSinceMidnight += SECONDS_IN_MINUTE;
        // if so reset minutes to zero and increment hour
        else{
            secondsSinceMidnight -= (MINUTES_IN_HOUR - 1) * SECONDS_IN_MINUTE;
            incrementHour();
        }
    }
    // increment hour
    public void incrementHour(){
        // ensure hours isn't at day's limit
        if(getHour() < HOURS_IN_DAY - 1)
            secondsSinceMidnight += SECONDS_IN_HOUR;
        // if so reset hours to zero
        else
            secondsSinceMidnight -= (HOURS_IN_DAY - 1) * SECONDS_IN_HOUR;
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
