/*
 *       Filename:  SidesOfTriangle.java
 *
 *    Description:  Exercise 4.35 - Sides of a Triangle
 *
 *        Created:  05/10/15 22:34:40
 *       Revision:  01/11/16 18:45:58
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
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

        System.out.printf("The entered values could%sbe a triangle\n",
            isTriangle(a, b, c) ? " " : " NOT ");
    }
    // use triangle inequality theorem to determine viability
    // the sum of any 2 sides must be greater than the 3rd
    // must be true of all combinations
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
}
