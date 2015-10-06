/*
 *       Filename:  SalesCommissionCalculator.java
 *
 *    Description:  4.19 - Develop a java application that inputs one
 *                  salesperson's items sold for last week and calculates and
 *                  displays that salesperson's earnings. There's no limit to
 *                  the number of items to be sold.
 *                  The salespeople receive $200 + 9% of weekly gross sales.
 *                  Item values:
 *                      1) 239.99
 *                      2) 129.75
 *                      3) 99.95
 *                      4) 350.89
 * *
 *        Created:  01/10/15 17:46:22
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */

public class SalesCommissionCalculator{
    private static final double BASE_PAY = 200.0;
    private static final double COMMISSION_PERCENT = 0.09;

    private double total;

    public void enterItem(int x){
        switch(x){
            case 1:
                total += 239.99;
                break;
            case 2:
                total += 129.75;
                break;
            case 3:
                total += 99.95;
                break;
            case 4:
                total += 350.89;
                break;
            default:
                break;
        }
    }
    public double getSalesTotal(){
        return total;
    }
    public double calculateCommission(){
        return BASE_PAY + total * COMMISSION_PERCENT;
    }
}
