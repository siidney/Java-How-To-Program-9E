/*
 *       Filename:  CommissionEmployee.java
 *
 *    Description:  10.7 - extends Employee
 *
 *        Created:  09/11/15 17:52:55
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String first, String last, String ssn,
            double sales, double rate){
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    // SETTERS
    public void setCommissionRate(double rate){
        if(rate > 0.0f && rate < 1.0f)
            this.commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0f and < 1.0f");
    }
    public void setGrossSales(double sales){
        if(sales >= 0.0f)
            this.grossSales = sales;
        else
            throw new IllegalArgumentException
                ("Gross sales muse be >= 0.0f");
    }
    // GETTERS
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
