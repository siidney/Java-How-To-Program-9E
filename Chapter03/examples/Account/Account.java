/*
 *       Filename:  Account.java
 *
 *    Description:  3.13 - Account class with constructor to validate and
 *                  initialise instance variable balance of type double.
 *
 *        Created:  28/09/15 16:02:27
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */

public class Account{
    private double balance;

    // constructor
    public Account(double initialBalance){
        // ensure initialBalance > 0.0
        // if not it is initialised to 0.0

        if(initialBalance > 0.0)
            balance = initialBalance;
    }
    // credit account
    public void credit(double amount){
        balance += amount;
    }
    // debit account
    public boolean debit(double amount){
        // ensure sufficient funds
        if(amount > balance){
            return false;
        }

        balance -= amount;
        return true;
    }
    // get balance
    public double getBalance(){
        return balance;
    }
}
