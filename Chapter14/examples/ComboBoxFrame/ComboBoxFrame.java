/*
 *       Filename:  ComboBoxFrame.java
 *
 *    Description:  14.21 - JComboBox that displays a list of image names
 *
 *        Created:  11/12/15 16:52:30
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame{
    private JComboBox<String> imagesJComboBox;  // combobox to hold names of icons
    private JLabel label;   // label to display selected icon

    private static final String[] names =
        {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))
    };

    // ComboBoxFrame constructor adds JComboBox to JFrame
    public ComboBoxFrame(){
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<>(names);
        imagesJComboBox.setMaximumRowCount(3);

        imagesJComboBox.addItemListener(
                new ItemListener(){ // anonymous inner class
                    // handle JComboBox events
                    public void itemStateChanged(ItemEvent event){
                        // determine whether item selected
                        if(event.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                    }
                });

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}
