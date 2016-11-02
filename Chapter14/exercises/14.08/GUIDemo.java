/*
 *       Filename:  GUIDemo.java
 *
 *    Description:  Exercise 14.8 - Create GUI
 *
 *        Created:  21/12/15 15:31:16
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
        gui.setSize(400, 250);
        gui.setVisible(true);
    }
}
