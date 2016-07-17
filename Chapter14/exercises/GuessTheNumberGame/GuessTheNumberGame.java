/*
 *       Filename:  GuessTheNumberGame.java
 *
 *    Description:  14.14 - Write an application that player "guess the number"
 *                  as follows:
 *                  Your application chooses the number to be guessed by
 *                  selecting an integer at random in the range 1-1000.
 *                  The application then displays the following in a label:
 *                  "I have a number between 1 and 1000. Can you guess my
 *                  number?
 *                  Please enter your first guess"
 *                  A JTextfield should be used to input the guess. As each
 *                  guess is input, the background colour should change to
 *                  either red or blue.
 *                  Red indicates that the user is getting "warmer", and blue,
 *                  "colder".
 *                  A JLabel should display either "Too High" or "Too Low" to
 *                  help the user zero in.
 *                  When the user gets the correct answer, "Correct!" should be
 *                  displayed and the JTextField used for input should be
 *                  changed to be uneditable.
 *                  A JButton should be provided to allow the user to play the
 *                  game again.
 *                  When the JButton is clicked, a new random number should be
 *                  generated and the input JTextfield changed to be editable.
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
