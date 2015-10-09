/*
 *       Filename:  FairTaxTest.java
 *
 *    Description:  5.31 - FairTax test application
 *
 *        Created:  08/10/15 21:15:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class FairTaxTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FairTax ft = new FairTax();

        int choice = 0;

        while(choice != -1){
            ft.showMenu();
            choice = sc.nextInt();

            if(choice > 0)
                ft.calculateTax(choice);
        }

        ft.showSavings();
    }
}
