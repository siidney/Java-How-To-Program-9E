/*
 *       Filename:  DrawingSquareSpiralsTest.java
 *
 *    Description:  7.1a - test application
 *
 *        Created:  18/10/15 16:22:25
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class DrawingSquareSpiralsTest{
    public static void main(String[] args){
        DrawingSquareSpirals panel = new DrawingSquareSpirals();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
    }
}
