/*
 *       Filename:  CreditLimitCalculator.java
 *
 *    Description:  Exercise 4.18 - Credit Limit Calculator
 *
 *        Created:  01/10/15 17:08:50
 *       Revision:  09/10/15 16:33:23
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class CreditLimitCalculator{
    int accountNo, startBalance, totalCharges, totalCredits, creditLimit;

    // SETTERS
    public void setAccountInfo(int accountNo, int startBalance, int totalCharges,
                               int totalCredits, int creditLimit){
        setAccountNo(accountNo);
        setStartBalance(startBalance);
        setTotalCharges(totalCharges);
        setTotalCredits(totalCredits);
        setCreditLimit(creditLimit);
    }
    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    public void setStartBalance(int startBalance){
        this.startBalance = startBalance;
    }
    public void setTotalCharges(int totalCharges){
        this.totalCharges = totalCharges;
    }
    public void setTotalCredits(int totalCredits){
        this.totalCredits = totalCredits;
    }
    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }
    // GETTERS
    public int getAccountNo(){
        return accountNo;
    }
    public int getStartBalance(){
        return startBalance;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public int getTotalCharges(){
        return totalCharges;
    }
    public int getTotalCredits(){
        return totalCredits;
    }
    public int getNewBalance(){
        return getStartBalance() - getTotalCharges() + getTotalCredits();
    }
    public boolean creditExceeded(){
        return (getNewBalance() > getCreditLimit()) ? false : true;
    }
}
