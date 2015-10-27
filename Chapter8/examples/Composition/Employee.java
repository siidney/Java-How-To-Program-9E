/*
 *       Filename:  Employee.java
 *
 *    Description:  8.4 - Employee class with references to other object8.4 -
 *    Employee class with references to other objectss
 *
 *        Created:  26/10/15 16:18:35
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Employee{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // constructor
    // initialises name, birth and hire dates
    public Employee(String first, String last, Date birthDate, Date hireDate){
        this.firstName = first;
        this.lastName = last;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    // convert employee to String format
    public String toString(){
        return String.format("%s, %s, Hired: %s Birthday: %s",
                this.lastName, this.firstName, this.hireDate, this.birthDate);
    }
}
