/*
 *       Filename:  DivideByZeroWithExceptionHandling.java
 *
 *    Description:  11.2 - Handling ArithmeticExceptions and
 *                  InputMismatchExceptions
 *
 *        Created:  23/11/15 17:04:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling{
    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator)
        throws ArithmeticException{
        return numerator / denominator;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.print("Please enter an integer numerator: ");
                int numerator = sc.nextInt();

                System.out.print("Please enter an integer denominator: ");
                int denominator = sc.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("\nResult: %d / %d = %d\n",
                        numerator, denominator, result);

                continueLoop = false;
            }catch(InputMismatchException inputMismatchException){
                System.err.printf("\nException: %s\n",
                        inputMismatchException);
                sc.nextLine(); // discard input so can try again

                System.out.println(
                        "You must enter integers. Please try again\n");
            }catch(ArithmeticException arithmeticException){
                System.err.printf("\nException: %s\n",
                        arithmeticException);
                System.out.println(
                        "Zero is an invalid denominator. Please try again\n");
            }
        }while(continueLoop);
    }
}
