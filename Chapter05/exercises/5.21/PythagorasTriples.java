/*
 *       Filename:  PythagorasTriples.java
 *
 *    Description:  Exercise 5.21 - Pythagorean Triples
 *
 *        Created:  07/10/15 23:48:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
