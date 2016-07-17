/*
 *       Filename:  CrapsModified.java
 *
 *    Description:  6.33 - Modify 6.8 to allow wagering.
 *                  Initialise the variable 'bankBalance' to 1k
 *                  Prompt the player to enter a wager.
 *                  Check that wager <= bankBalance. If not have the user
 *                  reenter the wager.
 *                  Run the game.
 *                  If player wins, bankBalance += wager.
 *                  If player loses, bankBalance -= wager.
 *                  Display the bankBalance.
 *                  If balance == 0 display the message "Sorry, you busted!"
 *                  As the game progresses, display various messages to create
 *                  some "chatter":
 *                      "Oh, you're going for broke, huh?"
 *                      "Aw c'mon, take a chance!"
 *                      "You're up big. Now's the time to cash in your chips!"
 *                  Implement the 'chatter' as a separate function that randomly
 *                  chooses the string to display.
 *
 *                  NOTE : I don't understand this game and the original Craps
 *                  example program  wasn't layed out in the best way so this
 *                  is a mess.
 *
 *        Created:  09/10/15 22:12:19
 *       Revision:  14/10/15 21:00:49
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;

public class CrapsModified{
    private static final Random randomNumbers = new Random();
    private static Scanner sc = new Scanner(System.in);

    private enum Status{PLAY, CONTINUE, WON, LOST, EXIT};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    private static int bankBalance = 1000;

    public static void main(String[] args){

        Status gameStatus = Status.PLAY;

        int myPoint = 0;
        int wager = 0;

        // game loop
        while(gameStatus != Status.EXIT){

            if(gameStatus != Status.CONTINUE){
                wager = getWager();
                chatter();
            }

            int sumOfDice = rollDice();

            switch(sumOfDice){
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    bankBalance += wager;
                    System.out.printf("\nPlayer %s $%d\n", gameStatus, wager);
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    System.out.printf("\nPlayer %s $%d\n", gameStatus, wager);
                    bankBalance -= wager;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d\n", myPoint);
                    break;
            }

            if(bankBalance <= 0)
                gameStatus = Status.EXIT;
        }
    }
    public static int getWager(){
        while(true){
            System.out.printf("Enter a wager (balance: %d): ", bankBalance);
            int wager = sc.nextInt();

            if(wager <= bankBalance){
                return wager;
            }
        }
    }
    public static void chatter(){
        switch(randomNumbers.nextInt(3)){
            case 0:
                System.out.println("\nOh, you're going for broke, huh?\n");
                break;
            case 1:
                System.out.println("\nAw c'mon, take a chance!\n");
                break;
            case 2:
                System.out.println("\nYou're up big. Now's the time to cash in your chips!\n");
                break;
        }
    }
    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d\n",
                die1, die2, sum);

        return sum;
    }
}
