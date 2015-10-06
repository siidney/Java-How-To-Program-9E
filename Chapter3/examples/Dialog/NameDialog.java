/*
 *       Filename:  NameDialog.java
 *
 *    Description:  3.18 - Basic input with a dialog box
 *
 *        Created:  28/09/15 16:56:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JOptionPane;

public class NameDialog{
    public static void main(String[] args){
        // prompt for name
        String name = JOptionPane.showInputDialog("What is your name? ");

        // create the message
        String message = String.format("Welcome, %s to Java Programming!", name);

        // show message
        JOptionPane.showMessageDialog(null, message);
    }
}
