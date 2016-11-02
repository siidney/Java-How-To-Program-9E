/*
 *       Filename:  TotalSales.java
 *
 *    Description:  Exercise 7.20 - Airline Reservation System
 *
 *        Created:  19/10/15 17:37:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Random;

public class TotalSales{
    private static final int SALESPEOPLE = 4;
    private static final int NUM_OF_PRODUCTS = 5;
    private static final Random randomGenerator = new Random();
    // rows for each product
    private static int[][] arrSales = new int[NUM_OF_PRODUCTS][];

    public static void main(String[] args){

        // create colums for each salesperson
        for(int i=0; i<arrSales.length; i++){
            arrSales[i] = new int[SALESPEOPLE];
        }

        // populate with random data
        for(int row=0; row<arrSales.length; row++){
            for(int column=0; column<arrSales[row].length; column++){
                arrSales[row][column] = randomGenerator.nextInt(9999);
            }
        }
        printTotals();
    }
    public static void printTotals(){
        System.out.printf("\t%5d%6d%7d%7d%12s\n", 1, 2, 3, 4, "Total");

        int rowTotal = 0;
        int colTotal = 0;

        for(int row=0; row<arrSales.length; row++){
            System.out.printf("%5d\t", row + 1);
            rowTotal = 0;
            colTotal = 0;

            // print columns and row totals (product)
            for(int column=0; column<arrSales[row].length; column++){
                System.out.printf("%6d ", arrSales[row][column]);
                rowTotal += arrSales[row][column];
            }
            System.out.printf("%9d", rowTotal);
            System.out.println();
        }

        // print and calculate column totals (salespeople)
        System.out.printf("\n%8s ", "Total");

        for(int col=0; col<SALESPEOPLE; col++){
            for(int row=0; row<arrSales.length; row++){
                colTotal += arrSales[row][col];
            }
            System.out.printf("%6d ", colTotal);
            colTotal = 0;
        }
        System.out.println();
    }
}
