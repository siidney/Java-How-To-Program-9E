/*
 *       Filename:  BasePlusCommissionEmployee.java
 *
 *    Description:  Exercise 10.11 - Accounts Payable System Modification
 *
 *        Created:  09/11/15 18:08:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee(String first, String last, String ssn,
            double sales, double rate, double salary){
        super(first, last, ssn, sales, rate);

        setBaseSalary(salary);
    }
    public BasePlusCommissionEmployee(String first, String last, String ssn,
            double sales, double rate, double salary, int month, int day, int year){
        // call CommissionEmployee constructor
        super(first, last, ssn, sales, rate, month, day, year);
        setBaseSalary(salary);
    }
    // SETTERS
    public void setBaseSalary(double salary){
        if(salary >= 0.0f)
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0f");
    }
    // GETTERS
    public double getBaseSalary(){
        return this.baseSalary;
    }
    // calculate getPaymentAmount; override method getPaymentAmount in CommissionEmployee
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    // return String representation of object
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
