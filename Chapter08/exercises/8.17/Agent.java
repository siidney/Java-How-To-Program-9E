/*
 *       Filename:  Agent.java
 *
 *    Description:  Exercise 8.17 - Tic-Tac-Toe
 *                      Abstract class represents an agent; player or computer
 *
 *        Created:  07/12/15 00:13:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public abstract class Agent{
    private Board board;

    // CONSTRUCTOR
    public Agent(Board gameBoard){
        board = gameBoard;
    }
    // GETTERS
    public Board getBoard(){
        return this.board;
    }

    // ABSTRACT METHODS
    // place a piece
    abstract public void move();
}
