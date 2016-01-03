/*
 *       Filename:  GUI.java
 *
 *    Description:  14.8 - Create the following GUI. You do not have to provide
 *                  any functionality.
 *
 *        Created:  21/12/15 15:10:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class GUI extends JFrame{
    // CÖNSTRUCTOR
    public GUI(){
        super("Exercise 14.8");

        setLayout(new BorderLayout(15, 15));

        Box leftBox = Box.createVerticalBox();
        Box centerBox = Box.createHorizontalBox();
        Box rightBox = Box.createVerticalBox();

        // LEFT PANEL
        leftBox.createVerticalGlue();
        leftBox.add(new JCheckBox("Snap to Border"));
        leftBox.add(new JCheckBox("Show Grid"));
        add(leftBox, BorderLayout.WEST);
        // CENTER PANEL
        centerBox.add(new JLabel("X: "));
        centerBox.add(new JTextField(5));
        centerBox.add(new JLabel("Y: "));
        centerBox.add(new JTextField(5));
        add(centerBox, BorderLayout.CENTER);
        // RIGHT PANEL
        rightBox.add(new JButton("Ok"));
        rightBox.add(new JButton("Cancel"));
        rightBox.add(new JButton("Help"));
        add(rightBox, BorderLayout.EAST);
    }
}

