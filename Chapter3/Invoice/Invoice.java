/*
 *       Filename:  Invoice.java
 *
 *    Description:  3.13 - Invoice class to represent item sold in store.
 *
 *        Created:  28/09/15 17:51:22
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;

    // constructor
    public Invoice(String number, String desc, int quant, double price){
        partNumber = number;
        partDescription = desc;

        if(quant > 0)
            quantity = quant;

        if(price > 0.0)
            unitPrice = price;
    }
    // getters
    public String getNumber(){
        return partNumber;
    }
    public String getDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return unitPrice;
    }
    public double getInvoiceAmount(){
        return quantity * unitPrice;
    }
}
