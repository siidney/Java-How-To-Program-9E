/*
 *       Filename:  Employee.java
 *
 *    Description:  8.12 - Static variable used to maintain a count of the
 *                  number of Employee objects in memory.
 *
 *        Created:  26/10/15 16:50:05
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Employee{
    private String firstName;
    private String lastName;
    private static int count = 0;

    // Initialise Employee, add 1 to static count and
    // output String indicating that constructor was called
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;

        System.out.printf("Employee constructor: %s %s; count = %d\n",
                getFirstName(), getLastName(), getCount());
    }
    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public static int getCount(){
        return count;
    }
}
