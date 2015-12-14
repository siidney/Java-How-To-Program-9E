/*
 *       Filename:  LabelFrame.java
 *
 *    Description:  14.6 - Demonstrating the JLabel class
 *
 *        Created:  10/12/15 16:52:07
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame;  // provides basic window features
import javax.swing.JLabel;  // displays text and images
import javax.swing.SwingConstants;  // common constants used with swing
import javax.swing.Icon;    // interface used to manipulate images
import javax.swing.ImageIcon;       // loads images

public class LabelFrame extends JFrame{
    private JLabel label1;  // label with text
    private JLabel label2;  // lable with constructed text and icon
    private JLabel label3;  // label with added text and icon

    // LabelFrame constructor adds JLabel to JFrame
    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout());    // set frame layout

        // JLable constructor with a string argument
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);    // add label1 to JFrame

        // JLabel constructor with string, icon and alignment arguments
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug,
                SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
