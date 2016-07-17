/*
 *       Filename:  Deposit.java
 *
 *    Description:  13.23 - Represents a deposit ATM transaction
 *
 *        Created:  05/12/15 05:04:48
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Deposit extends Transaction{
    private double amount;

    private Keypad keypad;
    private DepositSlot depositSlot;

    private final static int CANCELED = 0;

    // CONSTRUCTOR
    public Deposit(int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase, Keypad atmKeypad,
            DepositSlot atmDepositSlot){
        super(userAccountNumber, atmScreen, atmBankDatabase);

        keypad = atmKeypad;
        depositSlot = atmDepositSlot;
    }
    // perform transaction
    @Override
    public void execute(){
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        amount = promptForDepositAmount();

        // check whether user entered deposit amount or canceled
        if(amount != CANCELED){
            screen.displayMessage("\nPlease insert a deposit envelope containing ");
            screen.displayDollarAmount(amount);
            screen.displayMessageLine(".");

            // receive deposit envelope
            boolean envelopeReceived = depositSlot.isEnvelopeReceived();

            // check whether deposit envelope was received
            if(envelopeReceived){
                screen.displayMessageLine("\nYour envelope has been " +
                        "received.\nNOTE: The money just deposited will not " +
                        "be available until we verify the amount of any " +
                        "enclosed cash and your checks clear.");

                // credit account to reflect the deposit
                bankDatabase.credit(getAccountNumber(), amount);
            }else{
                screen.displayMessageLine("\nYou did not insert an " +
                        "envelope, so the ATM has canceled your transaction.");
            }
        }else{
            screen.displayMessageLine("\nCancelling transaction...");
        }
    }
    // prompt user to enter a deposit amount in cents
    private double promptForDepositAmount(){
        Screen screen = getScreen();

        // display the prompt
        screen.displayMessage("\nPlease enter a deposit amount in " +
                "CENTS (0 to cancel)");
        int input = keypad.getInput();

        // check whether user canceled or entered valid amount
        if(input == CANCELED){
            return CANCELED;
        }else{
            return (double)input / 100;
        }
    }
}
