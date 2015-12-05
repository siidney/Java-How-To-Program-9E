/*
 *       Filename:  Screen.java
 *
 *    Description:  13.14 - Represents the screen of the ATM
 *
 *        Created:  05/12/15 03:46:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Screen{
    // display message without trailing newline
    public void displayMessage(String message){
        System.out.print(message);
    }
    // display message with trailing newline
    public void displayMessageLine(String message){
        System.out.println(message);
    }
    // displays a dollar amount
    public void displayDollarAmount(double amount){
        System.out.printf("$%,.2f", amount);
    }
}
