/*
 *       Filename:  BorderLayoutFrame.java
 *
 *    Description:  14.41 - Demonstrating BorderLayout
 *
 *        Created:  20/12/15 16:18:04
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener{
    private JButton[] buttons;
    private static final String[] names = {"Hide North", "Hide South",
        "Hide East", "Hide West", "Hide Center"};
    private BorderLayout layout;

    // setup GUI and event handling
    public BorderLayoutFrame(){
        super("BorderLayout Demo");

        layout = new BorderLayout(5, 5);
        setLayout(layout);
        buttons = new JButton[names.length];

        // create JButtons and register listeners for them
        for(int count=0; count<names.length; count++){
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }
    // handle button events
    public void actionPerformed(ActionEvent event){
        // check event source and lay out content pane correspondingly
        for(JButton button : buttons){
            if(event.getSource() == button)
                button.setVisible(false);
            else
                button.setVisible(true);
        }
        layout.layoutContainer(getContentPane());
    }
}
