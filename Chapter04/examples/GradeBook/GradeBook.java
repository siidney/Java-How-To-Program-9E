/*
 *       Filename:  GradeBook.java
 *
 *    Description:  Fig. 4.9 - GradeBook class to solve class-average problem using
 *                  sentinel controlled repitition.
 *
 *        Created:  29/09/15 16:45:59
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class GradeBook{
    private String courseName;

    // constructor
    public GradeBook(String name){
        courseName = name;
    }

    // setters
    public void setCourseName(String name){
        courseName = name;
    }
    // getters
    public String getCourseName(){
        return courseName;
    }

    // display welcome message to GradeBook user
    public void displayMessage(){
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    }

    // determine class average based on 10 user entered grades
    public void determineClassAverage(){
        Scanner sc = new Scanner(System.in);

        int total, gradeCounter, grade;
        double average;

        total = 0;
        gradeCounter = 0;

        System.out.print("Enter grade 1 or -1 to quit: ");
        grade = sc.nextInt();

        while(grade != -1){
            total += grade;
            gradeCounter++;

            System.out.printf("Enter grade %d or -1 to quit: ", gradeCounter + 1);
            grade = sc.nextInt();
        }

        if(gradeCounter != 0){
            average = (double)total / gradeCounter;
            // display grades average
            System.out.printf("\nTotal of the %d grades: %d\n", gradeCounter, total);
            System.out.printf("Class average: %.2f\n", average);

        }
    }
}
