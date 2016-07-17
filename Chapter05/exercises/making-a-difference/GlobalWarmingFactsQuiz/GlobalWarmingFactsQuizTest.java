/*
 *       Filename:  GlobalWarmingFactsQuizTest.java
 *
 *    Description:  5.30 - Test application
 *
 *        Created:  08/10/15 17:28:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GlobalWarmingFactsQuizTest{
    public static void main(String[] args){
        GlobalWarmingFactsQuiz glfq = new GlobalWarmingFactsQuiz();

        glfq.startQuiz();

        System.out.printf("You scored %d/5", glfq.getScore());

        switch(glfq.getScore()){
            case 5:
                System.out.println("\nExcellent\n");
                break;
            case 4:
                System.out.println("\nVery good\n");
                break;
            default:
                System.out.println("\nTime to brush up on your knowledge of global warming\n");
                System.out.println("You should visit: http://lmgtfy.com/?q=global+warming\n");
                break;
        }
    }
}
