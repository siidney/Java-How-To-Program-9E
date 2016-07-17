/*
 *       Filename:  SalaryCalculator.java
 *
 *    Description:  4.20 - Develop a java application that determines the gross
 *                  pay for each of three employees.
 *                  The company pays straight time for each employee for the
 *                  first 40 hours and time and a half for all hours worked in
 *                  excess of 40.
 *                  You're given a list of the employees, their number of hours
 *                  worked last week and their hourly rates.
 *                  Your program should:
 *                  input this information for each employee
 *                  determine and display the employee's gross pay.
 *
 *        Created:  01/10/15 18:15:52
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class SalaryCalculator{
    private static double BASE_HOURS = 40.0;
    private static double OVERTIME_RATE = 1.5;

    private double hours, pay;

    public void setHours(double hours){
        this.hours = hours;
    }
    public void setHourlyPay(double pay){
        this.pay = pay;
    }
    public double calculateGrossPay(){
        if(hours > 40){
            return (pay * BASE_HOURS) + ((pay * OVERTIME_RATE) * (hours - BASE_HOURS));
        }else
            return hours * pay;
    }
}
