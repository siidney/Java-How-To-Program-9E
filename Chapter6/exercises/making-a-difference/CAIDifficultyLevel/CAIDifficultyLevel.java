/*
 *       Filename:  CAIDifficultyLevel.java
 *
 *    Description:  6.38 - Modify 6.35-37 to allow the user to enter a
 *                  difficulty level.
 *                  Level 1 - single digit ints
 *                  Level 2 - double digit ints
 *                  Level 3 - triple digit ints
 *                  Levels 4+ - Craziness not even worth thinking about.
 *
 *        Created:  15/10/15 00:12:20
 *       Revision:  15/10/15 16:43:19
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class CAIDifficultyLevel{
    private Random randomGenerator = new Random();
    private Scanner sc = new Scanner(System.in);

    private ArrayList<String> success = new ArrayList<String>();
    private ArrayList<String> failure = new ArrayList<String>();

    private Integer[] values = new Integer[2];
    private int results = 0;
    private int level = 1;

    // constructor
    public CAIDifficultyLevel(){
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

    }
    // runs the application
    public void run(){
        printLevelMenu();
    }
    // prints the level select menu and verify input
    private void printLevelMenu(){
        System.out.println("\n*************");
        System.out.println("1. Level 1");
        System.out.println("2. Level 2");
        System.out.println("3. Level 3");
        System.out.println("4. Level Expert");
        System.out.println("5. Level insane");
        System.out.println("\n*************");
        System.out.print("> ");

        setLevel(sc.nextInt());

        // ensure choice is within range
        if(level < 1 || level > 5)
            printLevelMenu();
    }
    // SETTERS
    // sets and stores 2 random digits (the question)
    private void setQuestion(){
        int[] levels = {9, 99, 999, 9999, 99999};

        values[0] = randomGenerator.nextInt(levels[level - 1]);
        values[1] = randomGenerator.nextInt(levels[level - 1]);
    }
    public void setLevel(int level){
        this.level = level;
    }
    // GETTERS
    public void getQuestion(){
        // if no question set
        if(values[0] == null)
            setQuestion();

        System.out.printf("How much is %d times %d? ", values[0], values[1]);
    }
    public void getResults(){
        System.out.printf("\nYou scored %d out of 10.\n", results);

        if(results >= (10 * 0.75)){
            System.out.println("\nCongratulations you are ready to go the next level!");
        }else{
            System.out.println("\nPlease ask your teacher for extra help.");
        }
    }
    // Resets the question params and prints the new question
    public void newQuestion(){
        setQuestion();
        getQuestion();
    }
    // checks the answer, prints appropriate response and either reiterates or
    // resets the question
    public void checkAnswer(long answer){
        if(answer == values[0] * values[1]){
            System.out.println(success.get(randomGenerator.nextInt(success.size())));
            setQuestion();
            ++results;
        }else{
            System.out.println(failure.get(randomGenerator.nextInt(failure.size())));
        }
    }
    // resets the count and starts a new round
    public void reset(){
        results = 0;
        values = null;
    }
}
