/*
 *       Filename:  Computer.java
 *
 *    Description:  Exercise 8.17 - Tic-Tac-Toe
 *                      Represents a computer opponent - derives from Agent
 *
 *        Created:  07/12/15 00:17:56
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Computer extends Agent{
    private int[][] gameBoard;
    private int playerNumber;
    private int rows, cols;

    // CONSTRUCTOR
    public Computer(Board gameBoard, int playerNo){
        super(gameBoard);

        playerNumber = playerNo;
        rows = getBoard().getRows();
        cols = getBoard().getCols();
    }
    // ABSTRACT METHODS
    @Override
    public void move(){
        gameBoard = getBoard().getBoard();
        calculateMove();
    }
    // calculate computer move
    // TODO : Complete offensive moves - so far only occupies first empty space
    // if not occupying center square.
    private void calculateMove(){
        // check for empty center square
        if(isEmpty(1, 1)){
            getBoard().movePlayer(1, 1, playerNumber);
            return;
        }

        // defensive moves first
        if(defensiveMoves())
            return;

        System.out.println("No defensive");

        // offensive moves
        if(offensiveMoves())
            return;

        System.out.println("No offensive");

        // just fill up first empty square
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(isEmpty(row, col)){
                    getBoard().movePlayer(row, col, playerNumber);
                    return;
                }
            }
        }
    }
    // computer defensive moves
    // true if defensive move made
    // false for offensive move needed
    private boolean defensiveMoves(){
        // player occupies center square
        if(!isEmpty(1, 1) && gameBoard[1][1] != playerNumber){
            // check first row and block opposing square on last row
            for(int row = 0; row<rows; row++){
                for(int col=0; col<cols; col++){
                    // ignore center square
                    if(row == 1 && col == 1)
                        continue;

                    if(!isEmpty(row, col) && gameBoard[row][col] != playerNumber){
                        // first row
                        if(row == 0){
                            // top right
                            if(col == 0 && isEmpty(2, 2)){
                                if(getBoard().movePlayer(2, 2, playerNumber))
                                    return true;
                            }
                            // top center
                            if(col == 1 && isEmpty(2, 1)){
                                if(getBoard().movePlayer(2, 1, playerNumber))
                                    return true;
                            }
                            // top left
                            if(col == 2 && isEmpty(2, 0)){
                                if(getBoard().movePlayer(2, 0, playerNumber))
                                    return true;
                            }
                        }
                        // second row
                        if(row == 1){
                            if(col == 0 && isEmpty(1, 2)){
                                if(getBoard().movePlayer(1, 2, playerNumber))
                                    return true;
                            }
                            if(col == 2 && isEmpty(row, 0)){
                                if(getBoard().movePlayer(row, 0, playerNumber))
                                    return true;
                            }
                        }
                        // third row
                        if(row == 2){
                            // bottom right
                            if(col == 0 && isEmpty(0, 2)){
                                if(getBoard().movePlayer(0, 2, playerNumber))
                                    return true;
                            }
                            // center
                            if(col == 1 && isEmpty(0, 1)){
                                if(getBoard().movePlayer(0, 1, playerNumber))
                                    return true;
                            }
                            // bottom left
                            if(col == 2 && isEmpty(0, 0)){
                                if(getBoard().movePlayer(0, 0, playerNumber))
                                    return true;
                            }
                        }
                    }
                }
            }
        }
        // computer occupies center square
        int count = 0;
        // no need to check diagonals as center square not occupied

        // ROWS
        for(int row=0; row<rows; row+=2){
            for(int col=0; col<cols; col++){
                if(!isEmpty(row, col) && gameBoard[row][col] != playerNumber)
                    count++;

                //System.out.println("(" + row + "," + col + ")" + ": " + count);

                if(count == 2 && rowMove(row))
                    return true;
            }
            count = 0;
        }
        // COLS
        for(int col=0; col<cols; col+=2){
            for(int row=0; row<rows; row++){
                if(!isEmpty(row, col) && gameBoard[row][col] != playerNumber)
                    count++;

                //System.out.println("(" + row + "," + col + ")" + ": " + count);

                if(count == 2 && colMove(col))
                    return true;
            }
            count = 0;
        }
        return false;
    }
    // computer offensive moves
    private boolean offensiveMoves(){
        // occupying center square
        // check for win on diagonals/center line

        if(!isEmpty(1, 1) && gameBoard[1][1] == playerNumber){
            // top left <> bottom right
            if((isEmpty(0, 0) || gameBoard[0][0] == playerNumber) &&
               (isEmpty(2, 2) || gameBoard[2][2] == playerNumber)){
                if(getBoard().movePlayer(0, 0, playerNumber) ||
                   getBoard().movePlayer(2, 2, playerNumber)){
                    return true;
                }
            }
            // top right <> bottom left
            if((isEmpty(0, 2) || gameBoard[0][2] == playerNumber) &&
               (isEmpty(2, 0) || gameBoard[2][0] == playerNumber)){
                if(getBoard().movePlayer(0, 2, playerNumber) ||
                   getBoard().movePlayer(2, 0, playerNumber)){
                    return true;
                }
            }
            // middle top <> middle bottom
            if((isEmpty(0, 1) || gameBoard[0][1] == playerNumber) &&
                isEmpty(2, 1) || gameBoard[2][1] == playerNumber){
                if(getBoard().movePlayer(0, 1, playerNumber) ||
                   getBoard().movePlayer(2, 1, playerNumber)){
                    return true;
                }
            }
            // center row <> center row
            if((isEmpty(1, 0) || gameBoard[1][0] == playerNumber) &&
                isEmpty(1, 2) || gameBoard[1][2] == playerNumber){
                if(getBoard().movePlayer(1, 0, playerNumber) ||
                   getBoard().movePlayer(1, 2, playerNumber)){
                    return true;
                }
            }
            // center col <> center col
            if((isEmpty(0, 1) || gameBoard[0][1] == playerNumber) &&
                isEmpty(2, 1) || gameBoard[2][1] == playerNumber){
                if(getBoard().movePlayer(0, 1, playerNumber) ||
                   getBoard().movePlayer(2, 1, playerNumber)){
                    return true;
                }
            }
        }
        // player occupies center
        int count = 0;
        // ROWS
        for(int row=0; row<rows; row+=2){
            for(int col=0; col<cols; col++){
                if(!isEmpty(row, col) && gameBoard[row][col] != playerNumber)
                    count++;

                //System.out.println("(" + row + "," + col + ")" + ": " + count);

                if(count == 2 && rowMove(row))
                    return true;
            }
            count = 0;
        }
        // COLS
        for(int col=0; col<cols; col+=2){
            for(int row=0; row<rows; row++){
                if(!isEmpty(row, col) && gameBoard[row][col] != playerNumber)
                    count++;

                //System.out.println("(" + row + "," + col + ")" + ": " + count);

                if(count == 2 && colMove(col))
                    return true;
            }
            count = 0;
        }

        return false;
    }
    // computer row move
    // check for legal move
    private boolean rowMove(int row){
        // check for win on row
        if(isEmpty(row, 0))
            return getBoard().movePlayer(row, 0, playerNumber);

        if(isEmpty(row, 1))
            return getBoard().movePlayer(row, 1, playerNumber);

        if(isEmpty(row, 2))
            return getBoard().movePlayer(row, 2, playerNumber);

        return false;
    }
    // computer col move
    // check for legal move
    private boolean colMove(int col){
        if(isEmpty(0, col))
            return getBoard().movePlayer(0, col, playerNumber);

        if(isEmpty(1, col))
            return getBoard().movePlayer(1, col, playerNumber);

        if(isEmpty(2, col))
            return getBoard().movePlayer(2, col, playerNumber);

        return false;
    }
    // check if coords available
    private boolean isEmpty(int row, int col){
        return getBoard().isEmpty(row, col);
    }
}
