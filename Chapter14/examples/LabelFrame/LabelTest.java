/*
 *       Filename:  LabelTest.java
 *
 *    Description:  14.7 - Testing LabelFrame
 *
 *        Created:  10/12/15 17:00:37
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class LabelTest{
    public static void main(String[] args){
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(260, 180);
        labelFrame.setVisible(true);
    }
}
