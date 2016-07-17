/*
 *       Filename:  GradeBook.java
 *
 *    Description:  5.9 - GradeBook class uses switch statements to count letter
 *                  grades
 *
 *        Created:  06/10/15 14:51:03
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
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;

    public GradeBook(String courseName){
        setCourseName(courseName);
    }
    // SETTERS
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    // GETTERS
    public String getCourseName(){
        return courseName;
    }
    // display welcome message
    public void displayMessage(){
        System.out.printf("Welcome to the gradebook for\n%s!\n\n",
                getCourseName());
    }
    // input arbitrary number of grades from the user
    public void inputGrades(){
        Scanner sc = new Scanner(System.in);

        int grade;

        System.out.printf("%s\n%s\n    %s\n    %s\n",
                "Enter the integer grades in the range 0-100",
                "Type the end-of-file indicator to terminate input:",
                "On Unix/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Winblows type <Ctrl> z then press Enter.");

        // loop until user enters EOF indicator
        while(sc.hasNext()){
            grade = sc.nextInt();
            total += grade;
            ++gradeCounter;

            incrementLetterGradeCounter(grade);
        }
    }
    // increment appropriate grade counter
    private void incrementLetterGradeCounter(int grade){
        switch(grade / 10){
            // between 90 - 100
            case 9:
            case 10:
                ++aCount;
                break;
            // between 80 - 89
            case 8:
                ++bCount;
                break;
            // between 70 - 79
            case 7:
                ++cCount;
                break;
            // between 60 - 69
            case 6:
                ++dCount;
                break;
            // less than 60
            default:
                ++fCount;
                break;
        }
    }
    // display report based on entered grades
    public void displayGradeReport(){
        System.out.println("\nGrade Report:");

        if(gradeCounter != 0){
            double average = (double)total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d\n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        }else
            System.out.println("No grades were entered.");
    }
}
