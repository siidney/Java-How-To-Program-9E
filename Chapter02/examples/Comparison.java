/*
 *       Filename:  Comparison.java
 *
 *    Description:  Compare integers using if statements, relational operators
 *                  and equality operators.
 *
 *        Created:  26/09/15 00:10:37
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Comparison{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);

        if(number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);

        if(number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);

        if(number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);

        if(number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);

        if(number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
