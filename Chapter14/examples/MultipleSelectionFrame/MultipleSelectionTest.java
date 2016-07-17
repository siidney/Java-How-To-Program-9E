/*
 *       Filename:  MultipleSelectionTest.java
 *
 *    Description:  14.26 - Testing MultipleSelectionFrame
 *
 *        Created:  11/12/15 18:25:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class MultipleSelectionTest{
    public static void main(String[] args){
        MultipleSelectionFrame multipleSelectionFrame =
            new MultipleSelectionFrame();

        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
}
