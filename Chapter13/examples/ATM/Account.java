/*
 *       Filename:  Account.java
 *
 *    Description:  13.18 - Represents a bank account
 *
 *        Created:  05/12/15 03:55:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Account{
    private int accountNumber;
    private int pin;
    private double availableBalance;
    private double totalBalance;

    // CONSTRUCTOR
    // initialise attributes
    public Account(int theAccountNumber, int thePIN,
            double theAvailableBalance, double theTotalBalance){
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }
    // determines whether a user-specified PIN matches PIN in Account
    public boolean validatePIN(int userPIN){
        if(userPIN == pin)
            return true;
        else
            return false;
    }
    // GETTERS
    public double getAvailableBalance(){
        return availableBalance;
    }
    public double getTotalBalance(){
        return totalBalance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    // credits an amount to the account
    public void credit(double amount){
        totalBalance += amount;
    }
    // debits an amount from the account
    public void debit(double amount){
        availableBalance -= amount;
        totalBalance -= amount;
    }

}
