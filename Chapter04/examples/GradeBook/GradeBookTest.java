/*
 *       Filename:  GradeBookTest.java
 *
 *    Description:  4.7 - Create GradeBook object and calculate average
 *
 *        Created:  29/09/15 16:53:12
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GradeBookTest{
    public static void main(String[] args){
        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");

        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}
