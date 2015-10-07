/*
 *       Filename:  ConcentricCirclesTest.java
 *
 *    Description:  5.1 - Test application for ConcentricCirles
 *
 *        Created:  06/10/15 16:30:47
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class ConcentricCirclesTest extends JFrame{
    public static void main(String[] args){
        ConcentricCircles panel = new ConcentricCircles();

        // frame to hold the panel
        JFrame application = new JFrame();

        // set frame to exit on close
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }
}
