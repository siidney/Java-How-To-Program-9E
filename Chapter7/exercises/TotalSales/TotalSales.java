/*
 *       Filename:  TotalSales.java
 *
 *    Description:  7.20 - Use a 2d array to solve the following problem:
 *                  A company has four sales people (1-4) who sell five
 *                  different products (1-5).
 *                  Once a day, each salesperson passes in a slip for each type
 *                  of product sold. Each slip contains the following:
 *                      a) The salespersons number
 *                      b) The product number
 *                      c) The total dollar value of that product sold that day.
 *                  Thus, each salesperson passes between 1 and 5 sales slips
 *                  per day.
 *                  Assume that the information from all the slips for last
 *                  month is available.
 *
 *                  Write an application that will read all this information for
 *                  last month's sales and summarize the total sales by
 *                  salesperson and by product.
 *                  All totals should be stored in the 2d array 'sales'.
 *                  After processing all the information for last month, display
 *                  the results in tabular format, with each column representing
 *                  a salesperson and each row representing a particular
 *                  product.
 *                  Cross total each row to get the total sales of each product
 *                  for last month.
 *                  Cross total each column to get the total sales by
 *                  salesperson for last month.
 *                  You output should include these cross totals to the right of
 *                  the totaled rows and to the bottom of the totaled columns.
 *
 *                  NOTE : Chose not to input the data manually as that would
 *                  take a hell of a long time and I'm far too lazy to be doing
 *                  that everytime I want to test/run this.
 *
 *        Created:  19/10/15 17:37:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
