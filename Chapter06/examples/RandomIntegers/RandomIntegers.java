/*
 *       Filename:  RandomIntegers.java
 *
 *    Description:  6.6 - Shifted and scaled random integers
 *
 *        Created:  09/10/15 21:41:30
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;

public class RandomIntegers{
    public static void main(String[] args){
        Random randomNumbers = new Random();

        int face;

        for(int counter=1; counter<=20; counter++){
            face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d  ", face);

            // if counter is divisible by 5, start a new line of output
            if(counter % 5 == 0)
                System.out.println();
        }
    }
}
