/*
 *       Filename:  CAIReducingStudentFatigue.java
 *
 *    Description:  Exercise 6.36 - Computer-Assisted Instruction: Reducing
 *                  Student Fatigue
 *
 *        Created:  15/10/15 00:12:20
 *       Revision:  15/10/15 00:21:26
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class CAIReducingStudentFatigue{
    private static Random randomGenerator = new Random();
    private static ArrayList<String> success = new ArrayList<String>();
    private static ArrayList<String> failure = new ArrayList<String>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[2];
        char cont = 'y';

        success.add("Very Good!");
        success.add("Excellent!");
        success.add("You go girlfriend!!");
        success.add("Nice Work!");
        success.add("Keep up the good work!");

        failure.add("No. Please try again.");
        failure.add("Wrong. Try once more.");
        failure.add("Oh well, we can't all be clever.");
        failure.add("Don't give up.");
        failure.add("No. Keep trying.");

        while(cont == 'y'){
            digits = newQuestion();

            while(true){
                System.out.printf("How much is %d times %d? ", digits[0], digits[1]);

                if(checkAnswer(digits[0], digits[1], sc.nextInt())){
                    printResponse("success");
                    break;
                }else{
                    printResponse("failure");
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
    // randomly chooses responses and prints from the ArrayList
    // ideally wouldn't use switch would just do in main loop but the
    // specification as for it.
    public static void printResponse(String condition){
        switch(condition){
            case "success":
                System.out.println(success.get(randomGenerator.nextInt(success.size())));
                break;
            case "failure":
                System.out.println(failure.get(randomGenerator.nextInt(failure.size())));
                break;
            default:
                break;
        }
    }
}
