/*
 *       Filename:  ValueOfPi.java
 *
 *    Description:  5.20 - Calculate the value of PI from the infinite series:
 *                  PI = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 *
 *                  Print a table which shows the value of PI approximated by
 *                  computing the first 200,000 terms of this series.
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
