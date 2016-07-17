/*
 *       Filename:  TemperatureConversion.java
 *
 *    Description:  14.12 - Write a temperature conversion application that
 *                  converts from Farenheit to Celsius. The Fahrenheit
 *                  temperature should be used to display the converted
 *                  temperature. Use the following formula for the conversion:
 *                  Celsius = 5/9 x (fahrenheit - 32)
 *
 *        Created:  23/01/16 21:54:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TemperatureConversion{

    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit - 32) * 5)/9;
    }

}
