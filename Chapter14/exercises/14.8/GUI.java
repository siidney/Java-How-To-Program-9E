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
import java.awt.GridLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class GUI extends JFrame{
    // CÖNSTRUCTOR
    public GUI(){
        super("Exercise 14.8");

        JPanel container = new JPanel();

        Box leftBox = Box.createVerticalBox();
        Box centerBox = Box.createVerticalBox();
        Box innerCenter1 = Box.createHorizontalBox();
        Box innerCenter2 = Box.createHorizontalBox();
        Box rightBox = Box.createVerticalBox();

        JPanel rightGrid = new JPanel(new GridLayout(3, 1, 0, 10));

        // LEFT
        leftBox.add(new JCheckBox("Snap to Grid"));
        leftBox.add(new JCheckBox("Show Grid"));

        // CENTER
        innerCenter1.add(new JLabel("X: "));
        innerCenter1.add(new JTextField(3));
        innerCenter2.add(new JLabel("Y: "));
        innerCenter2.add(new JTextField(3));

        centerBox.add(innerCenter1);
        centerBox.add(Box.createRigidArea(new Dimension(0, 10)));
        centerBox.add(innerCenter2);

        // RIGHT
        rightGrid.add(new JButton("Ok"));
        rightGrid.add(new JButton("Cancel"));
        rightGrid.add(new JButton("Help"));
        rightBox.add(rightGrid);

        container.add(leftBox);
        container.add(Box.createRigidArea(new Dimension(10, 0)));
        container.add(centerBox);
        container.add(Box.createRigidArea(new Dimension(10, 0)));
        container.add(rightBox);
        add(container);
    }
}
