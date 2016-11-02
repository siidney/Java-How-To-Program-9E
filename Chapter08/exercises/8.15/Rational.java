/*
 *       Filename:  Rational.java
 *
 *    Description:  Exercise 8.15 - Rational Numbers
 *
 *        Created:  30/10/15 14:49:37
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Rational{
    private int numerator = 0;
    private int denominator = 0;

    // constructor
    public Rational(int num, int den){
        reduceFraction(num, den);
    }
    // GETTERS
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    // store the fraction in reduced form
    private void reduceFraction(int num, int den){
        int greatestDivisor = gcd(num, den);

        numerator = num / greatestDivisor;
        denominator = den / greatestDivisor;
    }
    // Greatest Common Divisor - Euclid
    private int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }
    // add two rational numbers
    // ensure denominators are equal and add numerators
    // constructor simplifies fraction
    public static Rational add(Rational r1, Rational r2){
        return new Rational(((r1.getNumerator() * r2.getDenominator()) +
                             (r2.getNumerator() * r1.getDenominator())),
                             (r1.getDenominator() * r2.getDenominator()));
    }
    // subtract two r numbers
    // ensure denominators are equal and subtract numerators
    // constructor simplifies fraction
    public static Rational subtract(Rational r1, Rational r2){
        return new Rational(((r1.getNumerator() * r2.getDenominator()) -
                             (r2.getNumerator() * r1.getDenominator())),
                             (r1.getDenominator() * r2.getDenominator()));
    }
    // multiply two r numbers
    // multiply numerator and denominator
    // constructor simplifies
    public static Rational multiply(Rational r1, Rational r2){
        return new Rational((r1.getNumerator() * r2.getNumerator()),
                            (r2.getNumerator() * r2.getDenominator()));
    }
    // divide two r numbers
    // turn r2 upside down
    // multiply r1 by r2
    // constructor simplifies
    public static Rational divide(Rational r1, Rational r2){
        if(r1.getDenominator() == 0 || r2.getDenominator() == 0)
            throw new IllegalArgumentException("divide by zero error");

        return new Rational((r1.getNumerator() * r2.getDenominator()),
                            (r1.getDenominator() * r2.getNumerator()));
    }
    // String representation
    public String toString(){
        return String.format("%d/%d", numerator, denominator);
    }
    // double String representation
    public String toDoubleString(){
        return String.format("%.2f", (double)numerator / denominator);
    }
}
