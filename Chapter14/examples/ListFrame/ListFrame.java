/*
 *       Filename:  ListFrame.java
 *
 *    Description:  14.23 - JList that displays a list of colours
 *
 *        Created:  11/12/15 17:27:48
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame{
    private JList<String> colorJList;   // list to display colours

    private static final String[] colorNames = {
        "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
        "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {
        Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
        Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
        Color.RED, Color.WHITE, Color.YELLOW};

    // ListFrame constructor add JScrollPane containing JList to JFrame
    public ListFrame(){
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<>(colorNames);
        colorJList.setVisibleRowCount(5);

        // do not allow multiple selections
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add a JScrollPane containing JList to frame
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
                // anonymous inner class
                new ListSelectionListener(){
                    // handle list selection events
                    public void valueChanged(ListSelectionEvent event){
                        getContentPane().setBackground(
                                colors[colorJList.getSelectedIndex()]);
                    }
                });
    }
}
