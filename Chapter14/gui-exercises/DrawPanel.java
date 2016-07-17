/*
 *       Filename:  DrawPanel.java
 *
 *    Description:  14.17 - Expanding 10.2
 *
 *        Created:  26/10/15 18:08:25
 *       Revision:  27/01/16 16:13:06
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.3
 *
 * =====================================================================================
 */
import java.util.Random;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class DrawPanel extends JPanel{
    private MyShape[] shapes;       // store for all user drawn shaped
    private int shapeCount = 0;     // count of number of shapes in array
    private int shapeType = 0;      // the type of shape to draw

    private MyShape currentShape;   // the currently drawn shape
    private Color currentColor;     // the current drawing colour
    private boolean filledShape;    // determine whether to draw filled shape
    private JLabel statusLabel;     // status bar representation (mouse coords)

    // CONSTRUCTOR
    public DrawPanel(){
    }
    // SETTERS
    public void setShapeType(int shapeType){
        this.shapeType = shapeType;
    }
    public void setCurrentColor(Color currentColor){
        this.currentColor = currentColor;
    }
    public void setIsFilled(boolean isFilled){
        this.filledShape = isFilled;
    }
    // Clears the last shape drawn by decrementing instance var shapeCount
    public void clearLastShape(){
        if(this.shapeCount > 0)
            shapeCount--;
        super.repaint();
    }
    // remove all shaped in current drawing by setting shapeCount to zero
    public void clearDrawing(){
        this.shapeCount = 0;
        super.repaint();
    }
    // Draws the shapes in the array.
    // uses instance var shapeCount to determine how many shapes to draw.
    // calls current shapes draw method, provided currentShape is not null
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i=0; i<shapeCount; i++){
            shapes[i].draw(g);
        }
        if(currentShape != null)
            currentShape.draw(g);
    }
}
