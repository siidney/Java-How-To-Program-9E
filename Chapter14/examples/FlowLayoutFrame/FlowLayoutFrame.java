/*
 *       Filename:  FlowLayoutFrame.java
 *
 *    Description:  14.39 - Demonstrating FlowLayout alignments
 *
 *        Created:  20/12/15 02:00:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame{
    private JButton leftJButton;
    private JButton centerJButton;
    private JButton rightJButton;
    private FlowLayout layout;      // layout object
    private Container container;    // container to set layout

    // set up GUI and register button listeners
    public FlowLayoutFrame(){
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // set up leftJButton and register listener
        leftJButton = new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(
                // anonymous inner class
                new ActionListener(){
                    // process leftJButton event
                    public void actionPerformed(ActionEvent event){
                        layout.setAlignment(FlowLayout.LEFT);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                });

        // set up centerJButton and register listener
        centerJButton = new JButton("Center");
        add(centerJButton);
        centerJButton.addActionListener(
                // anonymous inner class
                new ActionListener(){
                    // process centerJButton event
                    public void actionPerformed(ActionEvent event){
                        layout.setAlignment(FlowLayout.CENTER);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                });
        // set up rightJButton and register listener
        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(
                // anonymous inner class
                new ActionListener(){
                    // process centerJButton event
                    public void actionPerformed(ActionEvent event){
                        layout.setAlignment(FlowLayout.RIGHT);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                });
    }
}
