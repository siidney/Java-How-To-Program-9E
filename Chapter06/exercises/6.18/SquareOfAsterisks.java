/*
 *       Filename:  SquareOfAsterisks.java
 *
 *    Description:  Exercise 6.18 - Displaying a Square of Asterisks
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
