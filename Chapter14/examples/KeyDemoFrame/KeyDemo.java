/*
 *       Filename:  KeyDemo.java
 *
 *    Description:  14.37 - Testing KeyDemoFrame
 *
 *        Created:  16/12/15 14:59:46
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class KeyDemo{
    public static void main(String[] args){
        KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350, 100);
        keyDemoFrame.setVisible(true);
    }
}
