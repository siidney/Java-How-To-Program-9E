/*
 *       Filename:  PanelDemo.java
 *
 *    Description:  14.46 - Testing PanelFrame
 *
 *        Created:  20/12/15 16:45:27
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class PanelDemo extends JFrame{
    public static void main(String[] args){
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200);
        panelFrame.setVisible(true);
    }
}
