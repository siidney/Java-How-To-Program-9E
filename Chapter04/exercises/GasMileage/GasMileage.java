/*
 *       Filename:  GasMileage.java
 *
 *    Description:  4.17 - Develop a java application that will input the miles
 *                  driven and gallons used (both as ints) for each trip.
 *                  The program should:
 *                  Calculate and display the miles per gallon obtained for
 *                  each trip.
 *                  Print the combined miles per gallong for all trips up to
 *                  this point.
 *
 *        Created:  30/09/15 17:33:32
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class GasMileage{
    double totalMiles, totalGallons;

    public double getTripMPG(int miles, int gallons){
        totalMiles += miles;
        totalGallons += gallons;

        return miles / (double)gallons;
    }
    public double getTotalMiles(){
        return totalMiles;
    }
    public double getTotalGallons(){
        return totalGallons;
    }
    public double getTotalMPG(){
        return totalMiles / totalGallons;
    }
}
