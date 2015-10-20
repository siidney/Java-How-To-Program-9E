/*
 *       Filename:  TurtleGraphicsTest.java
 *
 *    Description:  7.21 - Test application
 *
 *        Created:  19/10/15 18:43:09
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class TurtleGraphicsTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TurtleGraphics tg = new TurtleGraphics();

        boolean running = true;

        while(running){
            tg.printMenu();

            switch(sc.nextInt()){
                case 0:
                    tg.setPen();
                    break;
                case 1:
                    // pen up
                    tg.penUp();
                    break;
                case 2:
                    // pen down
                    tg.penDown();
                    break;
                case 3:
                    // turn right
                    tg.turnRight();
                    break;
                case 4:
                    // turn left
                    tg.turnLeft();
                    break;
                case 5:
                    // move forward n spaces
                    tg.forward(sc.nextInt());
                    break;
                case 6:
                    tg.showGrid();
                    break;
                case 8:
                    tg.reset();
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }
}
