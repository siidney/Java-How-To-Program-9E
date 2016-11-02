/*
 *       Filename:  SavingsAccount.java
 *
 *    Description:  Exercise 8.6 - Savings Account Class
 *
 *        Created:  28/10/15 17:05:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class SavingsAccount{
    private static double annualInterestRate = 0.0f;
    private double savingsBalance = 0.0f;

    // constructor
    public SavingsAccount(double savingsBalance){
        setSavingsBalance(savingsBalance);
    }
    // SETTERS
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    // update the interest rate
    public static void modifyInterestRate(double newInterestRate){
        // check for negative interest rates
        if(newInterestRate >= 0.0f)
            annualInterestRate = newInterestRate;
        else
            throw new IllegalArgumentException("interest rate must be >= 0.0f");
    }
    // GETTERS
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    // calculates the monthly interest and update the savings balance
    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }
    // return savingsBalance as string
    public String toString(){
        return String.format("%.2f", getSavingsBalance());
    }
}
