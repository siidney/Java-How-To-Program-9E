/*
 *       Filename:  Date.java
 *
 *    Description:  3.15 - Create a class called Date taht includes three
 *                  instance variables:
 *                      int - month
 *                      int - day
 *                      int - year
 *                  Provide a constructor that initialises the three instance
 *                  variables and assumes the values provided are correct.
 *                  Provide setters and getters for each instance variable.
 *                  Provide a method displayDate() that displays the month, day
 *                  and year separated by forward slashed (/).
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
