/*
 *       Filename:  Withdrawl.java
 *
 *    Description:  13.21 - Represents a withdrawal ATM transaction
 *
 *        Created:  05/12/15 04:46:59
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Withdrawl extends Transaction{
    private int amount;

    private Keypad keypad;
    private CashDispenser cashDispenser;

    // constant corresponding to menu option to cancel
    private final static int CANCELED = 6;

    // CONSTRUCTOR
    public Withdrawl(int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase, Keypad atmKeypad,
            CashDispenser atmCashDispenser){
        super(userAccountNumber, atmScreen, atmBankDatabase);

        // initialise references to keypad and cash dispenser
        keypad = atmKeypad;
        cashDispenser = atmCashDispenser;
    }
    // perform transaction
    @Override
    public void execute(){
        boolean cashDispensed = false;
        double availableBalance;

        // get reference to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // loop until cash is dispensed or the user cancels
        do{
            // obtain chosen withdrawl amount from user
            amount = displayMenuOfAmounts();

            if(amount != CANCELED){
                // get available balance of account involved
                availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

                // ensure user has sufficient funds
                if(amount <= availableBalance){
                    // ensure cash dispenser has sufficient funds
                    if(cashDispenser.isSufficientCashAvailable(amount)){
                        // update the account involved to reflect the withdrawl
                        bankDatabase.debit(getAccountNumber(), amount);

                        cashDispenser.dispenseCash(amount);
                        cashDispensed = true;

                        // instruct user to take cash
                        screen.displayMessageLine("\nYour cash has been" +
                                " dispensed. Please take your cash now.");
                    }else{
                        screen.displayMessageLine(
                                "\nInsufficient cash available in the ATM." +
                                "\n\nPlease choose a smaller amount.");
                    }
                }else{
                    screen.displayMessageLine(
                            "\nInsufficient funds in your account." +
                            "\n\nPlease choose a smaller amount.");
                }
            }else{
                screen.displayMessageLine("\nCancelling transaction...");
            }
        }while(!cashDispensed);
    }
    // display a menu of withdrawl amounts and the option to cancel;
    // return the chosen amount or 0 if the user chooses to cancel
    private int displayMenuOfAmounts(){
        int userChoice = 0;

        Screen screen = getScreen();

        // array of amounts to correspond to menu numbers
        int[] amounts = {0, 20, 40, 60, 100, 200};

        // loop while choice not valid
        while(userChoice == 0){
            screen.displayMessageLine("\nWithdrawl Menu:");
            screen.displayMessageLine("1 - $20");
            screen.displayMessageLine("2 - $40");
            screen.displayMessageLine("3 - $60");
            screen.displayMessageLine("4 - $100");
            screen.displayMessageLine("5 - $200");
            screen.displayMessageLine("6 - Cancel transaction");
            screen.displayMessage("\nChoose a withdrawl amount: ");

            int input = keypad.getInput();

            switch(input){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    userChoice = amounts[input];
                break;
                case CANCELED:
                    userChoice = CANCELED;
                break;
                default:
                    screen.displayMessageLine("\nInvalid selection, Try again.");
            }
        }

        return userChoice;
    }
}
