/*
 *       Filename:  NegativePositiveZeroValues.java
 *
 *    Description:  2.32 - Wrie a program that inputs five numbers and
 *                  determines and prints the number of negative numbers input,
 *                  the number of positive numbers input and the number of zeros
 *                  input.
 *
 *        Created:  05/10/15 15:48:01
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
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
        for(int i=1; i<6; i++){
            System.out.printf("%d. Enter integer: ", i);
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
        if(x > 0)
            return true;

        return false;
    }
    private static boolean isNegative(int x){
        if(x < 0)
            return true;

        return false;
    }
    private static boolean isZero(int x){
        if(x == 0)
            return true;

        return false;
    }
}
