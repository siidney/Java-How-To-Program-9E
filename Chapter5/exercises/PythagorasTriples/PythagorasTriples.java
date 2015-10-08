/*
 *       Filename:  PythagorasTriples.java
 *
 *    Description:  5.21 - Write an application that displays a table of the
 *                  Pythagorean triples for side1, side2 and the hypotenuse,
 *                  all no larger than 500.
 *                  Use a triple nested for loop that tries all possibilities.
 *
 *                  The three sides must satisfy the relationship that the sum
 *                  of the squares of two of the sides is equal to the square of
 *                  the hypotenuse.
 *
 *        Created:  07/10/15 23:48:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PythagorasTriples{
    public static void main(String[] args){
        int a = 0, b = 0, h = 0;

        System.out.println("Side A\t\tSide B\t\tHypotenuse");

        // loop through A
        // reset B and H after their loops terminate to ensure they do not
        // exceed 500
        for(int i=0; i<500; i++){
            checkHypotenuse(++a, b, h);
            for(int j=0; j<500; j++){
                checkHypotenuse(a, ++b, h);
                for(int k=0; k<500; k++){
                    checkHypotenuse(a, b, ++h);
                }
                h = 0;
            }
            b = 0;
        }
    }
    // check pythagorean theorem
    public static void checkHypotenuse(int a, int b, int h){
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(h, 2))
            printTriple(a, b, h);
    }
    // print pythagorean triple
    public static void printTriple(int a, int b, int h){
        System.out.printf("%d\t\t%d\t\t%d\n", a, b, h);
    }
}
