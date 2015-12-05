/*
 *       Filename:  CashDispenser.java
 *
 *    Description:  13.16 - Represents the cash dispenser of the ATM
 *
 *        Created:  05/12/15 03:50:09
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CashDispenser{
    // default initial number of bills in the dispenser
    private final static int INITIAL_COUNT = 500;
    private int count;  // number of $20 bills remaining

    // CONSTRUCTOR
    // no arg constructor initialises count to default
    public CashDispenser(){
        count = INITIAL_COUNT;
    }
    // simulates dispensing of specified amount of cash
    public void dispenseCash(int amount){
        int billsRequired = amount / 20;
        count -= billsRequired;
    }
    // inidicates whether dispenser can dispense desired amount
    public boolean isSufficientCashAvailable(int amount){
        int billsRequired = amount / 20;

        if(count >= billsRequired)
            return true;
        else
            return false;
    }
}
