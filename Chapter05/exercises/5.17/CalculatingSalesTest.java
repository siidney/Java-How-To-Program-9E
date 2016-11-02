/*
 *       Filename:  CalculatingSalesTest.java
 *
 *    Description:  Exercise 5.17 - Calculating Sales
 *
 *        Created:  07/10/15 00:43:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class CalculatingSalesTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CalculatingSales cs = new CalculatingSales();

        int productNo, quantity;

        do{
            productNo = requestInput("Enter product number 1-5 (-1 to quit): ", sc);

            // verify product no is in range
            if((productNo != -1) && !(productNo > 5)){
                quantity = requestInput("Enter quantity for product " + productNo + ": ", sc);
                cs.addProduct(productNo, quantity);
            }

        }while((productNo != -1));

        System.out.printf("Total: %.2f\n", cs.getTotal());
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}
