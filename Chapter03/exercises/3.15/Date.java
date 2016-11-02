/*
 *       Filename:  Date.java
 *
 *    Description:  Exercise 3.15 - Date Class
 *
 *        Created:  05/10/15 17:35:31
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Date{
    private int month, day, year;

    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    // setters
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    // getters
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    // display date
    public void displayDate(){
        System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
}
