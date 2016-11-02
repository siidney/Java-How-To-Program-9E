/*
 *       Filename:  GUI.java
 *
 *    Description:  Exercise 14.11 - Create GUI
 *
 *        Created:  23/01/16 19:18:38
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class GUI extends JFrame{
    // CONSTRUCTOR
    public GUI(){
        super("Exercise 14.11");

        JPanel container = new JPanel();
        JPanel innerContainer = new JPanel(new GridBagLayout());
        JPanel buttonGrid = new JPanel(new GridLayout(4, 1, 0, 10));
        JPanel centralGrid = new JPanel(new GridLayout(1, 5, 0, 0));
        JPanel checkBoxGrid = new JPanel(new GridLayout(3, 1, 0, 0));
        JPanel radioBtnGrid = new JPanel(new GridLayout(3, 1, 0, 0));

        ButtonGroup radioGroup = new ButtonGroup();

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;

        // ROW 1
        c.gridx = 0;
        c.gridy = 0;

        innerContainer.add(new JLabel("Printer: MyPrinter"), c);

        // ROW 2
        c.gridx = 0;
        c.gridy = 1;

        checkBoxGrid.add(new JCheckBox("Image"));
        checkBoxGrid.add(new JCheckBox("Text"));
        checkBoxGrid.add(new JCheckBox("Code"));

        JRadioButton radioSelection = new JRadioButton("Selection");
        JRadioButton radioAll = new JRadioButton("All");
        JRadioButton radioApplet = new JRadioButton("Applet");

        radioGroup.add(radioSelection);
        radioGroup.add(radioAll);
        radioGroup.add(radioApplet);

        radioBtnGrid.add(radioSelection);
        radioBtnGrid.add(radioAll);
        radioBtnGrid.add(radioApplet);

        centralGrid.add(new JTextArea());
        centralGrid.add(checkBoxGrid);
        centralGrid.add(new JTextArea());
        centralGrid.add(radioBtnGrid);
        centralGrid.add(new JTextArea());

        innerContainer.add(centralGrid, c);

        // ROW 3
        String names[] = {"High", "Medium", "Low"};
        JPanel bottom = new JPanel();

        c.gridx = 0;
        c.gridy = 2;
        bottom.add(new JLabel("Print Quality:"));

        bottom.add(new JComboBox(names));

        bottom.add(new JCheckBox("Print to File"));

        innerContainer.add(bottom, c);

        container.add(innerContainer);

        // COL 2
        buttonGrid.add(new JButton("OK"), c);
        buttonGrid.add(new JButton("Cancel"), c);
        buttonGrid.add(new JButton("Setup..."), c);
        buttonGrid.add(new JButton("Help"), c);

        container.add(buttonGrid);

        add(container);
    }
}
