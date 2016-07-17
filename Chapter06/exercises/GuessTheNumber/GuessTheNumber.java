/*
 *       Filename:  GuessTheNumber.java
 *
 *    Description:  6.30 - Write an application that plays "guess the number" as
 *                  follows:
 *                  Program chooses random number 1-1k.
 *                  Displays the prompt "Guess a numbers between 1 and 1000."
 *                  Player inputs guess.
 *                      Feedback:
 *                      Too high try again
 *                      Too low try again
 *                  Prompt for next guess.
 *                  On correct guess display "Congratulations. You guessed the
 *                  number!".
 *                  Allow the player to play again.
 *
 *        Created:  14/10/15 18:51:56
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber{
    private enum Status{PLAY, EXIT, WON};

    private static final Random randomGenerator = new Random();

    private static Status gameStatus = Status.PLAY;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(gameStatus != Status.EXIT){

            playGame();

            System.out.print("Play Again? (y/n)");

            gameStatus = (sc.next().charAt(0) == 'n') ? Status.EXIT : Status.PLAY;
        }
    }
    public static void playGame(){
        int number = randomGenerator.nextInt(1000);

        while(gameStatus != Status.WON){

            System.out.print("Guess a number between 1 and 1000: ");
            int guess = sc.nextInt();

            if(guess == number){
                System.out.println("Congratulations. You guessed the number!");
                gameStatus = Status.WON;
            }

            if(guess > number){
                System.out.println("Too high try again...\n");
            }else{
                System.out.println("Too low try again...\n");
            }
        }
    }
}
