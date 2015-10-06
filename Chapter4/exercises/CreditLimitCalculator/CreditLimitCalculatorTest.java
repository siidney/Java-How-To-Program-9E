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

        int accNo, startBalance, chargesTotal, creditsTotal, creditLimit;
        char cont = 'y';
        String separator = "\n********************\n";

        while(cont != 'n'){
            System.out.println(separator);
            System.out.print("Enter customer account number: ");
            accNo = sc.nextInt();

            startBalance = requestInput("Enter start balance for account " + accNo + ": ", sc);
            chargesTotal = requestInput("Enter total monthly charges for account " + accNo + ": ", sc);
            creditsTotal = requestInput("Enter total monthly credits for account " + accNo + ": ", sc);
            creditLimit = requestInput("Enter credit limit for account " + accNo + ": ", sc);

            creditCalculator.setAccountInfo(accNo, startBalance,
                    chargesTotal, creditsTotal, creditLimit);

            System.out.println(separator);
            System.out.printf("CREDIT INFORMATION FOR ACCOUNT %d\n", accNo);

            System.out.printf("Starting balance: %d\n", creditCalculator.getStartBalance());
            System.out.printf("Credit Limit: %d\n", creditCalculator.getCreditLimit());
            System.out.printf("Total Charges: %d\n", creditCalculator.getTotalCharges());
            System.out.printf("Total Credits: %d\n", creditCalculator.getTotalCredits());
            System.out.printf("New Balance: %d\n", creditCalculator.getNewBalance());

            if(creditCalculator.creditExceeded())
                System.out.println("Credit limit exceeded.");

            // continue
            System.out.print("Calculate credit for another account? (y/n): ");
            cont = sc.next().charAt(0);
        }
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
