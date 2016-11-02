/*
 *       Filename:  ComparingIntegers.java
 *
 *    Description:  Exerice 2.16 - Comparing Integers
 *
 *        Created:  26/09/15 00:32:32
 *       Revision:  09/10/15 15:35:21
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class ComparingIntegers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 space separated integers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if(x != y)
            System.out.printf("%d is larger than %d\n", Math.max(x, y), Math.min(x,y));
        else
            System.out.printf("%d and %d are equal\n", x, y);
    }
}
