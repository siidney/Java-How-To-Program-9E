/*
 *       Filename:  SquareOfChar.java
 *
 *    Description:  Exercise 6.19 - Displaying a Square of Any Character
 *
 *        Created:  14/10/15 14:51:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SquareOfChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter side of square (-1 to exit): ");
            int x = sc.nextInt();

            if(x == -1)
                break;

            System.out.print("Enter fill char: ");
            char fill = sc.next().charAt(0);

            squareOfChar(x, fill);
        }
    }
    public static void squareOfChar(int x, char fillCharacter){
        for(int i=0; i<x; i++){
            System.out.println();
            for(int j=0; j<x; j++){
                System.out.print(fillCharacter);
            }
        }
        System.out.printf("\n\n");
    }
}
