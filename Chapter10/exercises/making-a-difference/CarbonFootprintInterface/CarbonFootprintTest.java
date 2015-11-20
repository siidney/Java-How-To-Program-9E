/*
 *       Filename:  CarbonFootprintTest.java
 *
 *    Description:  10.13 - test application
 *
 *        Created:  19/11/15 15:33:28
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.ArrayList;

public class CarbonFootprintTest{
    public static void main(String[] args){
        ArrayList<CarbonFootprint> cf = new ArrayList<CarbonFootprint>();

        cf.add(new Building());
        cf.add(new Car(Car.FuelUnit.GALLONS, Car.FuelType.PETROL, 20.5f));
        cf.add(new Car(Car.FuelUnit.LITRES, Car.FuelType.DIESEL, 55.0f));
        cf.add(new Car(Car.DistanceUnit.MILES, 10.0f, 10.0f, Car.FuelType.PETROL));
        cf.add(new Car(Car.DistanceUnit.KILOMETRES, 25, 50, Car.FuelType.DIESEL));
        cf.add(new Bicycle(10));

        for(CarbonFootprint footprint : cf){
            System.out.println(footprint.toString());
        }
    }
}
