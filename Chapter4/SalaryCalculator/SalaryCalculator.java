/*
 *       Filename:  SalaryCalculator.java
 *
 *    Description:  4.20 - Calculate 3 employees salaries at <=40 hours normal
 *                  time >40 hours time and a half.
 *
 *        Created:  01/10/15 18:15:52
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
