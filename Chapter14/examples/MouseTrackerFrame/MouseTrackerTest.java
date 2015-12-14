/*
 *       Filename:  MouseTrackerTest.java
 *
 *    Description:  14.29 - Testing MouseTrackerFrame
 *
 *        Created:  14/12/15 00:37:59
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class MouseTrackerTest{
    public static void main(String[] args){
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
}
