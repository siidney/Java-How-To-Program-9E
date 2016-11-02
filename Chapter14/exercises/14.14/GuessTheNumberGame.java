/*
 *       Filename:  GuessTheNumberGame.java
 *
 *    Description:  Exercise 14.14 - Guess-the-Number Game
 *
 *        Created:  24/01/16 18:02:20
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;

public class GuessTheNumberGame{
    private static final Random randomGenerator = new Random();
    private int randomNumber;
    private int currGuess;
    private int lastGuess;

    // CONSTRUCTOR
    public GuessTheNumberGame(){
        reset();
    }
    // SETTERS
    public void setRandomNumber(){
        randomNumber = 1 + randomGenerator.nextInt(1000);
    }
    private void setLastGuess(int lg){
        this.lastGuess = lg;
    }
    private void setCurrGuess(int cg){
        this.currGuess = cg;
    }
    // GETTERS
    public int getRandomNumber(){
        return this.randomNumber;
    }
    private int getLastGuess(){
        return this.lastGuess;
    }
    private int getCurrGuess(){
        return this.currGuess;
    }
    // check guess
    public String guess(int g){
        setLastGuess(getCurrGuess());
        setCurrGuess(g);

        if(g == randomNumber)
            return "Correct!";
        else if(g < randomNumber)
            return "Too Low";
        else
            return "Too High";
    }
    // check if current guess is closer or further from the last
    public Boolean isCloser(){
        if((getLastGuess() - getRandomNumber()) > (getCurrGuess() - getRandomNumber()))
            return true;
        else
            return false;
    }
    // reset random number
    public void reset(){
        setRandomNumber();
    }
}
