/*
 *       Filename:  CalculatingSales.java
 *
 *    Description:  Exercise 5.17 - Calculating Sales
 *
 *        Created:  07/10/15 00:33:47
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
