/*
 *       Filename:  GasMileage.java
 *
 *    Description:  4.17 - Calculate and display miles per gallon obtained for
 *                  each type and print combined miles per gallon all trips.
 *
 *        Created:  30/09/15 17:33:32
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
