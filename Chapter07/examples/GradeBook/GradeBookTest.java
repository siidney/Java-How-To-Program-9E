/*
 *       Filename:  GradeBookTest.java
 *
 *    Description:  7.15 - Creates a GradeBook object using an array of grades,
 *                  then invokes method processGrades() to analyze them.
 *
 *        Created:  18/10/15 14:23:07
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GradeBookTest{
    public static void main(String[] args){
        int[][] gradesArray = {{87, 96, 70},
                               {68, 87, 90},
                               {94, 100, 90},
                               {100, 81, 82},
                               {83, 65, 85},
                               {78, 87, 65},
                               {85, 75, 83},
                               {91, 94, 100},
                               {76, 72, 84},
                               {87, 93, 73}};

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java programming", gradesArray);

        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
