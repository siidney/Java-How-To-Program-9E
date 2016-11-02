/*
 *       Filename:  GlobalWarmingFactsQuiz.java
 *
 *    Description:  Exercise 5.30 - Global Warming Facts Quiz
 *
 *        Created:  08/10/15 16:59:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;       // user input
import java.util.ArrayList;     // list of questions
import java.util.Random;        // randomly select question

public class GlobalWarmingFactsQuiz{
    private static int NUM_QUESTIONS = 5;

    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> questionList = new ArrayList<String>();
    private ArrayList<ArrayList<String>> answerPool = new ArrayList<ArrayList<String>>();
    private ArrayList<String> answerList = new ArrayList<String>();
    private Random rand = new Random();

    private int[] questionNum = new int[5];
    private int score = 0;

    public GlobalWarmingFactsQuiz(){
        setQuestions();
    }
    // randomly select 5 question from a pool (of 5 to randomise the order)
    private void setQuestions(){
        // populate an integer list with total number of questions
        ArrayList<Integer> list = new ArrayList<Integer>(NUM_QUESTIONS);
        for(int i=1; i<=NUM_QUESTIONS; i++){
            list.add(i);
        }

        int q = 0;
        // randomly pick from the above generated list
        while(list.size() > 0){
            int index = rand.nextInt(list.size());

            // remove from list after selection to prevent duplication
            questionNum[q++] = list.remove(index);
        }

        // TODO Read in Q and A's from a file
        // add questions and answers to respective lists
        for(int i=0; i<questionNum.length; i++){

            switch(questionNum[i]){
                case 1:
                    questionList.add("Question 1");
                    answerPool.add(getAnswers("Answer 1"));
                    break;
                case 2:
                    questionList.add("Question 2");
                    answerPool.add(getAnswers("Answer2"));
                    break;
                case 3:
                    questionList.add("Question 3");
                    answerPool.add(getAnswers("Answer 3"));
                    break;
                case 4:
                    questionList.add("Question 4");
                    answerPool.add(getAnswers("Answer 4"));
                    break;
                case 5:
                    questionList.add("Question 5");
                    answerPool.add(getAnswers("Answer 5"));
                    break;
                default:
                    break;
            }
        }
    }
    // create arraylist of random order answers for each question
    // TODO create more answers and randomly choose 4 to add to answer pool with
    // correct one
    private ArrayList<String> getAnswers(String correct){
        ArrayList<String> tempList = new ArrayList<String>();
        ArrayList<String> returnList = new ArrayList<String>();

        // populate answer list with only correct answers (in order)
        answerList.add(correct);

        // add correct answer to pool of answers
        tempList.add(correct);
        tempList.add("wrong");
        tempList.add("not this one");
        tempList.add("nope");
        tempList.add("maybe this one");

        // randomly pick from the above generated list
        while(tempList.size() > 0){
            int index = rand.nextInt(
                    tempList.size());

            // remove from list after selection to prevent duplication
            returnList.add(tempList.remove(index));
        }
        return returnList;
    }
    // start the quiz
    public void startQuiz(){
        System.out.println("Welcome to the Global Warming quiz.");
        System.out.println("You will be graded on 5 multiple choice questions.\n");

        // question loop
        for(int q=0; q<NUM_QUESTIONS; q++){
            System.out.printf("Question %d: %s\n\n", q+1, questionList.get(q));
            // answer loop
            for(int a=0; a<5; a++){
                System.out.printf("%d: %s\n", a+1, answerPool.get(q).get(a));
            }
            // get user input
            int c = requestInput("\nYour Answer: ");

            //if(isCorrect(i, answerPool.get(i).get(a-1)))
            if(isCorrect(q, c-1, answerPool.get(q).get(c-1))){
                System.out.println("Correct\n");
                score++;
            }else
                System.out.printf("Incorrect\nThe correct answer is: %s\n\n",
                        getAnswer(q));
        }
    }
    // check for correct answer
    private boolean isCorrect(int q, int choice, String a){
        // compare given answer to that in answerList
        return answerPool.get(q).get(choice) == answerList.get(q);
    }
    // get correct answer from answerList
    public String getAnswer(int q){
        return answerList.get(q);
    }
    // get correct answer total
    public int getScore(){
        return score;
    }
    public int requestInput(String s){
        System.out.print(s);
        return sc.nextInt();
    }
}
