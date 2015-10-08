/*
 *       Filename:  Interest.java
 *
 *    Description:  5.18 - Modify the application in Fig. 5.6 to use only
 *                  integers to calculate the compound interest.
 *                  (Hint: Treat all monetary amounts as integral numbers of
 *                  pennies. Then break the result into its dollars and cents
 *                  portions by using the division and remainder operations,
 *                  respectively. Insert a period between the dollars and cents
 *                  portion)
 *
 *        Created:  06/10/15 14:34:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */

// TODO Finish this - Spent too much time on it and couldn't be bothered
//                    figuring it out

public class Interest{
    public static void main(String[] args){
        int amount; // amount on deposit at end of each year
        int principal = 1000; // initial amount before interest
        int rate = 5; // interest rate

        System.out.printf("%s%20s\n", "YEAR", "Amount on deposit");

        for(int year=0; year<=10; year++){
            amount = principal * (int)Math.pow(1 + rate, year);

            System.out.printf("%4d%,20d\n", year, amount);
        }
    }
}
