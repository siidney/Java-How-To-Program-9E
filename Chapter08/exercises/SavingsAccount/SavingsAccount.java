/*
 *       Filename:  SavingsAccount.java
 *
 *    Description:  8.6 - Create class 'SavingsAccount'.
 *                  Use a static variable 'annualInterestRate' to store the annual
 *                  interest rate for all account holders.
 *                  Each object of the class contains a private instance
 *                  variable 'savingsBalance' indicating the amount the saver
 *                  currently has on deposit.
 *                  Provide method 'calculateMonthlyInterest' to calculate the
 *                  monthly interest 'savingsBalance' * 'annualInterestRate' /
 *                  12. This interest should be added to 'savingsBalance'.
 *                  Provide a static method 'modifyInterestRate' that sets the
 *                  'anualInterestRate' to a new value.
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
