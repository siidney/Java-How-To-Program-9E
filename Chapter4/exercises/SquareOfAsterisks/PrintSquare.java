/*
 *       Filename:  PrintSquare.java
 *
 *    Description:  4.29 - Write an application that prompts the user to enter
 *                  the size fo the side of a square, then displays a hollow
 *                  square of that size made of asterisks. Your program should
 *                  work for all side lengths between 1 and 20.
 *
 *        Created:  01/10/15 19:20:18
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class PrintSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sides = 0;

        // validate input
        while(sides == 0){
            System.out.println("Enter a number between 1 and 20: ");
            int input = sc.nextInt();

            if(input > 0 && input <= 20){
                sides = input;
            }
        }

        for(int i=0; i<sides; i++){
            // first and last rows
            if(i == 0 || i == sides-1){
                for(int j=0; j<sides; j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                // hollow portion (-2 as 1 * on each side)
                for(int j=0; j<sides-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
