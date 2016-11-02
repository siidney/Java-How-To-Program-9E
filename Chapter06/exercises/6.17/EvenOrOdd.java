/*
 *       Filename:  EvenOrOdd.java
 *
 *    Description:  Exercise 6.17 - Even or Odd
 *
 *        Created:  14/10/15 14:40:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter an integer to see if it is even(-1 exit): ");
            int x = sc.nextInt();

            if(x == -1)
                break;

            System.out.printf("%d is%even.\n", x,
                    (isEven(x) == true) ? " " : " not");
        }
    }
    public static boolean isEven(int x){
        return (x % 2 == 0) ? true: false;
    }
}
