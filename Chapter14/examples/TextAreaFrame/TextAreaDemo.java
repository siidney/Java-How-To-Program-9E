/*
 *       Filename:  TextAreaDemo.java
 *
 *    Description:  14.48 - Copying selected text from one textare to another.
 *
 *        Created:  20/12/15 16:55:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class TextAreaDemo{
    public static void main(String[] args){
        TextAreaFrame textAreaFrame = new TextAreaFrame();
        textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textAreaFrame.setSize(425, 200);
        textAreaFrame.setVisible(true);
    }
}
