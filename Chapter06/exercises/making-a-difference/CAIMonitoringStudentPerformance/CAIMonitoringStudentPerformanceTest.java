/*
 *       Filename:  CAIMonitoringStudentPerformanceTest.java
 *
 *    Description:  6.37 test application
 *
 *        Created:  15/10/15 00:38:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CAIMonitoringStudentPerformanceTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CAIMonitoringStudentPerformance cai = new CAIMonitoringStudentPerformance();

        int[] digits = new int[2];
        int count = 0;
        char cont = 'y';

        while(cont == 'y'){
            // inner loop to ensure a sample size of 10
            while(count != 10){
                cai.getQuestion();
                cai.checkAnswer(sc.nextInt());

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
