/*
 *       Filename:  DrawPanelTest.java
 *
 *    Description:  4.19 - Display a DrawPanel
 *
 *        Created:  30/09/15 13:40:02
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class DrawPanelTest{
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();

        // frame to hold the panel
        JFrame application = new JFrame();

        // set frame to exit on close
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
