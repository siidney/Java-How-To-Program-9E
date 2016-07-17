/*
 *       Filename:  VarargsTest.java
 *
 *    Description:  7.20 - Using variable length argument lists
 *
 *        Created:  18/10/15 15:05:45
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class VarargsTest{
    public static double average(double... numbers){
        double total = 0.0;

        // calculate total using enhanced for
        for(double d : numbers)
            total += d;

        return total / numbers.length;
    }
    public static void main(String[] args){
        double d1 = 10.0f;
        double d2 = 20.0d;
        double d3 = 30.0f;
        double d4 = 40.0f;

        System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
                d1, d2, d3, d4);

        System.out.printf("Average of d1 and d2 is %.1f\n",
                average(d1, d2));

        System.out.printf("Average of d1, d2 and d3 is %.1f\n",
                average(d1, d2, d3));

        System.out.printf("Average of d1, d2, d3, and d4 is %.1f\n",
                average(d1, d2, d3, d4));
    }
}
