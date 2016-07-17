/*
 *       Filename:  CarPoolSavingsCalc.java
 *
 *    Description:  2.35 - Create an application that calculates your daily
 *                  driving cost, so that you can estimate how much money could
 *                  be saved by car pooling, which also has other advantages
 *                  such as reduced cabon emissions and reducing traffic
 *                  congestion.
 *
 *                  The application should input the following information and
 *                  display the user's cost per day of driving to work:
 *                  a) Total miles driven per day
 *                  b) Cost per gallon of gasoline
 *                  c) Average miles per gallon
 *                  d) Parking fees per day
 *                  e) Tolls per day
 *
 *        Created:  05/10/15 16:47:20
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CarPoolSavingsCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double milesPerDay, costPerGallon, milesPerGallon;
        double parkingFees, tollsPerDay, dailyDrivingCost;

        milesPerDay = requestInput("Enter total miles driven per day: ", sc);
        costPerGallon = requestInput("Enter cost per gallon for gasoline: ", sc);
        milesPerGallon = requestInput("Enter average miles per gallon: ", sc);
        parkingFees = requestInput("Enter parking fees per day: ", sc);
        tollsPerDay = requestInput("Enter tolls per day: ", sc);

        // calculate daily driving cost
        dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees + tollsPerDay;

        System.out.printf("Daily driving cost = %.2f\n", dailyDrivingCost);
    }
    // space saving in main()
    private static double requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextDouble();
    }
}
