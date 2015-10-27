/*
 *       Filename:  StaticImportTest.java
 *
 *    Description:  8.14 - Static import of Math class methods
 *
 *        Created:  26/10/15 17:09:30
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import static java.lang.Math.*;

public class StaticImportTest{
    public static void main(String[] args){
        System.out.printf("sqrt(900.0) = %.1f\n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f\n", ceil(-9.8));
        System.out.printf("E = %f\n", E);
        System.out.printf("PI = %f\n", PI);
    }
}
