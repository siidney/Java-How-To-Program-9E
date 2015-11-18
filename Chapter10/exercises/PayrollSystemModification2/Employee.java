/*
 *       Filename:  Employee.java
 *
 *    Description:  10.8 - Modify the payroll system of 10.4-10.9 to include
 *                  private instance variable 'birthDay' in class Employee.
 *                  Use class Date of 8.7 to represent an employee's birthday.
 *
 *        Created:  06/11/15 20:37:44
 *       Revision:  17/11/15 15:58:14
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public abstract class Employee{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDay;

    // constructor
    public Employee(String first, String last, String ssn,
            int month, int day, int year){

        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);

        birthDay = new Date(month, day, year);
    }
    // SETTERS
    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }
    // GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public Date getBirthday(){
        return this.birthDay;
    }
    // return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    // ABSTRACT METHODS
    // not implemented here
    public abstract double earnings();
}
