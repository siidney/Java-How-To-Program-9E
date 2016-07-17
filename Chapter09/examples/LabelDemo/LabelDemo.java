/*
 *       Filename:  LabelDemo.java
 *
 *    Description:  9.13 - Demonstrates the use of labels
 *
 *        Created:  06/11/15 15:06:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo{
    // create a label with plain text
    JLabel northLabel = new JLabel("North");

    // create an icon from an image so we can put it on a JLabel
    ImageIcon labelIcon = new ImageIcon("GUItip.gif");

    // create a leable with an icon
    JLabel southLabel = new JLabel(labelIcon);

    // set the label to display text (as well as an icon)
    southLabel.setText("South");

    // create a frame to hold the labels
    JFrame application = new JFrame();

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // add the labels to the frame; the second argument specifies
    // where on the frame to add the label
    application.add(northLabel, BorderLayout.NORTH);
    application.add(centerLabel, BorderLayout.CENTER);
    application.add(southLabel, BorderLayout.SOUTH);

    application.setSize(400, 400);
    application.setVisible(true);
}
