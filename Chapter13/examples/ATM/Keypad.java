/*
 *       Filename:  Keypad.java
 *
 *    Description:  13.15 - Represents the keypad of the ATM
 *
 *        Created:  05/12/15 03:48:28
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Keypad{
    private Scanner sc;

    // CONSTRUCTOR
    // no arg constructor initialises the scanner
    public Keypad(){
        sc = new Scanner(System.in);
    }
    // returns an integer value entered by the user
    public int getInput(){
        return sc.nextInt();
    }
}
