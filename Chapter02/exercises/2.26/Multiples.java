/*
 *       Filename:  Multiples.java
 *
 *    Description:  Exercise 2.26 - Multiples
 *
 *        Created:  26/09/15 01:06:18
 *       Revision:  09/10/15 16:00:41
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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

        System.out.printf("%d is%sa multiple of %d\n", x, (x % y == 0 ? " " : " not "), y);
    }
}
