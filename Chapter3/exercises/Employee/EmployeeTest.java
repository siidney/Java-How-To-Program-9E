/*
 *       Filename:  EmployeeTest.java
 *
 *    Description:  3.14 - Write a test application names EmployeeTest that
 *                  demonstrates class Employee's capabilities.
 *                  Create two employee objects and display each object's yearly
 *                  salary. Then give each employee a 10% raise and display each
 *                  Employee's yearly salary again.
 *
 *        Created:  28/09/15 18:22:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class EmployeeTest{
    public static void main(String[] args){

        Employee employee1 = new Employee("Frank", "Freddy", 1000);
        printEmployee(employee1);

        Employee employee2 = new Employee("Jack", "Jackson", 768);
        printEmployee(employee2);

        System.out.println("\nAfter 10% raises:\n");
        // set raises of 10%
        employee1.setRaise(10);
        printEmployee(employee1);

        employee2.setRaise(10);
        printEmployee(employee2);

    }
    private static void printEmployee(Employee employee){
        System.out.printf("%s %s: $%.2f per annum\n",
                employee.getFirstName(), employee.getLastName(),
                employee.getYearlySalary());
    }
}
