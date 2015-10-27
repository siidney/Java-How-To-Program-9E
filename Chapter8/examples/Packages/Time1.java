/*
 *       Filename:  Time1.java
 *
 *    Description:  8.1 - Time1 class declaration maintains the time in 24h
 *                  format.
 *
 *        Created:  22/10/15 16:37:28
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
package com.deitel.jhtp.ch08;

public class Time1{
    private int hour;
    private int minute;
    private int second;

    // set a new time var using universal time;
    // throw an exception if the hour, minute or second is invalid
    public void setTime(int h, int m, int s){
        // validates hour, minute, second
        if((h >= 0 && h <24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)){
            hour = h;
            minute = m;
            second = s;
        }else{
            throw new IllegalArgumentException(
                    "hour, minute and/or second were out of range");
        }
    }

    // convert to String in utf (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    // convert to string in standard time format (H::MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12) ? "AM" : "PM");
    }
}
