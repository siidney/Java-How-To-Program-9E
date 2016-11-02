/*
 *       Filename:  ValueOfPi.java
 *
 *    Description:  Exercise 5.20 - Calculating the Value of PI
 *
 *        Created:  07/10/15 23:01:24
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ValueOfPi{
    private static final long TERMS = 400000;

    public static void main(String[] args){
        double infiniteSeries = 0.0f;
        boolean sign = true;
        long count = 0;

        for(int i=1; i<=TERMS; i+=2){
            // only compute odd numbers
            if(i % 2 == 0)
                continue;

            // check if addition or subtraction
            if(sign)
                infiniteSeries += (4.0 / (double)i);
            else
                infiniteSeries -= (4.0 / (double)i);

            System.out.printf("%d. i = %d, infiniteSeries = %f\n", ++count, i, infiniteSeries);

            // reverse the sign
            sign = !sign;
        }

        System.out.printf("PI calculated from the infinite series 20,000 times: %f\n",
                infiniteSeries);
    }
}
