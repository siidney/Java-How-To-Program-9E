/*
 *       Filename:  GasMileage.java
 *
 *    Description:  Exercise 4.17 - Gas Mileage
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
