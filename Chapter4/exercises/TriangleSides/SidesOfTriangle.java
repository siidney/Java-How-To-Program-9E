/*
 *       Filename:  SidesOfTriangle.java
 *
 *    Description:  4.35 - Write an application that reads three non zero values
 *                  entered by the user and determines whether they could
 *                  represent sides of a triangle.
 *
 *        Created:  05/10/15 22:34:40
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SidesOfTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd side: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd side: ");
        int c = sc.nextInt();

        if(isTriangle(a, b, c))
            System.out.println("The entered values could be a triangle.");
        else
            System.out.println("The entered values could NOT be a triangle.");
    }
    // use triangle inequality theorem to determine viability
    // the sum of any 2 sides must be greater than the 3rd
    // must be true of all combinations
    private static boolean isTriangle(int a, int b, int c){
        if((a + b > c) && (a * c > b) && (b + c > a))
            return true;

        return false;
    }
}
