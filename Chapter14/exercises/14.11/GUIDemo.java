/*
 *       Filename:  GUIDemo.java
 *
 *    Description:  14.11 - GUI demo
 *
 *        Created:  23/01/16 19:18:27
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class GUIDemo{
    public static void main(String[] args){
        GUI gui = new GUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(700, 200);
        gui.setVisible(true);
    }
}
