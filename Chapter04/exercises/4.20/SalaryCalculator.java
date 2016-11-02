/*
 *       Filename:  SalaryCalculator.java
 *
 *    Description:  Exercise 4.20 - Salary Calculator
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
        return hours > 40 ?
               (pay * BASE_HOURS) + ((pay * OVERTIME_RATE) * (hours - BASE_HOURS)) :
               hours * pay;
    }
}
