/*
 *       Filename:  HypotenuseCalculations.java
 *
 *    Description:  Exercise 6.15 - Hypotenuse Calculation
 *
 *        Created:  14/10/15 14:08:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HypotenuseCalculations{
    public static void main(String[] args){
        // triangle one
        System.out.println("TRIANGLE ONE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                3.0, 4.0, hypotenuse(3.0, 4.0));

        // triangle two
        System.out.println("TRIANGLE TWO");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                5.0, 12.0, hypotenuse(5.0, 12.0));

        // triangle three
        System.out.println("TRIANGLE THREE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                8.0, 15.0, hypotenuse(8.0, 15.0));
    }
    // using pythagoras theorem
    // square two shorter sides
    // add the squares
    // square root both sides for h
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
