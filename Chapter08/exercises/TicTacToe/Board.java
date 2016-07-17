/*
 *       Filename:  Board.java
 *
 *    Description:  8.17 - Game board representation
 *
 *        Created:  07/12/15 00:27:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Arrays;

public class Board{
    private final int GRID_ROWS = 3;
    private final int GRID_COLS = 3;
    private enum CellValue{EMPTY, X, O};
    private enum GameStatus{RUNNING, EXIT, WON, DRAW};

    private int winner = 0;
    private int[][] gameBoard = new int[GRID_ROWS][GRID_COLS];

    // CONSTRUCTOR
    public Board(){
        reset();
    }
    // GETTERS
    // get board representation
    public int[][] getBoard(){
        return this.gameBoard;
    }
    public int getRows(){
        return GRID_ROWS;
    }
    public int getCols(){
        return GRID_COLS;
    }
    public int getWinner(){
        return this.winner;
    }
    // SETTERS
    public void setWinner(int winner){
        this.winner = winner;
    }
    // print the game board
    public void printBoard(){
        // header
        System.out.printf("%3d%3d%3d\n", 0, 1, 2);

        for(int row=0; row<GRID_ROWS; row++){
            System.out.printf("%d", row);
            for(int col=0; col<GRID_COLS; col++){
                if(gameBoard[row][col] == 1)
                    System.out.print(" " + CellValue.X + " ");
                else if(gameBoard[row][col] == 2)
                    System.out.print(" " + CellValue.O + " ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    // move player
    public boolean movePlayer(int row, int col, int player){
        // ensure coords are not out of bounds
        if((row >= 0 && row < GRID_ROWS) && (col >= 0 && col < GRID_COLS)){
            // check space is empty
            if(isEmpty(row, col)){
                gameBoard[row][col] = player;
                return true;
            }else{
                System.out.printf("\nCell %d,%d not empty\n", row, col);
            }
        }else{
            System.out.println("\nInvalid Coordinates\n");
        }
        return false;
    }
    // check cell is empty
    public boolean isEmpty(int row, int col){
        return (gameBoard[row][col] == 0);
    }
    // check for victory
    public boolean checkVictory(){
        // diagonal top right to bottom left
        if(gameBoard[0][0] > 0){
            if((gameBoard[0][0] == gameBoard[1][1]) &&
               (gameBoard[1][1] == gameBoard[2][2])){
                setWinner(gameBoard[0][0]);
                return true;
            }
        }
        // diagonal top left to bottom right
        if(gameBoard[0][2] > 0){
            if((gameBoard[0][2] == gameBoard[1][1]) &&
               (gameBoard[1][1] == gameBoard[2][0])){
                setWinner(gameBoard[0][2]);
                return true;
            }
        }
        // rows
        for(int row=0; row<GRID_ROWS; row++){
            if(gameBoard[row][0] > 0){
                if((gameBoard[row][0] == gameBoard[row][1]) &&
                   (gameBoard[row][1] == gameBoard[row][2])){
                    setWinner(gameBoard[row][0]);
                    return true;
                }
            }
        }
        // columns
        for(int col=0; col<GRID_COLS; col++){
            if(gameBoard[0][col] > 0){
                if((gameBoard[0][col] == gameBoard[1][col]) &&
                   (gameBoard[1][col] == gameBoard[2][col])){
                    setWinner(gameBoard[0][col]);
                    return true;
                }
            }
        }
        return false;
    }
    // check for draw
    public boolean checkDraw(){
        // no winner so check for draw
        // if any coord is blank (0) then moves still available.
        for(int row=0; row<GRID_ROWS; row++){
            for(int col=0; col<GRID_COLS; col++){
                if(gameBoard[row][col] == 0)
                    return false;
            }
        }
        return true;
    }
    // reset game board
    public void reset(){
        for(int[] row : gameBoard)
            Arrays.fill(row, 0);

        setWinner(0);
    }
}
