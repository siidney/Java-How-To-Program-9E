/*
 *       Filename:  ComputerAssistedInstruction.java
 *
 *    Description:  Exercise 6.35 - Computer-Assisted Instruction
 *
 *        Created:  14/10/15 23:52:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;

public class ComputerAssistedInstruction{
    private static Random randomGenerator = new Random();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[2];
        char cont = 'y';

        while(cont == 'y'){
            digits = newQuestion();

            while(true){
                System.out.printf("How much is %d times %d? ", digits[0], digits[1]);

                if(checkAnswer(digits[0], digits[1], sc.nextInt())){
                    System.out.println("Very good!");
                    break;
                }else{
                    System.out.println("No. Please try again.");
                }
            }
            System.out.print("Continue? (y/n) ");
            cont = sc.next().charAt(0);
        }
    }
    // returns 2 random digits (the question)
    public static int[] newQuestion(){
        int[] tmp = {randomGenerator.nextInt(9), randomGenerator.nextInt(9)};

        return tmp;
    }
    // checks the answer
    public static boolean checkAnswer(int x, int y, int answer){
        return (answer == x * y) ? true : false;
    }
}
