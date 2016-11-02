/*
 *       Filename:  GuessTheNumberModified.java
 *
 *    Description:  Exercise 6.31 - Guess the Number Modification
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

public class GuessTheNumberModified{
    private enum Status{PLAY, EXIT, WON};

    private static final Random randomGenerator = new Random();

    private static Status gameStatus = Status.PLAY;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(gameStatus != Status.EXIT){

            playGame();

            System.out.print("Play Again? (y/n): ");

            gameStatus = (sc.next().charAt(0) == 'n') ? Status.EXIT : Status.PLAY;
        }
    }
    public static void playGame(){
        int number = randomGenerator.nextInt(1000);
        int guesses = 0;

        while(gameStatus != Status.WON){

            System.out.print("Guess a number between 1 and 1000: ");
            int guess = sc.nextInt();

            if(guess == number){
                System.out.println("Congratulations. You guessed the number!");

                if(guesses <= 10){
                    System.out.println("Either you  know the secret or you got lucky!");
                }else if(guesses == 10){
                    System.out.println("Aha! You know the secret!");
                }else{
                    System.out.print("You should be able to do better.");
                }
                gameStatus = Status.WON;
            }

            if(guess > number){
                System.out.println("Too high try again...\n");
            }else{
                System.out.println("Too low try again...\n");
            }
            ++guesses;
        }
    }
}
