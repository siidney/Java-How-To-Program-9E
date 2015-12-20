/*
 *       Filename:  BorderLayoutDemo.java
 *
 *    Description:  14.42 - Testing BorderLayoutFrame
 *
 *        Created:  20/12/15 16:24:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class BorderLayoutDemo{
    public static void main(String[] args){
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
}
