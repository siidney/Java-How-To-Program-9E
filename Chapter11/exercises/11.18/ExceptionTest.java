/*
 *       Filename:  ExceptionTest.java
 *
 *    Description:  Exercise 11.17 - Catching Exceptions With Superclasses
 *
 *        Created:  02/12/15 01:15:21
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ExceptionTest{
    public static void main(String[] args){

        try{
            getExceptionB();
        }catch(ExceptionA ea){
            ea.printStackTrace();
        }

        try{
            getExceptionC();
        }catch(Exception ea){
            ea.printStackTrace();
        }
    }
    public static void getExceptionB() throws ExceptionB{
        throw new ExceptionB("ExceptionB");
    }
    public static void getExceptionC() throws ExceptionC{
        throw new ExceptionC("ExceptionC");
    }
}
