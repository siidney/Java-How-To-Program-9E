/*
 *       Filename:  TurtleGraphics.java
 *
 *    Description:  7.21 - Write an application to implement the turtle graphics
 *                  capabilities discussed here.
 *                  Write several turtle graphics programs to draw interesting
 *                  shapes.
 *                  Add other commands to increase the power of you turtle
 *                  graphics language.
 *
 *                  NOTE : Didn't write several tutle programs as couldn't be
 *                  bothered. Just made it so the user can control the pen and
 *                  draw whatever they wanted.
 *
 *        Created:  19/10/15 18:40:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Arrays;
import java.util.Scanner;

public class TurtleGraphics{
    Scanner sc = new Scanner(System.in);

    private final int GRID_ROWS = 20;
    private final int GRID_COLS = 20;
    private enum Direction{UP, DOWN, LEFT, RIGHT};

    private int[][] arrGrid = new int[GRID_ROWS][GRID_COLS];
    private int[] coords2D = new int[2];
    private boolean penDown = false;
    private int endPoint;
    private char pen = '*';

    private Direction drawDir = Direction.RIGHT;

    // constructor
    public TurtleGraphics(){
        reset();
    }
    // SETTERS
    // pen up
    public void setPen(){
        System.out.printf("\nCurrent pen: %c\n", pen);
        System.out.print("Enter new pen character: ");
        pen = sc.next().charAt(0);
    }
    public void penUp(){
        if(penDown == true)
            penDown = false;
    }
    // pen down
    public void penDown(){
        if(penDown == false)
            penDown = true;

        // draw at current cursor position
        arrGrid[coords2D[0]][coords2D[1]] = 1;
    }
    // turn left
    public void turnLeft(){
        switch(drawDir){
            case RIGHT:
                drawDir = Direction.UP;
                break;
            case UP:
                drawDir = Direction.LEFT;
                break;
            case LEFT:
                drawDir = Direction.DOWN;
                break;
            case DOWN:
                drawDir = Direction.RIGHT;
                break;
        }
    }
    // turn right
    public void turnRight(){
        switch(drawDir){
            case RIGHT:
                drawDir = Direction.DOWN;
                break;
            case DOWN:
                drawDir = Direction.LEFT;
                break;
            case LEFT:
                drawDir = Direction.UP;
                break;
            case UP:
                drawDir = Direction.RIGHT;
                break;
        }
    }
    // GETTERS
    public void getLocationDirection(){
         System.out.printf("\nPen is at location (%d,%d)", coords2D[0], coords2D[1]);
         System.out.printf("\nDrawing direction is %s\n", drawDir);
         System.out.println("**********************\n");
    }
    // move forward n spaces in drawDir
    public void forward(int distance){
        // if the pen is down draw
        switch(drawDir){
            // move right
            case RIGHT:
                endPoint = coords2D[1] + distance;

                // check out of bounds
                if(endPoint >= GRID_COLS)
                    endPoint = GRID_COLS - 1;

                // draw
                if(penDown){
                    for(int col=coords2D[1]; col<endPoint; col++){
                        arrGrid[coords2D[0]][col] = 1;
                    }
                }

                // set new coords
                coords2D[1] = endPoint;
                break;
                // move left
            case LEFT:
                endPoint = coords2D[1] - distance;

                // check out of bounds
                if(endPoint <= 0)
                    endPoint = 0;

                // draw
                if(penDown){
                    for(int col=coords2D[1]; col>=endPoint; col--){
                        arrGrid[coords2D[0]][col] = 1;
                    }
                }

                // set new coords
                coords2D[1] = endPoint;
                break;
                // move up
            case UP:
                endPoint = coords2D[0] - distance;

                // check out of bounds
                if(endPoint <= 0)
                    endPoint = 0;

                // draw
                if(penDown){
                    for(int row=coords2D[0]; row>=endPoint; row--){
                        arrGrid[row][coords2D[1]] = 1;
                    }
                }

                // set new coords
                coords2D[0] = endPoint;
                break;
                // move down
            case DOWN:
                endPoint = coords2D[0] + distance;

                // check out of bounds
                if(endPoint >= GRID_ROWS)
                    endPoint = GRID_ROWS - 1;

                // draw
                if(penDown){
                    for(int row=coords2D[0]; row<endPoint; row++){
                        arrGrid[row][coords2D[1]] = 1;
                    }
                }

                // set new coords
                coords2D[0] = endPoint;
                break;
        }
    }
    // prints the grid
    public void showGrid(){
        System.out.println();
        for(int row=0; row<arrGrid.length; row++){
            // border
            System.out.print("| ");
            for(int column=0; column<arrGrid[row].length; column++){
                System.out.printf("%c",
                        (arrGrid[row][column] == 1) ? pen : ' ');
            }
            System.out.print(" |");
            System.out.println();
        }
    }
    // reset grid and coords to default values
    public void reset(){
        // reset each row
        for(int[] row : arrGrid)
            Arrays.fill(row, 0);

        // centralise 'pen'
        coords2D[0] = 9;
        coords2D[1] = 9;
    }
    // print command menu
    public void printMenu(){
        getLocationDirection();
        System.out.println("0. Change Pen\n1. Pen Up\n2. Pen Down\n3. Turn Right\n4. Turn Left");
        System.out.println("5 n. Move forward n spaces");
        System.out.println("6. Display the Drawing\n8. Reset Drawing\n9. Finish Drawing");
        System.out.print("> ");
    }
}
