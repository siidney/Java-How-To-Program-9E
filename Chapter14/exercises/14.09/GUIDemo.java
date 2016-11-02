/*
 *       Filename:  GUIDemo.java
 *
 *    Description:  Exercise 14.9 - Create GUI
 *
 *        Created:  19/01/16 00:33:35
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
        gui.setSize(250, 250);
        gui.setVisible(true);
    }
}
