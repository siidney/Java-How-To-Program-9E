/*
 *       Filename:  PolymorphismTest.java
 *
 *    Description:  10.1 - Assigning superclass and subclass references to
 *                  superclass and subclass variables.
 *
 *        Created:  06/11/15 18:45:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PolymorphismTest{
    public static void main(String[] args){
        // assign superclass reference to superclass variables
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call CommissionEmployee's toString with superclass reference",
                "to superclass object", commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusCommissionEmployee.toString());

        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.printf("%s %s:\n\n%s\n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
    }
}
