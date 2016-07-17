/*
 *       Filename:  EvenOrOdd.java
 *
 *    Description:  6.17 - Write a method 'isEven' that uses the remainder
 *                  operator to determine whether an integer is even.
 *                  The method should take an integer argument and return true
 *                  if the integer is even and false otherwise.
 *                  Incorporate this method into an application that inputs a
 *                  sequence of integers (one at a time) and determines whether
 *                  each is even or odd.
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

            System.out.printf("%d is %s\n", x,
                    (isEven(x) == true) ? "even" : "not even.");
        }
    }
    public static boolean isEven(int x){
        return (x % 2 == 0) ? true: false;
    }
}
