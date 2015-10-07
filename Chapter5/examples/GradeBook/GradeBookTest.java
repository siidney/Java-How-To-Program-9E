/*
 *       Filename:  GradeBookTest.java
 *
 *    Description:  5.10 - Create gradebook object, input grades and display
 *                  grades report.
 *
 *        Created:  06/10/15 15:06:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GradeBookTest{
    public static void main(String[] args){
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming.");

        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}
