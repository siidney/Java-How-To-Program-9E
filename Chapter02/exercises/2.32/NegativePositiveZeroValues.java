/*
 *       Filename:  NegativePositiveZeroValues.java
 *
 *    Description:  Exercise 2.32 - Negative, Positive and Zero Values
 *
 *        Created:  05/10/15 15:48:01
 *       Revision:  01/11/16 17:18:04
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class NegativePositiveZeroValues{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zero = 0;

        // no mention of only using chapter techniques so using a loop for
        // efficiency
        for(int i=0; i<5; i++){
            System.out.printf("%d/5. Enter integer: ", i+1);
            int val = sc.nextInt();

            if(isPositive(val)){
                positive++;
            }else if(isNegative(val)){
                negative++;
            }else if(isZero(val)){
                zero++;
            }
        }

        System.out.printf("Negative = %d\nPositive = %d\nZeros = %d\n",
                negative, positive, zero);
    }
    // determine value of integer
    private static boolean isPositive(int x){
        return x > 0;
    }
    private static boolean isNegative(int x){
        return x < 0;
    }
    private static boolean isZero(int x){
        return x == 0;
    }
}
