/*
 *       Filename:  GasMileageTest.java
 *
 *    Description:  4.17 - GasMileageTest
 *
 *        Created:  01/10/15 16:41:48
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class GasMileageTest{
    public static void main(String[] args){
        int miles, gallons;
        char cont = 'y';

        Scanner sc = new Scanner(System.in);
        GasMileage mileage = new GasMileage();

        while(cont != 'n'){

            System.out.println("\n*********************\n");
            System.out.print("Enter Gas Mileage for this trip: ");
            miles = sc.nextInt();
            System.out.print("Enter Gallons used for this trip: ");
            gallons = sc.nextInt();

            System.out.printf("Your MPG for this trip is: %.2f\n",
                    mileage.getTripMPG(miles, gallons));

            System.out.print("Add another trip? (y/n): ");
            cont = sc.next().charAt(0);

        }

        System.out.println("\n*********************\n");
        System.out.println("COMBINED TOTAL MPG");
        System.out.printf("Combined mileage: %.2f\nCombined gallon useage: %.2f\n",
                mileage.getTotalMiles(), mileage.getTotalGallons());
        System.out.printf("Your combined MPG for all trips is: %.2f\n", mileage.getTotalMPG());
    }
}
