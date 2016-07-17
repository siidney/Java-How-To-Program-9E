/*
 *       Filename:  MultipleSelectionFrame.java
 *
 *    Description:  14.25 - Copying items from one list to another
 *
 *        Created:  11/12/15 18:16:42
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
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{
    private JList colorJList;
    private JList copyJList;
    private JButton copyJButton;

    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
        "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};

    // constructor
    public MultipleSelectionFrame(){
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
                // anonymous inner class
                new ActionListener(){
                    // handle button event
                    public void actionPerformed(ActionEvent event){
                        // place selected values in copyJList
                        copyJList.setListData(colorJList.getSelectedValues());
                    }
                }
        );

        add(copyJButton);

        copyJList = new JList();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        colorJList.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }
}
