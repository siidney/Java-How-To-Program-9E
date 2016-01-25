/*
 *       Filename:  TemperatureConversionTest.java
 *
 *    Description:  14.12 - test application
 *
 *        Created:  23/01/16 21:50:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import javax.swing.JFrame;

public class TemperatureConversionTest{
    public static void main(String[] args){
        GUI gui = new GUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400, 250);
        gui.setVisible(true);
    }
}
