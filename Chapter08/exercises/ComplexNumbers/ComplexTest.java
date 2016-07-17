/*
 *       Filename:  ComplexTest.java
 *
 *    Description:  8.11 - Test application
 *
 *        Created:  28/10/15 19:35:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ComplexTest{
    public static void main(String[] args){
        Complex cNum1 = new Complex(1.5, 2.0);
        Complex cNum2 = new Complex(5.3, 2.3);
        Complex cNumAddition = Complex.addComplexNumbers(cNum1, cNum2);
        Complex cNumSubtract = Complex.subtractComplexNumbers(cNum1, cNum2);

        System.out.println("Initial values: ");
        System.out.printf("cNum1 : %s\n", cNum1.toString());
        System.out.printf("cNum2 : %s\n", cNum2.toString());

        // addition
        System.out.printf("cNumAddition : %s\n", cNumAddition.toString());

        // subtraction
        System.out.printf("cNumSubtract : %s\n", cNumSubtract.toString());
    }
}
