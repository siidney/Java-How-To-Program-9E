/*
 *       Filename:  RandomFilledPrimitivesTest.java
 *
 *    Description:  6.2 - Test application
 *
 *        Created:  10/10/15 00:34:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class RandomFilledPrimitivesTest extends JFrame{
    public static void main(String[] args){
        RandomFilledPrimitives panel = new RandomFilledPrimitives();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
