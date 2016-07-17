/*
 *       Filename:  GradeBookTest.java
 *
 *    Description:  3.11 - GradeBook constructor used to specify course name at
 *                  the time each GradeBook object is creation.
 *
 *        Created:  26/09/15 21:54:54
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GradeBookTest{
    public static void main(String[] args){
        // gradebook object
        GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming", "Bob Bobsen");
        GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java", "Jeff Jefferson");

        gradeBook1.displayMessage();
        gradeBook2.displayMessage();
    }
}
