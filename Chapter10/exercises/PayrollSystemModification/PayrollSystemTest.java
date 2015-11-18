/*
 *       Filename:  PayrollSystemTest.java
 *
 *    Description:  10.8 - Create an array of Employee variables to store
 *                  references to the various employee objects.
 *                  In a loop, calculate the payroll for each Employee
 *                  (polymorphically), and add a $100.00 bonus to the person's
 *                  payroll amount if the current month is the one in which the
 *                  Employee's birthday occurs.
 *
 *        Created:  09/11/15 18:13:37
 *       Revision:  17/11/15 16:46:53
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
import java.util.Calendar;

public class PayrollSystemTest{
    public static void main(String[] args){
        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);

        // create four element Employee array
        Employee[] employees = new Employee[4];

        // initialise array with Employees
        employees[0] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.0f, 11, 3, 1883);
        employees[1] = new HourlyEmployee(
                "Karen", "Price", "222-22-2222", 16.75f, 40.0f, 12, 12, 1975);
        employees[2] = new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000.0f, .06f, 12, 13, 1965);
        employees[3] = new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "444-44-4444", 5000.0f, .04f, 300.0f, 12, 12, 1956);

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            // determine whether element is a BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                // downcase Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee =
                    (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());


            }

            // add $100.0 if birth month is current
            System.out.printf("earned $%,.2f\n\n",
                    (currentEmployee.getBirthday().getMonth() == currentMonth) ?
                    currentEmployee.earnings() + 100.0f : currentEmployee.earnings());
        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}
