/*
 *       Filename:  HeartRates.java
 *
 *    Description:  3.16 - HeartRate Calculator.
 *
 *        Created:  28/09/15 18:43:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HeartRates{
    private String firstName;
    private String lastName;
    private String strDOB;
    private int bDay, bMonth, bYear, age;

    // constructor
    public HeartRates(String first, String last, int day, int month, int year){
        firstName = first;
        lastName = last;

        bDay = day;
        bMonth = month;
        bYear = year;

        age = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - bYear;
        strDOB = String.format("%d/%d/%d", bDay, bMonth, bYear);
    }

    // setters
    public void setFirstName(String first){
        firstName = first;
    }
    public void setLastName(String last){
        lastName = last;
    }
    public void setDOB(int day, int month, int year){
        bDay = day;
        bMonth = month;
        bYear = year;
    }

    // getters
    public String getFirst(){
        return firstName;
    }
    public String getLast(){
        return lastName;
    }
    public String getDOB(){
        return strDOB;
    }
    public int getAge(){
        return age;
    }
    public int getMaxHeartRate(){
        // max heartrate in bpm = 220 - age in years.
        return 220 - age;
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
    public void printInfo(){
        System.out.printf("%s %s\n%s - %d years of age\nMax HeartRate: %d\n", getFirst(), getLast(), getDOB(), getAge(), getMaxHeartRate());
        System.out.printf("Target Heart Rate Range: %s\n", getTargetHeartRate());

    }
}
