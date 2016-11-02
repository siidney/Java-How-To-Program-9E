/*
 *       Filename:  RoundingNumbers2.java
 *
 *    Description:  Exercise 6.10 - Rounding Numbers
 *
 *        Created:  11/10/15 21:04:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class RoundingNumbers2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double number = 0.0;

        while(number != -1){
            System.out.print("Enter double value to be rounded (-1 to exit): ");
            number = sc.nextDouble();

            if(number != -1){
                System.out.println("Original number " + number);
                System.out.printf("Nearest Int: %f\n", roundToInteger(number));
                System.out.printf("Tenths: %f\n", roundToTenths(number));
                System.out.printf("Hundredths: %f\n", roundToHundredths(number));
                System.out.printf("Thousandths: %f\n", roundToThousandths(number));
            }
        }
    }
    public static double roundToInteger(double number){
        return Math.floor(number + 0.5);
    }
    public static double roundToTenths(double number){
        return Math.floor(number * 10 + 0.5f) / 10;
    }
    public static double roundToHundredths(double number){
        return Math.floor(number * 100 + 0.5f) / 100;
    }
    public static double roundToThousandths(double number){
        return Math.floor(number * 1000 + 0.5f) / 1000;
    }
}
