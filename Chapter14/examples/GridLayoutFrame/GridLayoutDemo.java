/*
 *       Filename:  GridLayoutDemo.java
 *
 *    Description:  14.44 - Testing GridLayoutFrame
 *
 *        Created:  20/12/15 16:32:16
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class GridLayoutDemo{
    public static void main(String[] args){
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 200);
        gridLayoutFrame.setVisible(true);
    }
}
