/*
 *       Filename:  TestDraw.java
 *
 *    Description:  8.20 - Creating a JFrame to display a DrawPanel
 *
 *        Created:  26/10/15 18:13:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class TestDraw{
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
