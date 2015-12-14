/*
 *       Filename:  TextFieldFrame.java
 *
 *    Description:  14.9 - Demonstrating the JTestField class
 *
 *        Created:  10/12/15 17:38:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
    private JTextField textField1;  // text field with set size
    private JTextField textField2;  // text field constructed with text
    private JTextField textField3;  // text field with text and size
    private JPasswordField passwordField;   // password field with text

    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");

        setLayout(new FlowLayout());

        // construct TextField with 10 cols
        textField1 = new JTextField(10);
        add(textField1);

        // construct TextField with default text
        textField2 = new JTextField("Enter text here");
        add(textField2);

        // construct TextField with default text and 21 cols
        textField3 = new JTextField("Uneditable text field", 21);
        add(textField3);

        // construct password field with default text
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    // private inner class for event handling
    private class TextFieldHandler implements ActionListener{
        // process text field events
        public void actionPerformed(ActionEvent event){
            String string = "";     // declare string to display

            // user presses enter in JTextField textField1
            if(event.getSource() == textField1)
                string = String.format("textField1: %s",
                        event.getActionCommand());
            // user pressed Enter in JTextField textField2
            else if(event.getSource() == textField2)
                string = String.format("textField2: %s",
                        event.getActionCommand());
            // user pressed Enter in JTextField textField3
            else if(event.getSource() == textField3)
                string = String.format("textField3: %s",
                        event.getActionCommand());
            // user pressed Enter in JTextField passwordField
            else if(event.getSource() == passwordField)
                string = String.format("passwordField: %s",
                        event.getActionCommand());

            // display JTextfield content
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
