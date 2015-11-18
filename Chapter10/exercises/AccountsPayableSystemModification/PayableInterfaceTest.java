/*
 *       Filename:  PayableInterfaceTest.java
 *
 *    Description:  10.11 - Modify 10.11-15 to include the complete
 *                  functionality of the payroll application of 10.4-9.
 *                  The application should still process 2 invoice objects but
 *                  should now process one object of each of the four Employee
 *                  subclasses.
 *                  If the object currently being processed is a
 *                  BasePlusCommissionEmployee, the application should increase
 *                  BasePlusCommissionEmployee's base salary by 10%.
 *                  Finally the application should output the payment amount for
 *                  each object.
 *
 *        Created:  16/11/15 17:51:53
 *       Revision:  17/11/15 23:55:47
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class PayableInterfaceTest{
    public static void main(String[] args){
        // create four element payable array
        Payable[] payableObjects = new Payable[6];

        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00f);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95f);
        payableObjects[2] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.0f);
        payableObjects[3] = new HourlyEmployee(
                "Lisa", "Barnes", "888-88-8888", 25.0f, 45.0f);
        payableObjects[4] = new CommissionEmployee(
                "Deez", "Nutz", "222-22-2222", 52.0f, 0.1f);
        payableObjects[5] = new BasePlusCommissionEmployee(
                "Scrooge", "McDuck", "333-33-3333", 25.0f, 0.25f, 100.0f);

        System.out.println("Invoices and Employee processed polymorphically:\n");

        // generically process each element in array payableObjects
        for(Payable currentPayable : payableObjects){
            // check for BasePlusCommissionEmployee
            // increase base salary by 10%
            if(currentPayable instanceof BasePlusCommissionEmployee){
                ((BasePlusCommissionEmployee)currentPayable).setBaseSalary(
                    1.10f * ((BasePlusCommissionEmployee)currentPayable).getBaseSalary());
            }

            // output currentPayable and its appropriate payment amount
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
    }
}
