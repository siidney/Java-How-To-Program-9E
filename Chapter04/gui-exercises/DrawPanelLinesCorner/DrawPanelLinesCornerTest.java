/*
 *       Filename:  DrawPanelLinesCornerTest.java
 *
 *    Description:  4.1 - DrawPanelLinesCornerTest
 *
 *        Created:  30/09/15 16:22:19
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class DrawPanelLinesCornerTest{
    public static void main(String[] args){
        DrawPanelLinesCorner panel = new DrawPanelLinesCorner();

        // frame to hold the panel
        JFrame application = new JFrame();

        // set frame to exit on close
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
