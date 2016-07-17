/*
 *       Filename:  PayableInterfaceTest.java
 *
 *    Description:  10.15 - Test interface Payable
 *
 *        Created:  16/11/15 17:51:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PayableInterfaceTest{
    public static void main(String[] args){
        // create four element payable array
        Payable[] payableObjects = new Payable[4];

        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00f);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95f);
        payableObjects[2] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.00f);
        payableObjects[3] = new SalariedEmployee(
                "Lisa", "Barnes", "888-88-8888", 1200.00f);

        System.out.println("Invoices and Employee processed polymorphically:\n");

        // generically process each element in array payableObjects
        for(Payable currentPayable : payableObjects){
            // output currentPayable and its appropriate payment amount
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
    }
}
