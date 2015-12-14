/*
 *       Filename:  CheckBoxTest.java
 *
 *    Description:  14.18 - Testing CheckBoxFrame
 *
 *        Created:  11/12/15 12:02:14
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class CheckBoxTest{
    public static void main(String[] args){
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setSize(275, 100);
        checkBoxFrame.setVisible(true);
    }
}
