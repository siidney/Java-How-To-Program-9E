/*
 *       Filename:  DiceRolling.java
 *
 *    Description:  7.17 - Write an application that simulates the rolling of
 *                  two dice.
 *                  The application should use an object of class Random once to
 *                  the roll the first die and again to roll the second die.
 *                  The sum of the two values should then be calculated.
 *                  Each die can show an integer value from 1 to 6, so the sum
 *                  of the values will vary from 2 to 12, with 7 being the most
 *                  frequent sum, and 2 and 12 the least frequent.
 *                  Your application should roll the dice 36000000 times.
 *                  Use a one-dimensional array to tally the number of times
 *                  each possible sum appears.
 *                  Display the results in tabular format.
 *
 *        Created:  19/10/15 15:57:15
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;

public class DiceRolling{
    private static final Random randomGenerator = new Random();
    private static final int NUMBER_OF_ROLLS = 336000000;
    private static int[] totalRolls = new int[11];

    public static void main(String[] args){
        for(int i=0; i<NUMBER_OF_ROLLS; i++){
            // roll 2 die and subtract 2 (avoid extra array elements)
            int total = (rollDie() + rollDie()) - 2;

            ++totalRolls[total];
        }

        System.out.printf("%s%13s\n", "Sum", "total");

        for(int i=0; i<totalRolls.length; i++){
            System.out.printf("%2d%15d\n", i+2, totalRolls[i]);
        }
    }
    public static int rollDie(){
        return 1 + randomGenerator.nextInt(6);
    }
}
