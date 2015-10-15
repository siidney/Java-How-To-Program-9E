/*
 *       Filename:  QualityPoints.java
 *
 *    Description:  6.28 - Write a method 'qualityPoints' that inputs a
 *                  student's average and returns:
 *                  4 if 90-100
 *                  3 if 80-89
 *                  2 if 70-79
 *                  1 if 60-69
 *                  0 if < 60
 *
 *                  Incorporate the method into an application that reads a
 *                  value from the user and displays the result.
 *
 *        Created:  14/10/15 18:16:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class QualityPoints{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter students average (-1 to exit): ");
            int average = sc.nextInt();

            if(average == -1)
                break;

            System.out.printf("%d\n", qualityPoints(average));
        }
    }
    public static int qualityPoints(int average){
        if(average >= 90 && average <= 100)
            return 4;

        if(average >= 80 && average < 89)
            return 3;

        if(average >= 70 && average < 80)
            return 2;

        if(average >= 60 && average < 70)
            return 1;

        return 0;
    }
}
