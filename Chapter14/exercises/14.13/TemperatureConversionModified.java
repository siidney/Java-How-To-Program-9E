/*
 *       Filename:  TemperatureConversionModified.java
 *
 *    Description:  Exercise 14.13 - Temperature Conversion Modification
 *
 *        Created:  23/01/16 21:54:23
 *       Revision:  24/01/16 17:48:30
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
