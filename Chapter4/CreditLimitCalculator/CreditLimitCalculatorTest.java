/*
 *       Filename:  CreditLimitCalculatorTest.java
 *
 *    Description:  4.18 - Determine whether any department store customer has
 *                  exceed the credit limit on a charge account.
 *
 *        Created:  01/10/15 17:19:09
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CreditLimitCalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CreditLimitCalculator creditCalculator = new CreditLimitCalculator();

        int accNo;
        double startBalance, chargesTotal, creditsTotal, creditLimit;
        char cont = 'y';

        while(cont != 'n'){
            System.out.println("\n********************\n");
            System.out.print("Enter customer account number: ");
            accNo = sc.nextInt();

            System.out.printf("Enter start balance for account %d: ", accNo);
            startBalance = sc.nextDouble();

            System.out.printf("Enter total monthly charges for account %d: ", accNo);
            chargesTotal = sc.nextDouble();

            System.out.printf("Enter total monthly credits for account %d: ", accNo);
            creditsTotal = sc.nextDouble();

            System.out.printf("Enter credit limit for account %d: ", accNo);
            creditLimit = sc.nextDouble();

            creditCalculator.setAccountInfo(accNo, startBalance,
                    chargesTotal, creditsTotal, creditLimit);

            System.out.println("\n********************\n");
            System.out.printf("CREDIT INFORMATION FOR ACCOUNT %d\n", accNo);

            System.out.printf("Starting balance: %.2f\n", creditCalculator.getStartBalance());
            System.out.printf("Credit Limit: %.2f\n", creditCalculator.getCreditLimit());
            System.out.printf("Total Charges: %.2f\n", creditCalculator.getTotalCharges());
            System.out.printf("Total Credits: %.2f\n", creditCalculator.getTotalCredits());
            System.out.printf("New Balance: %.2f\n", creditCalculator.getNewBalance());

            if(creditCalculator.creditExceeded())
                System.out.println("Credit limit exceeded.");

            // continue
            System.out.println("Calculate credit for another account? (y/n): ");
            cont = sc.next().charAt(0);
        }
    }
}
