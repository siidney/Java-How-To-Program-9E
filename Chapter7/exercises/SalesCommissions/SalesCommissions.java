/*
 *       Filename:  SalesCommissions.java
 *
 *    Description:  7.10 - Use a one-dimensional array to solve the following:
 *                  A company pays its salespeople on a commission basis.
 *                  The salespeople receive $200 per week plus 9% of their gross
 *                  sales for that week.
 *
 *                  Write an application (using an array of counters) that
 *                  determines how many of the salespeople earned salaries in
 *                  each of the following ranges (assumed that each salespersons
 *                  salary is truncated to an integer amount).
 *                  a) 200-299 b) 300-399 c) 400-499 d) 500-599 e) 600-699
 *                  f) 700-799 g) 800-899 h) 900-999 i) 1k+
 *
 *                  Sumarise the results in tabular format.
 *
 *        Created:  18/10/15 22:15:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
