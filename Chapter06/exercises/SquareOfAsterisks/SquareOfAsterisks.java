/*
 *       Filename:  SquareOfAsterisks.java
 *
 *    Description:  6.18 - Write a method 'squareOfAsterisks' that displays a
 *                  solid square (the same number of rows and columns) of
 *                  asterisks whose side is specified in integer parameter 'side'.
 *                  Incorporate this method into an application that reads an
 *                  integer value for side from the user and outputs the
 *                  asterisks with the 'squareOfAsterisks' method.
 *
 *        Created:  14/10/15 14:46:21
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SquareOfAsterisks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter side of square (-1 to exit): ");
            int x = sc.nextInt();

            if(x == -1)
                break;

            squareOfAsterisks(x);
        }
    }
    public static void squareOfAsterisks(int x){
        for(int i=0; i<x; i++){
            System.out.println();
            for(int j=0; j<x; j++){
                System.out.print('*');
            }
        }
        System.out.println();
    }
}
