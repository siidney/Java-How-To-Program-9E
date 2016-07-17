/*
 *       Filename:  SalaryCalculatorTest.java
 *
 *    Description:  4.20 - Calculate 3 employees salaries at <=40 hours normal
 *                  time >40 hours time and a half.
 *
 *        Created:  01/10/15 18:25:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SalaryCalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalaryCalculator salaryCalc = new SalaryCalculator();

        for(int i=1; i<4; i++){
            System.out.printf("Employee %d weekly hours: ", i);
            salaryCalc.setHours(sc.nextDouble());

            System.out.printf("Employee %d hourly pay: ", i);
            salaryCalc.setHourlyPay(sc.nextDouble());

            System.out.printf("Employee %d gross pay: %.2f\n", i, salaryCalc.calculateGrossPay());
        }
    }
}
