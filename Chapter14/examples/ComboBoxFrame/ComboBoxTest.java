/*
 *       Filename:  ComboBoxTest.java
 *
 *    Description:  14.22 - Testing ComboBoxFrame
 *
 *        Created:  11/12/15 17:05:33
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class ComboBoxTest{
    public static void main(String[] args){
        ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
        comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBoxFrame.setSize(350, 150);
        comboBoxFrame.setVisible(true);
    }
}
