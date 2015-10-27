/*
 *       Filename:  EmployeeTest.java
 *
 *    Description:  8.9 - Composition demonstration.
 *
 *        Created:  26/10/15 16:22:39
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class EmployeeTest{
    public static void main(String[] args){
        Date birth = new Date(7, 24, 1947);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
}
