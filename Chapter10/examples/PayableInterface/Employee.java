/*
 *       Filename:  Employee.java
 *
 *    Description:  10.13 - Employee abstract superclass that implements Payable
 *
 *        Created:  06/11/15 20:37:44
 *       Revision:  16/11/15 17:40:26
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // constructor
    public Employee(String first, String last, String ssn){
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
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
    // return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    // Note: We do not implement Payable method getPaymentAmount here so this
    // class must be declared abstract to avoid a compilation error.
}
