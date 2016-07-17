/*
 *       Filename:  RadioButtonTest.java
 *
 *    Description:  14.20 - Testing RadioButtonFrame
 *
 *        Created:  11/12/15 12:24:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class RadioButtonTest{
    public static void main(String[] args){
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(300, 100);
        radioButtonFrame.setVisible(true);
    }
}
