/*
 *       Filename:  Invoice.java
 *
 *    Description:  3.13 - Create a class called Invoice that a hardware store
 *                  might use to represent an invoice for an item sold at the
 *                  store. An invoice should include four pieces of information
 *                  as instance variables -
 *                      String  - part number
 *                      String  - part description
 *                      int     - quantity of item being purchased
 *                      double  - price per item
 *                  Your class should have a constructor that initialised the
 *                  four variables. Provide setters and getters for each
 *                  instance variable. In addition provide a method names
 *                  getInvoiceAmount that calculates the invoice amount, then
 *                  returns the amount as a double. If the quantity is not
 *                  positive it should be set to 0.0.
 *
 *        Created:  28/09/15 17:51:22
 *       Revision:  09/10/15 16:30:14
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
