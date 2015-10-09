/*
 *       Filename:  SidesOfRightTriangle.java
 *
 *    Description:  4.36 - Write an application that read three non zero
 *                  integers and determines and prints whether they could
 *                  represent the sids of a right triangle
 *
 *        Created:  05/10/15 22:43:45
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SidesOfRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();


        if(isTriangle(a, b, c))
            if(isRightAngled(a, b, c))
                System.out.println("The triangle is right angled.");
            else
                System.out.println("The triangle is NOT right angled.");
        else
            System.out.println("The entered values could NOT be a triangle.");
    }
    // first determine if side could be a triangle
    // use triangle inequality theorem to determine viability
    // the sum of any 2 sides must be greater than the 3rd
    // must be true of all combinations
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
    // second use pythgoras theorem to determine if is a right triangle
    // taking hypotenuse as longest side
    private static boolean isRightAngled(int a, int b, int c){
        int hypotenuse;

        if(a > b && a > c)
            hypotenuse = a;
        else if(b > a && b > c)
            hypotenuse = b;
        else
            hypotenuse = c;

       return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2));
    }

}
