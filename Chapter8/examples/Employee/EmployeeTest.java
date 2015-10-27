/*
 *       Filename:  EmployeeTest.java
 *
 *    Description:  8.13 - Static member demonstration
 *
 *        Created:  26/10/15 17:01:26
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class EmployeeTest{
    public static void main(String[] args){
        // show the count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d\n",
                Employee.getCount());

        // create two employees; count should be two
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        // show that count is 2 after creating two Employees
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n",
                Employee.getCount());

        // get names of Employees
        System.out.printf("\nEmployee 1: %s\nEmployee 2: %s %s\n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());

        // in this example, there is only one reference to each Employee,
        // so the following two statements indicate that these objects
        // are eligible for garbage collection
        e1 = null;
        e2 = null;
    }
}
