/*
 *       Filename:  BankDatabase.java
 *
 *    Description:  13.19 - Represents the bank account information database
 *
 *        Created:  05/12/15 04:00:57
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class BankDatabase{
    private Account[] accounts;

    // CONSTRUCTOR
    // initialise accounts
    public BankDatabase(){
        accounts = new Account[2];
        accounts[0] = new Account(12345, 54321, 1000.0f, 1200.0f);
        accounts[1] = new Account(98765, 56789, 200.0f, 200.0f);
    }
    // GETTERS
    // retrieve account object containing specified account number
    private Account getAccount(int accountNumber){
        // loop through accounts searching for matching account number
        for(Account currentAccount: accounts){
            if(currentAccount.getAccountNumber() == accountNumber)
                return currentAccount;
        }

        return null;
    }
    // return available balance of account with specified account number
    public double getAvailableBalance(int userAccountNumber){
        return getAccount(userAccountNumber).getAvailableBalance();
    }
    // return total balance of Account with specified account number
    public double getTotalBalance(int userAccountNumber){
        return getAccount(userAccountNumber).getTotalBalance();
    }
    // determine whether user specified account number and PIN match those
    // of an account in the databse
    public boolean authenticateUser(int userAccountNumber, int userPIN){
        // attempt the retrieve the account with the account number
        Account userAccount = getAccount(userAccountNumber);

        // if account exists, return result of account method validatePIN
        if(userAccount != null)
            return userAccount.validatePIN(userPIN);
        else
            return false;
    }
    // credit an amount to Account with specified account number
    public void credit(int userAccountNumber, double amount){
        getAccount(userAccountNumber).credit(amount);
    }
    // debit an amount from Account with specified account number
    public void debit(int userAccountNumber, double amount){
        getAccount(userAccountNumber).debit(amount);
    }
}
