/*
 *       Filename:  SalariedEmployee.java
 *
 *    Description:  10.14 - SalariedEmployee class extends Employee, which
 *                  implements Payable.
 *
 *        Created:  06/11/15 20:45:20
 *       Revision:  16/11/15 17:49:45
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String first, String last, String ssn, double salary){
        // pass to Employee constructor
        super(first, last, ssn);

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
    // return String representation of SalriedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
    // calculate earnings; implement Payable method that was abstract in
    // superclass Employee
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
}
