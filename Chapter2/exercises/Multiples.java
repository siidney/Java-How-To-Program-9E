/*
 *       Filename:  Multiples.java
 *
 *    Description:  2.26 - Write an application that reads two integers,
 *                  determines whether the first is a multiple of the second and
 *                  prints the results.
 *
 *        Created:  26/09/15 01:06:18
 *       Revision:  09/10/15 16:00:41
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class Multiples{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two space separated integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x % y == 0){
            System.out.printf("%d is a multiple of %d\n", x, y);
        }else{
            System.out.printf("%d is not a multiple of %d\n", x, y);
        }
    }
}
