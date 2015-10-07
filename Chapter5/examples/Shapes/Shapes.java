/*
 *       Filename:  Shapes.java
 *
 *    Description:  5.26 - Demonstrates drawing different shapes
 *
 *        Created:  06/10/15 15:57:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
    private int choice;

    // constructor
    public Shapes(int choice){
        this.choice = choice;
    }

    // draw a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g){
        for(int i=0; i<10; i++){
            switch(choice){
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10,
                               50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + 1 * 10, 10 + i * 10,
                               50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
}
