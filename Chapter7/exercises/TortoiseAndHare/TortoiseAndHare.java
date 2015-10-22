/*
 *       Filename:  TortoiseAndHare.java
 *
 *    Description:  7.28 - Recreate the classic race of the tortoise and the
 *                  hare. You'll use random number generation to develop a
 *                  simulation of this memorable event.
 *                  Course length of 70.
 *                  Use a variable to keep track of the position of the animals.
 *                  Use fig.7.32 to determine the rules of movement.
 *                  Begin the race by displaying:
 *                      "BANG !!!!!"
 *                      "AND THEY'RE OFF !!!!!"
 *                  For each loop display a 70 position line showing the letter
 *                  "T" for the tortoise and "H" for the hare position.
 *                  If they are on the same square display "OUCH".
 *                  All output positions except the aforementioned should be
 *                  blank.
 *                  After each line is displayed test for victory.
 *                      "TORTOISE WINS !!!!! YAY !!!!!"
 *                      "Hare wins. Yuch."
 *                      "It's a tie"
 *
 *        Created:  20/10/15 15:44:38
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;
import java.util.Arrays;


public class TortoiseAndHare{
    private final Random randomGenerator = new Random();
    private final int COURSE_LENGTH = 70;

    private enum Racers{TORTOISE, HARE};
    private enum GameStatus{RUNNING, EXIT};

    private int[] arrPositions = new int[2];   // [0]tortoise [1]hare

    private GameStatus gameStatus = GameStatus.RUNNING;

    // constructor
    public TortoiseAndHare(){
        reset();
    }
    // SETTERS
    public void setGameStatus(GameStatus gameStatus){
        this.gameStatus = gameStatus;
    }
    // GETTERS
    private GameStatus getGameStatus(){
        return gameStatus;
    }
    // runs the simulation
    public void run(){
        while(gameStatus != GameStatus.EXIT){
            displayProgress();

            // move tortoise
            move(Racers.TORTOISE);

            // move hare
            move(Racers.HARE);

            // check for winners and print victory message
            raceWon();
        }
    }
    // display intial message
    public void printGreeting(){
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!\n");
    }
    // displays the race board with progress indicators
    private void displayProgress(){
        System.out.print("RACE PROGRESS: ");
        for(int i=0; i<=COURSE_LENGTH; i++){
            if(arrPositions[0] == i && arrPositions[1] == i)
                System.out.print("OUCH");
            else if(arrPositions[0] == i)
                System.out.print('T');
            else if(arrPositions[1] == i)
                System.out.print(('H'));
            else
                System.out.print('.');
        }
        System.out.print("\n");
    }
    // moves the racers
    // ensure move doesn't take racer past 0 or over COURSE_LENGTH
    public void move(Racers racer){
        int move = 1 + randomGenerator.nextInt(10);

        switch(racer){
            case TORTOISE:
                // fast plod
                if(move < 5){
                    arrPositions[0] = (arrPositions[0] + 5 >= COURSE_LENGTH) ?
                        COURSE_LENGTH : arrPositions[0] + 5;
                    break;
                }
                // slip
                // out of bounds check
                if(move == 6 || move == 7){
                    arrPositions[0] = (arrPositions[0] <= 6) ?
                        0 : arrPositions[0] - 6;
                    break;
                }
                // slow pod
                if(move >= 8 && move <= 10){
                    arrPositions[0] = (arrPositions[0] + 1 >= COURSE_LENGTH) ?
                        COURSE_LENGTH : arrPositions[0] + 1;
                    break;
                }
            case HARE:
                // sleep
                if(move == 1 || move == 2){
                    break;
                }
                // big hop
                if(move == 3 || move == 4){
                    arrPositions[1] = (arrPositions[1] + 9 >= COURSE_LENGTH) ?
                        COURSE_LENGTH : arrPositions[1] + 9;
                    break;
                }
                // big slip
                // out of bounds check
                if(move == 5){
                    arrPositions[1] = (arrPositions[1] <= 12)
                        ? 0 : arrPositions[1] - 12;
                    break;
                }
                // small hop
                if(move >= 6 && move <= 8){
                    arrPositions[1] = (arrPositions[1] + 1 >= COURSE_LENGTH) ?
                        COURSE_LENGTH : arrPositions[1] + 1;
                    break;
                }
                // small slip
                // out of bounds check
                if(move >= 8 && move <= 10){
                    arrPositions[1] = (arrPositions[1] <= 2) ?
                        0 : arrPositions[1] - 2;
                    break;
                }
            default:
                break;
        }
    }
    // if one, or more racers finish print victory message, display final
    // progress and set exit condition.
    private void raceWon(){
        if(isWinner(Racers.TORTOISE)){
            System.out.print("\nTORTOISE WINS !!!\nYAY !!!\n\nFINAL ");
            displayProgress();
            setGameStatus(GameStatus.EXIT);
        }
        if(isWinner(Racers.HARE)){
            System.out.print("\nHare wins. Yuch.\n\nFINAL ");
            displayProgress();
            setGameStatus(GameStatus.EXIT);
        }
        if(isDraw()){
            System.out.print("\nIt's a Draw.\n\nFINAL ");
            displayProgress();
            setGameStatus(GameStatus.EXIT);
        }
    }
    // checks for winner
    private boolean isWinner(Racers racer){
        switch(racer){
            case TORTOISE:
                return (arrPositions[0] >= COURSE_LENGTH);
            case HARE:
                return (arrPositions[1] >= COURSE_LENGTH);
            default:
                return false;
        }
    }
    // check for a draw
    private boolean isDraw(){
        return (isWinner(Racers.TORTOISE) && isWinner(Racers.HARE));
    }
    // resets race conditions
    private void reset(){
        arrPositions[0] = arrPositions[1] = 0;
    }
}
