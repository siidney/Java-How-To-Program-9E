/*
 *       Filename:  CommissionEmployee.java
 *
 *    Description:  9.4 - Represents an employee paid a percentage of gross
 *                  sales.
 *
 *        Created:  05/11/15 19:43:33
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CommissionEmployee extends Object{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate){
        // implicit call to Object constructor occurs here
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    // SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setGrossSales(double grossSales){
        if(grossSales >= 0.0f)
            this.grossSales = grossSales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0f");
    }
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 0.0f && commissionRate < 1.0f)
            this.commissionRate = commissionRate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0f and < 1.0f");
    }
    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    public double getCommissionRate(){
        return this.commissionRate;
    }
    // calculate earnings
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    // return string representation of CommissionEmployee object
    @Override // indicates this method overrides a superclass method
        public String toString(){
            return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                    "commission employee", getFirstName(), getLastName(),
                    "social security number", getSocialSecurityNumber(),
                    "gross sales", getGrossSales(),
                    "commission rate", getCommissionRate());
        }
}
