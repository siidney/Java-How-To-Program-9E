/*
 *       Filename:  ParkingCharges.java
 *
 *    Description:  6.8 - Write an application that calculates and displays the
 *                  parking charges for each customer who parked in the garage
 *                  yesterday. You should enter the hours parked for each
 *                  customer.
 *                  The program should display the charge for the current
 *                  customer and should calculate and display the running total
 *                  of yesterday's receipts.
 *                  It should use the method calculateCharges to determine the
 *                  charge for each customer.
 *                  Charges:
 *                      $2.00 minimum up to 3 hours.
 *                      $0.50 per hour or part thereof in excess.
 *                      $10.00 maximum charge for any 24 hour period.
 *                      Assume that no car parks for more than 24 hours.
 *
 *        Created:  11/10/15 19:55:56
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ParkingCharges{
    private static final double BASE_FEE = 2.00;
    private static final double HOURLY_FEE = 0.50;
    private static final double MAX_FEE = 10.00;

    private static double total = 0.0f;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double time = 0.0f;

        do{
            time = requestInput("Enter hours parked (-1 to exit): ", sc);
            if(time > 0)
                System.out.printf("Charges: $%.2f\n", calculateCharges(time));

        }while(time != -1);

        System.out.printf("Total charges for the day: $%.2f\n", total);
    }
    public static double requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextDouble();
    }
    public static double calculateCharges(double time){
        if(time > 3.0){
            // Math.ceil to ensure an increase only for each additional hour
            double fee = BASE_FEE + (HOURLY_FEE * Math.ceil(time - 3.0));

            // return the min of fee and MAX_FEE to ensure daily cost
            // exceed specifiation
            total += Math.min(fee, MAX_FEE);
            return Math.min(fee, MAX_FEE);
        }else{
            total += BASE_FEE;
            return BASE_FEE;
        }
    }
}
