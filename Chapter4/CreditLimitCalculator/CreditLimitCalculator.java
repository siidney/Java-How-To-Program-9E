/*
 *       Filename:  CreditLimitCalculator.java
 *
 *    Description:  4.18 - Determine whether any department store customer has
 *                  exceed the credit limit on a charge account.
 *
 *        Created:  01/10/15 17:08:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CreditLimitCalculator{
    int accNumber;
    double startBalance, chargesTotal, creditsTotal, creditLimit;

    public void setAccountInfo(int acc, double sb, double chargeT,
            double creditT, double creditL){

        accNumber = acc;
        startBalance = sb;
        chargesTotal = chargeT;
        creditsTotal = creditT;
        creditLimit = creditL;
    }
    public int getAccountNo(){
        return accNumber;
    }
    public double getStartBalance(){
        return startBalance;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public double getTotalCharges(){
        return chargesTotal;
    }
    public double getTotalCredits(){
        return creditsTotal;
    }
    public double getNewBalance(){
        return startBalance + chargesTotal - creditsTotal;
    }
    public boolean creditExceeded(){
        if(getNewBalance() > creditLimit)
            return false;

        return true;
    }
}
