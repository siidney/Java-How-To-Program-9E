/*
 *       Filename:  TextAreaFrame.java
 *
 *    Description:  14.47 - Copying selected text from one textArea to another.
 *
 *        Created:  20/12/15 16:49:40
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame{
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton copyJButton;

    // no argument constructor
    public TextAreaFrame(){
        super("TextArea Demo");

        Box box = Box.createHorizontalBox();

        String demo = "this is a demo string to\n" +
            "illustrate copying text\nfrom on textarea to\n" +
            "another textarea using an\nexternal event\n";

        textArea1 = new JTextArea(demo, 10, 15);
        box.add(new JScrollPane(textArea1));

        copyJButton = new JButton("Copy >>>");
        box.add(copyJButton);
        copyJButton.addActionListener(
                // anonymous inner class
                new ActionListener(){
                    // set text in textArea2 to select text from textArea1
                    public void actionPerformed(ActionEvent event){
                        textArea2.setText(textArea1.getSelectedText());
                    }
                });
        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2));

        add(box);
    }
}
