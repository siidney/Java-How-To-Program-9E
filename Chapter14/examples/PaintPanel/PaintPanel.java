/*
 *       Filename:  PaintPanel.java
 *
 *    Description:  14.34 - Using class MouseMotionAdapter
 *
 *        Created:  16/12/15 11:40:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel{
    private int pointCount = 0; // count number of points

    // array of 10000 java.awt.Point references
    private Point[] points = new Point[10000];

    // set up GUI and register mouse event handler
    public PaintPanel(){
        addMouseMotionListener(
                // anonymouse inner class
                new MouseMotionAdapter(){
                    // store drag coordinates and repaint
                    public void mouseDragged(MouseEvent event){
                        if(pointCount < points.length){
                            points[pointCount] = event.getPoint();  // find point
                            ++pointCount;   // increment number of points in array
                            repaint();      // repaint JFrame

                        }
                    }
                });
    }
    // draw ovals in a 4-by-4 bounding box at specified locations on window
    public void paintComponent(Graphics g){
        super.paintComponent(g);    // clears drawing area

        // draw all points in array
        for(int i=0; i<pointCount; i++){
            g.fillOval(points[i].x, points[i].y, 4, 4);
        }
    }
}
