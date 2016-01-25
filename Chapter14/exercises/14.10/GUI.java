/*
 *       Filename:  GUI.java
 *
 *    Description:  14.10 - Create the following GUI. You do not have to provide
 *                  any functionality.
 *
 *        Created:  19/01/16 00:54:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;

public class GUI extends JFrame{
    private static final String[] names = {
        "Red", "Green", "Blue", "Purple", "Greenish"};

    // CONSTRUCTOR
    public GUI(){
        super("Exercise 14.10");

        setLayout(new BorderLayout(5, 5));

        JPanel center = new JPanel();
        JPanel bottom = new JPanel();

        add(new JComboBox(names), BorderLayout.NORTH);

        center.add(new JCheckBox("Background"));
        center.add(new JCheckBox("Foreground"));

        add(center, BorderLayout.CENTER);

        bottom.add(new JButton("Ok"));
        bottom.add(new JButton("Cancel"));

        add(bottom, BorderLayout.SOUTH);
    }
}
