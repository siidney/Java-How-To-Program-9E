/*
 *       Filename:  MedthodOverload.java
 *
 *    Description:  6.10 - Overloaded method declarations
 *
 *        Created:  09/10/15 23:26:46
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class MedthodOverload{
    public static void main(String[] args){
        System.out.printf("Square of integer 7 is %d\n", square(7));
        System.out.printf("Square of double 7.5 is %f\n", square(7.5f));
    }
    // square method with int arguments
    public static int square(int intValue){
        System.out.printf("\nCalled square with int argument: %d\n",
                intValue);
        return intValue * intValue;
    }
    // square method with double argument
    public static double square(double doubleValue){
        System.out.printf("\nCalled sqaure with double argument: %f\n",
                doubleValue);

        return doubleValue * doubleValue;
    }
}
