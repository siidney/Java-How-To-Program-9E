/*
 *       Filename:  HourlyEmployee.java
 *
 *    Description:  10.6 - extends Employee
 *
 *        Created:  09/11/15 17:44:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    // constructor
    public HourlyEmployee(String first, String last, String ssn,
            double hourlyWage, double hoursWorked, int month, int day, int year){
        // explicit Employee constructor call
        super(first, last, ssn, month, day, year);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    // SETTERS
    public void setWage(double hourlyWage){
        if(hourlyWage >= 0.0f)
            this.wage = hourlyWage;
        else
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0f");
    }
    public void setHours(double hoursWorked){
        if((hoursWorked >= 0.0f) && (hoursWorked <= 168.0f))
            this.hours = hoursWorked;
        else
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0f and <= 16.0f");
    }
    // GETTERS
    public double getWage(){
        return this.wage;
    }
    public double getHours(){
        return this.hours;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        if(getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5f;
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
