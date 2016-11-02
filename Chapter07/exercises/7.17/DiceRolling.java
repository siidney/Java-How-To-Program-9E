/*
 *       Filename:  DiceRolling.java
 *
 *    Description:  Exercise 7.17 - Dice Rolling
 *
 *        Created:  19/10/15 15:57:15
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
