/*
 *       Filename:  CheckBoxFrame.java
 *
 *    Description:  14.17 - Creating JCheckBox buttons
 *
 *        Created:  11/12/15 11:46:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame{
    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;

    // CheckBoxFrame constructor adds JCheckBoxes to JFrame
    public CheckBoxFrame(){
        super("JCheckBox text");
        setLayout(new FlowLayout());

        // setup JTextField and set its font
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italicJCheckBox);

        // register listeners for JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    }
    // private inner class for ItemListener event handling
    private class CheckBoxHandler implements ItemListener{
        // respond to checkbox events
        public void itemStateChanged(ItemEvent event){
            Font font = null;

            // determine which CheckBoxes are checked and create Font
            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if(boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if(italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);
        }
    }
}
