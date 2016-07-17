/*
 *       Filename:  PanelFrame.java
 *
 *    Description:  14.45 - Using JPanel to help lay out components
 *
 *        Created:  20/12/15 16:42:28
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame{
    private JPanel buttonJPanel;
    private JButton[] buttons;

    // no argument constructor
    public PanelFrame(){
        super("Panel Demo");

        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        // create and add buttons
        for(int count=0; count<buttons.length; count++){
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]);
        }
        add(buttonJPanel, BorderLayout.SOUTH);
    }
}
