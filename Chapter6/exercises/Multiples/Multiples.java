/*
 *       Filename:  Multiples.java
 *
 *    Description:  6.16 - Write a method 'isMultiple' that determines, for a
 *                  pair of integers, whether the second is a multiple of the
 *                  first.
 *                  The method should take two integer arguments and return true
 *                  if the second is a multiple of the first and false
 *                  otherwise.
 *                  Incorporate this method into an application that inputs a
 *                  series of pairs of integers (one pair at a time) and
 *                  determines whether the second value in each pair is a
 *                  multiple of the first.
 *
 *        Created:  14/10/15 14:21:52
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a pair of space separated integers (-1 exit): ");
            int x = sc.nextInt();
            if(x != -1){
                int y = sc.nextInt();

                System.out.printf("%d as multiple of %d = %s\n", x, y,
                        (isMultiple(x, y) == true) ? "true" : "false");
            }
            break;
        }
    }
    public static boolean isMultiple(int x, int y){
        return (y % x == 0) ? true : false;
    }
}
