/*
 *       Filename:  Employee.java
 *
 *    Description:  3.14 - Class to represent employees with salary
 *
 *        Created:  28/09/15 18:18:57
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // constructor
    public Employee(String first, String last, double salary){
        firstName = first;
        lastName = last;

        if(salary > 0)
            monthlySalary = salary;
    }

    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public double getYearlySalary(){
        return monthlySalary * 12;
    }

    // setters
    public void setRaise(double percentage){
        monthlySalary += (monthlySalary/100) * percentage;
    }
}
