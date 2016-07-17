/*
 *       Filename:  CAIProblemVarying.java
 *
 *    Description:  6.39 - Modify 6.38 to allow the user to pick a type of
 *                  arithmetic problem to study.
 *                  1. addition
 *                  2. subtraction
 *                  3. multiplication
 *                  4. division
 *                  5. random selection of all types
 *
 *                  TODO : Change division to floating point. At present it is
 *                  integer division and weird.
 *
 *        Created:  15/10/15 00:12:20
 *       Revision:  15/10/15 16:43:19
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class CAIProblemVarying{
    private Random randomGenerator = new Random();
    private Scanner sc = new Scanner(System.in);

    private ArrayList<String> success = new ArrayList<String>();
    private ArrayList<String> failure = new ArrayList<String>();

    private int[] values = new int[2];
    private int results = 0;
    private int level = 1;
    private int operationMenu = 1;  // operation menu choice
    private char operation = '+';      // the actual operation

    private String border = "\n*************";

    // constructor
    public CAIProblemVarying(){
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
        int count = 0;
        // intiailisation
        printLevelMenu();
        printOperationSelection();

        // loop to ensure sample size of 10
        while(count != 10){
            getQuestion();
            printSuccessFailure(checkAnswer(sc.nextLong()));

            ++count;
        }

        // output
        getResults();

    }
    // prints the level select menu and verify input
    private void printLevelMenu(){
        System.out.println(border);
        System.out.println("1. Level 1");
        System.out.println("2. Level 2");
        System.out.println("3. Level 3");
        System.out.println("4. Level Expert");
        System.out.println("5. Level insane");
        System.out.println(border);
        System.out.print("> ");

        setLevel(sc.nextInt());

        // ensure choice is within range
        if(level < 1 || level > 5)
            printLevelMenu();
    }
    // print the operation selection menu and verify input
    private void printOperationSelection(){
        System.out.println(border);
        System.out.printf("Level %d arithemtic operation selection\n", level);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Bravery - A combination of the above");
        System.out.println(border);
        System.out.print("> ");

        setOperationMenu(sc.nextInt());

        // ensure choice is within range
        if(operationMenu < 1 || operationMenu > 5)
            printOperationSelection();

    }
    // SETTERS
    // sets and stores 2 random digits (the question)
    // sets the mathematical operator
    private void setQuestion(){
        int[] levels = {9, 99, 999, 9999, 99999};

        values[0] = randomGenerator.nextInt(levels[level - 1]);
        values[1] = randomGenerator.nextInt(levels[level - 1]);

        setOperation();
    }
    // set question level
    private void setLevel(int level){
        this.level = level;
    }
    // set mathematical operation menu choice
    private void setOperationMenu(int operationMenu){
        this.operationMenu = operationMenu;
    }
    // set actual operation based off of the menu choice
    private void setOperation(){
        char[] mathOps = {'+', '-', '*', '/'};

        if(operationMenu == 5)
            operation = mathOps[randomGenerator.nextInt(4)];
        else
            operation = mathOps[operationMenu - 1];

        // prevent divide by zero errors
        // have to reset the values to prevent circular problem
        // of operation being '/'
        if((values[0] == 0 || values[1] == 0) && operation == '/')
            setQuestion();
    }
    // GETTERS
    // ask the question at the appropriate level
    public void getQuestion(){
        // ensure question is set
        if(values[0] == 0 && values[1] == 0)
            setQuestion();

        System.out.printf("How much is %d %c %d? ", values[0], operation, values[1]);
    }
    // calculate final results
    public void getResults(){
        System.out.printf("\nYou scored %d out of 10.\n", results);

        if(results >= (10 * 0.75)){
            System.out.println("\nCongratulations you are ready to go the next level!");
        }else{
            System.out.println("\nPlease ask your teacher for extra help.");
        }
    }
    // checks the answer, prints appropriate response and either reiterates or
    // resets the question
    public boolean checkAnswer(long answer){
        switch(operation){
            case '+':
                return (answer == values[0] + values[1]);
            case '-':
                return (answer == values[0] - values[1]);
            case '*':
                return (answer == values[0] * values[1]);
            case '/':
                return (answer == values[0] / values[1]);
            default:
                return false;
        }
    }
    // prints a random success or failure message
    private void printSuccessFailure(boolean result){
        if(result){
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
        values[0] = 0;
        values[1] = 0;
    }
}
