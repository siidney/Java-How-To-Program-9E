/*
 *       Filename:  PayrollSystemTest.java
 *
 *    Description:  10.9 - test application
 *
 *        Created:  09/11/15 18:13:37
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PayrollSystemTest{
    public static void main(String[] args){
        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.00f);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Karen", "Price", "222-22-2222", 16.75f, 40.0f);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000.0f, .06f);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
            new BasePlusCommissionEmployee(
                    "Bob", "Lewis", "444-44-4444", 5000.0f, .04f, 300.0f);

        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());

        // create four element Employee array
        Employee[] employees = new Employee[4];

        // initialise array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

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
            System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}
