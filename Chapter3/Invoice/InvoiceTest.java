/*
 *       Filename:  InvoiceTest.java
 *
 *    Description:  3.13 - InvoiceTest
 *
 *        Created:  28/09/15 17:59:47
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class InvoiceTest{
    public static void main(String[] args){
        // testing positive values
        Invoice spanner = new Invoice("123", "A Spanner", 15, 12.5);

        printInvoice(spanner.getNumber(), spanner.getDescription(),
                     spanner.getQuantity(), spanner.getPrice(),
                     spanner.getInvoiceAmount()
                     );

        // testing negative values
        Invoice hammer = new Invoice("124", "A Hammer", -1, -15.0);

        printInvoice(hammer.getNumber(), hammer.getDescription(),
                     hammer.getQuantity(), hammer.getPrice(),
                     hammer.getInvoiceAmount());

    }
    private static void printInvoice(String num, String desc,
                                int quan, double price, double total){
        // print invoice
        System.out.printf("%s: %s - %d * %.2f = %.2f\n", num, desc, quan, price, total);
    }
}
