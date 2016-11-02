/*
 *       Filename:  PieceWorker.java
 *
 *    Description:  Exercise 10.11 - Accounts Payable System Modification
 *
 *        Created:  17/11/15 19:28:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PieceWorker extends Employee{
    private double wage;
    private double pieces;

    // constructor
    public PieceWorker(String first, String last, String ssn,
            double wage, double pieces){
        super(first, last, ssn);

        setWage(wage);
        setPieces(pieces);
    }
    public PieceWorker(String first, String last, String ssn,
            double wage, double pieces, int month, int day, int year){
        super(first, last, ssn, month, day, year);

        setWage(wage);
        setPieces(pieces);
    }
    // SETTERS
    public void setWage(double w){
        if(w >= 0.0f)
            this.wage = w;
        else
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0f");
    }
    public void setPieces(double p){
        if(p >= 0.0f)
            this.pieces = p;
        else
            throw new IllegalArgumentException(
                    "Pieces must be >= 0.0f");
    }
    // GETTERS
    public double getWage(){
        return this.wage;
    }
    public double getPieces(){
        return this.pieces;
    }
    // calculate getPaymentAmount; override abstract method in Employee
    @Override
    public double getPaymentAmount(){
        return getPieces() * getWage();
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage", getWage(),
                "pieces produced", getPieces());
    }
}
