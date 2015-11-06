/*
 *       Filename:  CommissionEmployeeTest.java
 *
 *    Description:  9.5 - Test application
 *
 *        Created:  06/11/15 12:06:50
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class CommissionEmployeeTest{
    public static void main(String[] args){
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);

        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is",
                employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is",
                employee.getCommissionRate());

        employee.setGrossSales(500);
        employee.setCommissionRate(.1);

        System.out.printf("\n%s:\n\n%s\n",
                "Updated employee information obtained by toString", employee);
    }
}
