/*
 *       Filename:  Addition.java
 *
 *    Description:  14.2 - Addition program that uses JOptionPane for input and
 *                  output
 *
 *        Created:  10/12/15 16:39:46
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JOptionPane;

public class Addition{
    public static void main(String[] args){
        // obtain user input from JOptionPane input dialog
        String firstNumber = JOptionPane.showInputDialog(
                "Enter first integer: ");
        String secondNumber = JOptionPane.showInputDialog(
                "Enter second integer: ");

        // convert string inputs to int values for use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "The sum is " + sum,
                "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
