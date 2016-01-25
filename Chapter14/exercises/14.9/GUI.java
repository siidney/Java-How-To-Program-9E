/*
 *       Filename:  GUI.java
 *
 *    Description:  14.9 - Create the following GUI. You do not have to provide
 *                  any functionality.
 *
 *        Created:  19/01/16 00:34:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class GUI extends JFrame{
    private static final String[] names = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"};

    // CONSTRUCTOR
    public GUI(){
        super("Exercise 14.9");

        JPanel container = new JPanel();
        JPanel topGrid = new JPanel(new GridLayout(1, 1));
        JPanel bottomGrid = new JPanel(new GridLayout(4, 4, 3, 3));

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        topGrid.add(new JTextField(10));

        // add buttons
        for(int i=0; i<names.length; i++){
            bottomGrid.add(new JButton(names[i]));
        }

        container.add(topGrid);
        container.add(bottomGrid);

        add(container);
    }
}
