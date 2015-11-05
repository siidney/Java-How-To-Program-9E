/*
 *       Filename:  TicTacToe.java
 *
 *    Description:  8.17 - Create a class 'TicTacToe' that will enable you to
 *                  write a program to play Tic-Tac-Toe.
 *                  Use a private 3x3 2d array to represent the board.
 *                  Use an enum to represent the value of each array cell.
 *                  X, O, EMPTY.
 *                  The constructor should initialise the board elemets to
 *                  EMPTY.
 *                  Allow two human players.
 *                  Player 1 - X.
 *                  Player 2 - O.
 *                  Each move must be to an empty square.
 *                  After each move determine if there is a winner, or a draw.
 *                  Allow players to specify whether to go first or second.
 *
 *                  NOTE : Also added randomised starting order and basic player
 *                  2 AI in case you have no friends :p
 *                  There also may be a more efficient way of doing things but I
 *                  cba figuring it out today. It works and is good enough for
 *                  now.
 *
 *        Created:  04/11/15 18:14:58
 *       Revision:  05/11/15 01:35:51
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe{
    private final int GRID_ROWS = 3;
    private final int GRID_COLS = 3;
    private enum CellValue{EMPTY, X, O};
    private enum GameStatus{RUNNING, EXIT, WON, DRAW};

    private int[][] gameBoard = new int[GRID_ROWS][GRID_COLS];
    private int players     = 1;        // number of human players
    private int winner      = 0;
    private int playerTurn  = 0;

    Scanner sc = new Scanner(System.in);
    Random randomGenerator = new Random();

    GameStatus gameStatus = GameStatus.RUNNING;

    // constructor
    public TicTacToe(){
        reset();
        // randomise starting player
        playerTurn = 1 + randomGenerator.nextInt(2);
    }
    // SETTERS
    public void setGameStatus(GameStatus gameStatus){
        this.gameStatus = gameStatus;
    }
    // GETTERS
    public GameStatus getGameStatus(){
        return this.gameStatus;
    }
    // play the game
    public void run(){
        printMenu();
        System.out.printf("Player %d starts\n", playerTurn);
        while(gameStatus != GameStatus.EXIT){
            if(gameStatus == GameStatus.RUNNING){
                switch(playerTurn){
                    case 1:
                        player1Move();
                        checkWinCondition();
                        break;
                    case 2:
                        player2Move();
                        checkWinCondition();
                        break;
                    default:
                        break;
                }
            }
        }
    }
    // print main game menu
    // get number of players
    private void printMenu(){
        System.out.println("\nWelcome to TicTacToe\n");
        System.out.println("1. PvC");
        System.out.println("2. PvP");
        System.out.println("0. Exit");
        System.out.print("> ");

        int choice = sc.nextInt();

        if(choice == 0)
            setGameStatus(GameStatus.EXIT);
        else if(choice == 1 || choice == 2)
            players = choice;
        else
            printMenu();
    }
    // print the game board
    private void printBoard(){
        // header
        System.out.printf("%3d%3d%3d\n", 0, 1, 2);

        for(int row=0; row<gameBoard.length; row++){
            System.out.printf("%d", row);
            for(int col=0; col<gameBoard[row].length; col++){
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
    // print the winner
    private void printEndStatus(){
        if(winner > 0)
            System.out.printf("\nCongratulations player %d won!!\n", winner);
        else
            System.out.println("\nGame ended in a draw\n");

        printBoard();
    }
    // check for exit condition
    private void checkWinCondition(){
        // check victory/play again
        setGameStatus(checkStatus());

        if(getGameStatus() == GameStatus.WON || getGameStatus() == GameStatus.DRAW){
            printEndStatus();
            System.out.println("Play Again? (y/n)");
            System.out.print("> ");
            if(sc.next().charAt(0) == 'y'){
                reset();
                run();
            }else{
                setGameStatus(GameStatus.EXIT);
            }
        }
    }
    // player 1 move
    private void player1Move(){
        printBoard();

        System.out.print("Player 1. Enter space separated coordinates: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        if(!movePlayer(row, col, 1))
            player1Move();

        playerTurn = 2;
    }
    // player 2 move
    private void player2Move(){
        // check if human or computer
        if(players == 1){
            calculateMove();
        }else{
            printBoard();
            System.out.print("Player 2. Enter space separated coordinates: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(!movePlayer(row, col, 2))
                player2Move();
        }
        playerTurn = 1;
    }
    // move player
    private boolean movePlayer(int row, int col, int player){
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
    // calculate computer move
    // TODO : Complete offensive moves - so far only occupies first empty space
    // if not occupying center square.
    private void calculateMove(){
        // check for empty center square
        if(gameBoard[1][1] == 0){
            gameBoard[1][1] = 2;
            return;
        }
        // defensive moves first
        if(defensiveMoves())
            return;

        // if no defensive moves
        // check for win on diagonals
        // if not occupying center square move on
        if(gameBoard[1][1] == 2){
            if(((isEmpty(0, 0) || gameBoard[0][0] == 2) &&
                (isEmpty(2, 2) || gameBoard[2][2] == 2))){
                if(isEmpty(0, 0)){
                    gameBoard[0][0] = 2;
                    return;
                }
                if(isEmpty(2, 2)){
                    gameBoard[2][2] = 2;
                    return;
                }
            }
        }
        // just fill up first empty square
        for(int row=0; row<GRID_ROWS; row++){
            for(int col=0; col<GRID_COLS; col++){
                if(isEmpty(row, col)){
                    gameBoard[row][col] = 2;
                    return;
                }
            }
        }
    }
    // computer defensive moves
    // true if defensive move made
    // false for offensive move needed
    private boolean defensiveMoves(){
        // if center belongs to player
        if(gameBoard[1][1] == 1){
            // check first row and block opposing square on last row
            for(int col=0; col<GRID_COLS; col++){
                if(gameBoard[0][col] == 1){
                    // top center
                    if(col == 1 && isEmpty(2, 1)){
                        gameBoard[2][1] = 2;
                        return true;
                    }
                    // corners
                    if(col == 0 && isEmpty(2, 2)){
                        gameBoard[2][2] = 2;
                        return true;
                    }
                    if(col == 2 && isEmpty(2, 0)){
                        gameBoard[2][0] = 2;
                        return true;
                    }
                }
            }
            // check second row
            if(gameBoard[1][0] == 1 && isEmpty(1, 2)){
                gameBoard[1][2] = 2;
                return true;
            }else if(gameBoard[1][2] == 1 && isEmpty(1, 0)){
                gameBoard[1][0] = 2;
                return true;
            }
            // check third row
            for(int col=0; col<GRID_COLS; col++){
                if(gameBoard[0][col] == 1){
                    // bottom center
                    if(col == 1 && isEmpty(0, col)){
                        gameBoard[0][1] = 2;
                        return true;
                    }
                    // corners
                    if(col == 0 && isEmpty(0, 2)){
                        gameBoard[0][2] = 2;
                        return true;
                    }else if(col == 2 && isEmpty(0, 0)){
                        gameBoard[0][0] = 2;
                        return true;
                    }
                }
            }
        }
        int count = 0;
        // check if any 2 squares on any row are occupied by player
        for(int row=0; row<GRID_ROWS; row++){
            for(int col=0; col<GRID_COLS; col++){
                if(gameBoard[row][col] == 1){
                    count++;
                }
                //System.out.printf("row (%d,%d): count %d\n", row, col, count);
                if(count == 2 && rowMove(row)){
                    return true;
                }
            }
            count = 0;
        }
        // check cols
        for(int col=0; col<GRID_COLS; col++){
            for(int row=0; row<GRID_ROWS; row++){
                if(gameBoard[row][col] == 1){
                    count++;
                }
                //System.out.printf("col (%d,%d): count %d\n", row, col, count);
                if(count == 2 && colMove(col)){
                    return true;
                }
            }
            count = 0;
        }
        return false;
    }
    // computer row move
    private boolean rowMove(int row){
        // check for win on row
        if(isEmpty(row, 0)){
            gameBoard[row][0] = 2;
            return true;
        }
        if(isEmpty(row, 1)){
            gameBoard[row][1] = 2;
            return true;
        }
        if(isEmpty(row, 2)){
            gameBoard[row][2] = 2;
            return true;
        }
        return false;
    }
    // computer col move
    private boolean colMove(int col){
        if(isEmpty(0, col)){
            gameBoard[0][col] = 2;
            return true;
        }
        if(isEmpty(1, col)){
            gameBoard[1][col] = 2;
            return true;
        }
        if(isEmpty(2, col)){
            gameBoard[2][col] = 2;
            return true;
        }
        return false;
    }
    // check cell is empty
    private boolean isEmpty(int row, int col){
        return (gameBoard[row][col] == 0);
    }
    // check exit conditions WIN DRAW
    private GameStatus checkStatus(){
        // diagonal top right to bottom left
        if(gameBoard[0][0] > 0){
            if((gameBoard[0][0] == gameBoard[1][1]) &&
               (gameBoard[1][1] == gameBoard[2][2])){
                winner = gameBoard[0][0];
                return GameStatus.WON;
            }
        }
        // diagonal top left to bottom right
        if(gameBoard[0][2] > 0){
            if((gameBoard[0][2] == gameBoard[1][1]) &&
               (gameBoard[1][1] == gameBoard[2][0])){
                winner = gameBoard[0][2];
                return GameStatus.WON;
            }
        }
        // rows
        for(int row=0; row<GRID_ROWS; row++){
            if(gameBoard[row][0] > 0){
                if((gameBoard[row][0] == gameBoard[row][1]) &&
                   (gameBoard[row][1] == gameBoard[row][2])){
                    winner = gameBoard[row][0];
                    return GameStatus.WON;
                }
            }
        }
        // columns
        for(int col=0; col<GRID_COLS; col++){
            if(gameBoard[0][col] > 0){
                if((gameBoard[0][col] == gameBoard[1][col]) &&
                   (gameBoard[1][col] == gameBoard[2][col])){
                    winner = gameBoard[0][col];
                    return GameStatus.WON;
                }
            }
        }
        // no winner so check for draw
        // if any coord is blank (0) then moves still available.
        for(int row=0; row<GRID_ROWS; row++){
            for(int col=0; col<GRID_COLS; col++){
                if(gameBoard[row][col] == 0)
                    return GameStatus.RUNNING;
            }
        }
        return GameStatus.DRAW;
    }
    // reset game
    private void reset(){
        for(int[] row : gameBoard)
            Arrays.fill(row, 0);
        setGameStatus(GameStatus.RUNNING);
        players = 1;
        winner = 0;
    }
}
