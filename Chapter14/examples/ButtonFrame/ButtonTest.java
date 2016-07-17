/*
 *       Filename:  ButtonTest.java
 *
 *    Description:  14.16 - Testing ButtonFrame
 *
 *        Created:  11/12/15 11:22:46
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class ButtonTest{
    public static void main(String[] args){
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
}
