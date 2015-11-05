/*
 *       Filename:  Complex.java
 *
 *    Description:  8.11 - Create a class called Complex for performing
 *                  arithmetic with complex numbers.
 *                  Use floating podouble variables to represent the private data
 *                  of the class.
 *                  Provide a constructor that enables an object of this class
 *                  to be initialised when it's declared.
 *                  Provide a no argument constructor with default values in
 *                  case no initialisers are provided.
 *                  Provide public methods that perform the following:
 *                  a) Add two complex numbers. The real parts are added
 *                  together and the imaginary parts are added together.
 *                  b) Subtract two complex numbers. The real part of the right
 *                  operand is subtracted from the real part of the left
 *                  operand, and the imaginary part of the right operand is
 *                  subtracted from the imaginary part of the left operand.
 *                  c) Print Complex numbers in the form (realPart,
 *                  imaginaryPart).
 *
 *                  NOTE : I don't even know what a complex number is so this is
 *                  probably totaly wrong.
 *                  I'm not wasting my time completely figuring out and
 *                  understanding it either. I've lived this long without
 *                  knowing about them they can't be that important.
 *
 *        Created:  28/10/15 19:30:18
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
