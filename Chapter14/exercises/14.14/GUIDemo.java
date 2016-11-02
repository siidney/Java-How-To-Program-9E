/*
 *       Filename:  GUIDemo.java
 *
 *    Description:  Exercise 14.14 - Guess-the-Number Game
 *
 *        Created:  24/01/16 18:13:43
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
        gui.setSize(300, 250);
        gui.setVisible(true);
    }
}
