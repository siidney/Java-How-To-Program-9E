/*
 *       Filename:  SalesCommissions.java
 *
 *    Description:  Exercise 7.10 - Sales Commissions
 *
 *        Created:  18/10/15 22:15:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SalesCommissions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] frequency = new int[9];

        while(true){
            System.out.print("Enter salespersons total (-1 to exit): ");
            int response = sc.nextInt();

            if(response < 0)
                break;

            if(response < 200)
                continue;
            else if(response > 1000)
                response = 1000;

            // -2 to account for sales amounts starting at 200
            // avoids having unneccesary extra array elements
            ++frequency[(response / 100) -2];
        }

        for(int i=0; i<frequency.length; i++){
            if(i == 8)
                System.out.printf("$%d00+   : %d\n", i + 2, frequency[i]);
            else
                System.out.printf("$%d00-$%d99: %d\n", i + 2, i + 2, frequency[i]);
        }
    }
}
