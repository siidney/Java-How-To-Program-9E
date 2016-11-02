/*
 *       Filename:  Invoice.java
 *
 *    Description:  Exercise 3.13 - Invoice Class
 *
 *        Created:  28/09/15 17:51:22
 *       Revision:  09/10/15 16:30:14
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;

    // constructor
    public Invoice(String partNumber, String partDescription, int quantity, double unitPrice){

        setPartNumber(partNumber);
        setDescription(partDescription);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }
    // setters
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity){
        this.quantity = (quantity < 0) ? 0 : quantity;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = (unitPrice < 0.0) ? 0.0 : unitPrice;
    }
    // getters
    public String getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getInvoiceAmount(){
        return getQuantity() * getUnitPrice();
    }
}
