/*
 *       Filename:  TextFieldTest.java
 *
 *    Description:  14.10 - Testing TextFieldFrame
 *
 *        Created:  10/12/15 18:20:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class TextFieldTest{
    public static void main(String[] args){
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 100);
        textFieldFrame.setVisible(true);
    }
}
