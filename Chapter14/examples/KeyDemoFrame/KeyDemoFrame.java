/*
 *       Filename:  KeyDemoFrame.java
 *
 *    Description:  14.36 - Demonstrating keystroke events
 *
 *        Created:  16/12/15 14:38:16
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener{
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private JTextArea textArea;

    // KeyDemoFrame constructor
    public KeyDemoFrame(){
        super("Demonstrating Keystroke events");

        textArea = new JTextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);

        addKeyListener(this);   // allow frame to process key events
    }
    // handle press of any key
    public void keyPressed(KeyEvent event){
        line1 = String.format("Key pressed: %s",
                KeyEvent.getKeyText(event.getKeyCode()));   // show pressed key
        setLines2and3(event);   // set output lines two and three
    }
    // handle release of any key
    public void keyReleased(KeyEvent event){
        line1 = String.format("Key released: %s",
                KeyEvent.getKeyText(event.getKeyCode()));   // show released key
        setLines2and3(event);   // set output lines two and three
    }
    // handle press of an action key
    public void keyTyped(KeyEvent event){
        line1 = String.format("Key typed: %s", event.getKeyChar());
        setLines2and3(event);
    }
    // set second and third lines of output
    private void setLines2and3(KeyEvent event){
        line2 = String.format("This key is %san action key",
                (event.isActionKey() ? "" : "not "));

        String temp = KeyEvent.getKeyModifiersText(event.getModifiers());

        line3 = String.format("Modifier keys pressed: %s",
                (temp.equals("") ? "none" : temp)); // output modifiers

        textArea.setText(String.format("%s\n%s\n%s\n",
                    line1, line2, line3));
    }
}
