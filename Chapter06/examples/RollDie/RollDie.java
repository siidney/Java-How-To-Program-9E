/*
 *       Filename:  RollDie.java
 *
 *    Description:  6.7 - Roll a six sided die 6000000 times
 *
 *        Created:  09/10/15 21:44:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;

public class RollDie{
    public static void main(String[] args){
        Random randomNumbers = new Random();

        // maintain count of faces rolled
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        int face;

        for(int roll=1; roll<=6000000; roll++){
            face = 1 + randomNumbers.nextInt(6);

            switch(face){
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }

        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);
    }
}
