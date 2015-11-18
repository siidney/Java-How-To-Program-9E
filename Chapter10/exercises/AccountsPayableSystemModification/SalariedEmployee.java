/*
 *       Filename:  SalariedEmployee.java
 *
 *    Description:  10.5 - SalariedEmployee concrete class extends abstract
 *                  Employee
 *
 *        Created:  06/11/15 20:45:20
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String first, String last, String ssn, double salary){
        super(first, last, ssn);

        setWeeklySalary(salary);
    }
    public SalariedEmployee(String first, String last, String ssn, double salary,
            int month, int day, int year){
        // pass to Employee constructor
        super(first, last, ssn, month, day, year);

        setWeeklySalary(salary);
    }
    // SETTERS
    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }
    // GETTERS
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    // calculate getPaymentAmount; override abstract method getPaymentAmount in Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    // return String representation of SalriedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
