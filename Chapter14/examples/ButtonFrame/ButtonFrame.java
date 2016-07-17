/*
 *       Filename:  ButtonFrame.java
 *
 *    Description:  114.15 - Creating JButtons
 *
 *        Created:  10/12/15 19:17:55
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    private JButton plainJButton;   // button with just text
    private JButton fancyJButton;   // button with icons

    // ButtonFrame adds JButtons to JFrame
    public ButtonFrame(){
        super("Testing Buttons");

        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug1.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug1.png"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }
    // inner button event handling class
    private class ButtonHandler implements ActionListener{
        // handle button events
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                        "You pressed %s", event.getActionCommand()));
        }
    }
}
