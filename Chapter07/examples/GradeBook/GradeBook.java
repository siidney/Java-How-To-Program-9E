/*
 *       Filename:  GradeBook.java
 *
 *    Description:  7.18 - GradeBook class using a 2d array to store grades
 *
 *        Created:  18/10/15 13:55:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GradeBook{
    private String courseName;
    private int[][] grades;

    // constructor
    public GradeBook(String courseName, int[][] grades){
        setCourseName(courseName);
        this.grades = grades;
    }
    // SETTERS
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    // GETTERS
    public String getCourseName(){
        return courseName;
    }
    // display a welcome message to the gradebook user
    public void displayMessage(){
        System.out.printf("Welcome to the gradebook for \n%s!\n\n",
                getCourseName());
    }
    public void processGrades(){
        outputGrades();

        // get min and max grades
        System.out.printf("Lowest grade is: %d\nHighest grade is: %d\n\n",
                getMinimum(), getMaximum());

        outputBarChart();
    }
    // find minimum grade
    public int getMinimum(){
        int lowGrade = grades[0][0];

        // rows
        for(int[] studentGrades : grades){
            // columns
            for(int grade : studentGrades){
                if(grade < lowGrade)
                    lowGrade = grade;
            }
        }

        return lowGrade;
    }
    // find maximum grade
    public int getMaximum(){
        int highGrade = grades[0][0];

        // row
        for(int[] studentGrades : grades){
            // columns
            for(int grade : studentGrades){
            if(grade > highGrade)
                highGrade = grade;
            }
        }

        return highGrade;
    }
    // get average grade for test
    public double getAverage(int[] setOfGrades){
        int total = 0;

        // sum grades for one student
        for(int grade : setOfGrades)
            total += grade;

        // return average of grades
        return (double) total / setOfGrades.length;
    }
    // output bar chart displaying grade distribution
    public void outputBarChart(){
        System.out.println("Grade distributions: ");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade increment the appropriate frequency
        for(int[] studentGrades : grades){
            for(int grades : studentGrades){
                ++frequency[grades / 10];
            }
        }

        // for each grade frequency, print bar in chart
        for(int count=0; count<frequency.length; count++){
            // output bar label
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);

            // print bar of asterisks
            for(int stars=0; stars<frequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // output the contents of the grades array
    public void outputGrades(){
        System.out.println("The grades are:\n");
        System.out.print("              ");

        // craete a column heading for each of the tests
        for(int test=0; test<grades[0].length; test++){
            System.out.printf("Test %d  ", test + 1);
        }

        System.out.println("Average");

        // create rows/columns of text representing array grades
        for(int student=0; student<grades.length; student++){
            System.out.printf("Student %2d", student + 1);

            // output student grades
            for(int test : grades[student]){
                System.out.printf("%8d", test);
            }

            // call getAverage
            // pass row of grades to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n", average);
        }
    }
}
