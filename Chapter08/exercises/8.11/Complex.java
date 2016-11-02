/*
 *       Filename:  Complex.java
 *
 *    Description:  Exercise 8.11 - Complex Numbers
 *
 *        Created:  28/10/15 19:30:18
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Complex{
    private double realPart = 0;
    private double imaginaryPart = 0;

    // default constructor
    public Complex(){
        setRealPart(1);
        setImaginaryPart(1);
    }
    // overloaded constructor
    public Complex(double realPart, double imaginaryPart){
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }
    // SETTERS
    public void setRealPart(double realPart){
        this.realPart = realPart;
    }
    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }
    // GETTERS
    public double getRealPart(){
        return this.realPart;
    }
    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    // add complex numbers
    // returning new complex number
    public static Complex addComplexNumbers(Complex num1, Complex num2){
        return new Complex((num1.getRealPart() + num2.getRealPart()),
                           (num2.getImaginaryPart() + num2.getImaginaryPart()));
    }
    // subtract complex numbers
    // return new complex number
    public static Complex subtractComplexNumbers(Complex num1, Complex num2){
        return new Complex((num1.getRealPart() - num2.getRealPart()),
                           (num1.getImaginaryPart() - num2.getImaginaryPart()));
    }
    // convert to string
    public String toString(){
        return String.format("(%.2f, %.2f)", getRealPart(), getImaginaryPart());
    }
}
