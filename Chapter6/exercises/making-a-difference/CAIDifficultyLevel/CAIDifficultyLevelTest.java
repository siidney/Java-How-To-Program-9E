/*
 *       Filename:  CAIDifficultyLevelTest.java
 *
 *    Description:  6.38 test application
 *
 *        Created:  15/10/15 00:38:44
 *       Revision:  15/10/15 16:43:38
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CAIDifficultyLevelTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CAIDifficultyLevel cai = new CAIDifficultyLevel();

        int[] digits = new int[2];
        int count = 0;
        char cont = 'y';

        while(cont == 'y'){

            cai.run();


            // inner loop to ensure a sample size of 10
            while(count != 10){
                cai.getQuestion();
                cai.checkAnswer(sc.nextLong());

                ++count;
            }
            cai.getResults();

            System.out.print("Continue? (y/n) ");
            cont = sc.next().charAt(0);

            if(cont == 'y')
                count = 0;
                cai.reset();
        }
    }
}
