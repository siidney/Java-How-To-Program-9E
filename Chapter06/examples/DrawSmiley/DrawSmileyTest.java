/*
 *       Filename:  DrawSmileyTest.java
 *
 *    Description:  6.12 - Test application that displays a smiley face
 *
 *        Created:  09/10/15 23:46:57
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class DrawSmileyTest{
    public static void main(String[] args){
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}
