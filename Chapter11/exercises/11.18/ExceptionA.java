/*
 *       Filename:  ExceptionA.java
 *
 *    Description:  Exercise 11.17 - Catching Exceptions With Superclasses
 *
 *        Created:  02/12/15 01:00:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExceptionA extends Exception{

    // constructor
    public ExceptionA(String message){
        super(message);
    }
}
