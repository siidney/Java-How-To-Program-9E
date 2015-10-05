/*
 *       Filename:  SalesCommissionCalculatorTest.java
 *
 *    Description:  4.19 - Calculate gross weekly sales commission of $200 + 9%
 *                  of total sales.
 *
 *        Created:  01/10/15 17:57:28
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class SalesCommissionCalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalesCommissionCalculator salesCal = new SalesCommissionCalculator();

        int item = 0;

        while(item != 9){
            System.out.print("Enter the number(1-4) of the item sold (9 to exit): ");
            item = sc.nextInt();

            salesCal.enterItem(item);

        }

        if(salesCal.getSalesTotal() > 0){
            System.out.print("\nWEEKLY COMMISSION\n");
            System.out.printf("Weekly sales total: %.2f\n", salesCal.getSalesTotal());
            System.out.printf("Weekly earnings: %.2f\n", salesCal.calculateCommission());

        }
    }
}
