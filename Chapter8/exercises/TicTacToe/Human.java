/*
 *       Filename:  Human.java
 *
 *    Description:  8.17 - Represents a human player - derives from Agent
 *
 *        Created:  07/12/15 00:17:21
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Human extends Agent{
    private InputManager inputManager;
    private int playerNumber = 0;

    // CONSTRUCTOR
    public Human(Board gameBoard, int playerNo, InputManager iManager){
        super(gameBoard);

        playerNumber = playerNo;
        inputManager = iManager;
    }
    // ABSTRACT METHODS
    @Override
    public void move(){
        getBoard().printBoard();

        System.out.printf("Player %d. Enter space separated coordinates: ",
                playerNumber);
        int row = inputManager.getIntInput();
        int col = inputManager.getIntInput();

        if(!getBoard().movePlayer(row, col, playerNumber))
            move();
    }
}
