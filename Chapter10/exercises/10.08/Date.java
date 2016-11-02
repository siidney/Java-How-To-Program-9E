/*
 *       Filename:  Date.java
 *
 *    Description:  Exercise 10.8 - Payroll System Modification
 *
 *        Created:  29/10/15 01:45:05
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Date{
    private static final int MONTHS_IN_YEAR = 12;
    private static final int FEB_LEAP_YEAR = 29;

    // non static so as not to screw up non leap year february's
    private final int[] daysPerMonth =
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final String[] strMonths =
    {"", "January", "February", "March", "April", "May", "June", "July", "August",
     "September", "October", "November", "December"};

    private static final String[] strDays =
    {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    private int[] date = new int[3];

    // constructors
    // overloaded constructors need to set year first
    // to check for/against leap year
    // default
    public Date(){
        date[0] = 1;
        date[1] = 1;
        date[2] = 1900;
    }
    // mm dd yyyy - 3 ints
    public Date(int month, int day, int year){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    // month dd yyyy - string month 2 ints
    public Date(String month, int day, int year){
        setYear(year);
        setStringMonth(month);
        setDay(day);
    }
    // DDDD YYYY - longform day number and year
    public Date(int dayOfYear, int year){
        setYear(year);
        setLongFormDay(dayOfYear);
    }
    // SETTERS
    public void setMonth(int month){
        date[0] = checkMonth(month);
    }
    public void setStringMonth(String month){
        date[0] = checkStringMonth(month);
    }
    public void setDay(int day){
        date[1] = checkDay(day);
    }
    // get month and day from day of year
    public void setLongFormDay(int dayOfYear){
        if(dayOfYear <= 0 || dayOfYear > 365)
            throw new IllegalArgumentException("day of year must be 1-365");

        int month = 1;

        // if leap year fix daysPerMonth day count
        if(isLeapYear() && daysPerMonth[2] != FEB_LEAP_YEAR)
            daysPerMonth[2] = FEB_LEAP_YEAR;

        // determine the month by sequentially subtracting daysPerMonth
        // and incrementing months counter. Remainder is day of month
        while(dayOfYear > daysPerMonth[month]){
            dayOfYear -= daysPerMonth[month];
            month++;
        }

        setMonth(month);
        setDay(dayOfYear);
    }
    public void setYear(int year){
        date[2] = checkYear(year);
    }
    // GETTERS
    public int getMonth(){
        return date[0];
    }
    public int getDay(){
        return date[1];
    }
    public int getYear(){
        return date[2];
    }
    // return int representation of day number in the year
    // add total daysPerMonth upto one month before current
    // add day onto total
    private int getDayOfYear(){
        int tmp = 0;

        for(int i=1; i<date[0]; i++){
            tmp += daysPerMonth[i];
        }
        return tmp + date[1];
    }
    // ensures string month is valid
    private int checkStringMonth(String month){
        if(month.length() > 1)
            month = month.substring(0, 1).toUpperCase() + month.substring(1);

        // check for matches
        for(int i=1; i<strMonths.length; i++){
            if(strMonths[i].equals(month))
                return i;
        }

        throw new IllegalArgumentException("invalid month string");
    }
    // check month is within correct range
    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= MONTHS_IN_YEAR)
            return testMonth;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }
    // check day is within range for month
    private int checkDay(int testDay){
        if(isLeapYear() && daysPerMonth[2] != FEB_LEAP_YEAR)
            daysPerMonth[2] = FEB_LEAP_YEAR;

        if(testDay > 0 && testDay <= daysPerMonth[getMonth()])
            return testDay;

        throw new IllegalArgumentException("day out of range for specified month and year");
    }
    // check for leap year
    private boolean isLeapYear(){
        return (getYear() % 400 == 0 || (getYear() % 4 == 0 && getYear() % 100 != 0));
    }
    // check year is within 4 digit range and not negative
    private int checkYear(int testYear){
        if(testYear >= 0 && testYear <= 9999)
            return testYear;
        else
            throw new IllegalArgumentException("year must be 0-9999");
    }
    // string representations
    public String toString(){
        return String.format("%02d/%02d/%04d", date[0], date[1], date[2]);
    }
    public String toLongDateString(){
        return String.format("%s %02d %04d", strMonths[date[0]], date[1], date[2]);
    }
    public String toDayOfYearString(){
        return String.format("%03d %04d", getDayOfYear(), date[2]);
    }
}
