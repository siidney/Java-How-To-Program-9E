/*
 *       Filename:  ShapesTest.java
 *
 *    Description:  5.27 - Test application that displays class Shapes.
 *
 *        Created:  06/10/15 16:07:21
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest{
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                "Enter 2 to draw ovals."
                );
        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
