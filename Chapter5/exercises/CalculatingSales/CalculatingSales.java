/*
 *       Filename:  CalculatingSales.java
 *
 *    Description:  5.17 - Write an application that reads a series of pairs of
 *                  numbers as follows:
 *                      a) product number
 *                      b) quantity sold
 *                  You program should use a switch statement to determing the
 *                  retail price for each product.
 *                  It should calculate and display the total retail value of
 *                  all products sold.
 *                  Use a sentinel controlled loop to determing when the program
 *                  should stopp looping and display the final results.
 *                  Product Prices:
 *                  1 - $2.98, 2 - $4.50, 3 - $9.98, 4- $4.49, 5 - $6.87.
 *
 *        Created:  07/10/15 00:33:47
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CalculatingSales{
    int productNo, quantity;
    double total;

    public void addProduct(int productNo, int quantity){
        switch(productNo){
            case 1:
                total += (2.98 * quantity);
                break;
            case 2:
                total += (4.50 * quantity);
                break;
            case 3:
                total += (9.98 * quantity);
                break;
            case 4:
                total += (4.49 * quantity);
                break;
            case 5:
                total += (6.89 * quantity);
                break;
            default:
                break;
        }
    }

    // GETTERS
    public double getTotal(){
        return total;
    }
}
