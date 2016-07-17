/*
 *       Filename:  FlowLayoutDemo.java
 *
 *    Description:  14.40 - Testing FlowLayoutFrame
 *
 *        Created:  20/12/15 02:12:02
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class FlowLayoutDemo{
    public static void main(String[] args){
        FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
        flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flowLayoutFrame.setSize(300, 75);
        flowLayoutFrame.setVisible(true);
    }
}
