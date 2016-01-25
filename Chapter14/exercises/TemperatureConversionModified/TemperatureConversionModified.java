/*
 *       Filename:  TemperatureConversionModified.java
 *
 *    Description:  14.13 - Enhance the temperature-conversion application of
 *                  Exercise 14.12 by adding the Kelvin temperature scale. The
 *                  application should allow the user to make conversions
 *                  between any two scales. Use the following formula for the
 *                  conversion between Kelvin and Celsius (in addition to the
 *                  formula in Exercise 14.12):
 *                  Kelvin = Celsius + 273.15
 *
 *        Created:  23/01/16 21:54:23
 *       Revision:  24/01/16 17:48:30
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TemperatureConversionModified{

    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit - 32) * 5)/9;
    }
    public double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

}
