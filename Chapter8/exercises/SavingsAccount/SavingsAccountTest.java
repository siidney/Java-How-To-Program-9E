/*
 *       Filename:  SavingsAccountTest.java
 *
 *    Description:  5.6 - Instantiate two 'savingsAccount' objects, 'saver1' and
 *                  'saver2', with balances of $2000.00 and $3000.00,
 *                  respectively.
 *                  Set 'annualInterestRate' to 4%, then calculate the monthly
 *                  interest for each of the 12 months and print the new balance
 *                  for both savers.
 *                  Next set 'annualInterestRate' to 5%, calculate the next
 *                  month's interest and print the new balances for each saver.
 *
 *        Created:  28/10/15 17:09:06
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class SavingsAccountTest{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04f);

        System.out.printf("saver1 initial Balance: %s\n", saver1.toString());
        System.out.printf("saver2 initial Balance: %s\n", saver2.toString());
        System.out.println();

        for(int i=0; i<12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("saver1 - 12 months at 4%% interest: %s\n", saver1.toString());
        System.out.printf("saver2 - 12 months at 4%% interest: %s\n", saver2.toString());

        System.out.println("\nIncrease interest rate to 5%\n");

        SavingsAccount.modifyInterestRate(0.05f);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("saver1 - 1 month at 5%% interest: %s\n", saver1.toString());
        System.out.printf("saver2 - 1 month at 5%% interest: %s\n", saver2.toString());

    }
}
