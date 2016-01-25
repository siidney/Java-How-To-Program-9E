/*
 *       Filename:  GUIDemo.java
 *
 *    Description:  14.10 - GUIDemo
 *
 *        Created:  19/01/16 00:54:15
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class GUIDemo{
    public static void main(String[] args){
        GUI gui = new GUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400, 125);
        gui.setVisible(true);
    }
}
