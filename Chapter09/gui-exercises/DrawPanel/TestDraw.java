/*
 *       Filename:  TestDraw.java
 *
 *    Description:  9.1 - Creating a JFrame to display a DrawPanel with a label
 *                  to display status text.
 *
 *        Created:  26/10/15 18:13:26
 *       Revision:  06/11/15 15:56:02
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class TestDraw{
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        JLabel southLabel = new JLabel(panel.getStatus());

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.add(southLabel, BorderLayout.SOUTH);
        application.setSize(600, 600);
        application.setVisible(true);

    }
}
