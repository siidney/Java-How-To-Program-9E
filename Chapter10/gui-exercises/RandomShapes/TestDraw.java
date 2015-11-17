/*
 *       Filename:  TestDraw.java
 *
 *    Description:  9.1 - Creating a JFrame to display a DrawPanel with a label
 *                  to display status text.
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
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class TestDraw{
    public static void main(String[] args){
        // obtain number of shapes to generate
        String input = JOptionPane.showInputDialog(
                "Enter number of shapes to generate");

        int numShapes = Integer.parseInt(input);

        DrawPanel panel = new DrawPanel(numShapes);
        JFrame application = new JFrame();

        JLabel southLabel = new JLabel(panel.getStatus());

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.add(southLabel, BorderLayout.SOUTH);
        application.setSize(600, 600);
        application.setVisible(true);

    }
}
