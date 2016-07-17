/*
 *       Filename:  Invoice.java
 *
 *    Description:  10.12 - Invoice class that implements Payable
 *
 *        Created:  16/11/15 17:24:18
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor
    public Invoice(String part, String description, int count, double price){
        setPartNumber(part);
        setPartDescription(description);
        setQuantity(count);
        setPricePerItem(price);
    }
    // SETTERS
    public void setPartNumber(String part){
        this.partNumber = part;
    }
    public void setPartDescription(String description){
        this.partDescription = description;
    }
    public void setQuantity(int count){
        if(count >= 0)
            this.quantity = count;
        else
            throw new IllegalArgumentException(
                    "Quantity must be >= 0");
    }
    public void setPricePerItem(double price){
        if(price >= 0)
            this.pricePerItem = price;
        else
            throw new IllegalArgumentException(
                    "Price per iten must be >= 0.0f");
    }
    // GETTERS
    public String getPartNumber(){
        return this.partNumber;
    }
    public String getPartDescription(){
        return this.partDescription;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPricePerItem(){
        return this.pricePerItem;
    }
    // return String representation of invoice object
    @Override
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }
    // Payable method
    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }
}
