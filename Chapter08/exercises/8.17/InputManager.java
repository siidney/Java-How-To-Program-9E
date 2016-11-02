/*
 *       Filename:  InputManager.java
 *
 *    Description:  Exercise 8.17 - Tic-Tac-Toe
 *                      Keyboard input manager
 *
 *        Created:  07/12/15 00:20:09
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class InputManager{
    private Scanner sc;

    // CONSTRUCTOR
    public InputManager(){
        sc = new Scanner(System.in);
    }
    // returns an integer value entered by the user
    public int getIntInput(){
        return sc.nextInt();
    }
    public char getCharInput(){
        return sc.next().charAt(0);
    }
}
