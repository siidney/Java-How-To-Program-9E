/*
 *       Filename:  BullsEyeTest.java
 *
 *    Description:  6.1 - Test application
 *
 *        Created:  09/10/15 23:55:56
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class BullsEyeTest extends JFrame{
    public static void main(String[] args){
        BullsEye panel = new BullsEye();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
