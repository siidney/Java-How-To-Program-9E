/*
 *       Filename:  BasePlusCommissionEmployeeTest.java
 *
 *    Description:  9.7 - test application
 *
 *        Created:  06/11/15 12:30:45
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class BasePlusCommissionEmployeeTest{
    public static void main(String[] args){
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

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
        System.out.printf("%s %.2f\n", "Base salary is",
                employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("\n%s:\n\n%s\n",
                "Updated employee information obtained by toString", employee);
    }
}
