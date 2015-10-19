/*
 *       Filename:  DrawRainbowTest.java
 *
 *    Description:  7.26 - Test application to display rainbow
 *
 *        Created:  18/10/15 16:12:08
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class DrawRainbowTest{
    public static void main(String[] args){
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}
