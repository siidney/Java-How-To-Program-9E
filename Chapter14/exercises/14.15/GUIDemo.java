/*
 *       Filename:  GUIDemo.java
 *
 *    Description:  Exercise 14.15 - Displaying Events
 *
 *        Created:  24/01/16 20:08:00
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
        gui.setSize(400, 350);
        gui.setVisible(true);
    }
}
