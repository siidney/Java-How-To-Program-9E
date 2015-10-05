/*
 *       Filename:  AccountTest.java
 *
 *    Description:  3.14 - Inputting and outputting floating point numbers with
 *                  Account objects
 *
 *        Created:  28/09/15 16:14:37
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JOptionPane;

public class AccountTest{
    public static void main(String[] args){

        double depositAmount;
        double withdrawlAmount;

        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        showBalance(account1.getBalance(), account2.getBalance());

        // DEPOSIT
        // account1
        depositAmount = Double.parseDouble(JOptionPane.showInputDialog(
                        "Enter deposit amount for account1: "
                    ));

        showProgress("adding", "account1", depositAmount);

        account1.credit(depositAmount);

        showBalance(account1.getBalance(), account2.getBalance());

        // account2
        depositAmount = Double.parseDouble(JOptionPane.showInputDialog(
                        "Enter deposit amount for account2: "
                    ));

        showProgress("adding", "account2", depositAmount);

        account2.credit(depositAmount);

        showBalance(account1.getBalance(), account2.getBalance());

        // WITHDRAWL
        // account1
        withdrawlAmount = Double.parseDouble(JOptionPane.showInputDialog(
                    "Enter withdrawl amount for account1: "
                    ));

        if(account1.debit(withdrawlAmount) != true){
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
        }
        showBalance(account1.getBalance(), account2.getBalance());

        // account2
        withdrawlAmount = Double.parseDouble(JOptionPane.showInputDialog(
                    "Enter withdrawl amount for account2: "
                    ));

        if(account2.debit(withdrawlAmount) != true){
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
        }
        showBalance(account1.getBalance(), account2.getBalance());
    }
    // show balance dialog
    static private void showBalance(double balance1, double balance2){
        // show balances
        String strBalance = String.format(
                        "account1 balance: $%.2f\naccount2 balance: $%.2f",
                        balance1, balance2
                        );
        JOptionPane.showMessageDialog(null, strBalance);
    }
    // show progress dialog
    static private void showProgress(String action, String account, double amount){
        String strProgress = String.format(
                    "%s $%.2f to %s balance...", action, amount, account);
        JOptionPane.showMessageDialog(null, strProgress);
    }
}
