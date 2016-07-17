/*
 *       Filename:  UsingExceptions.java
 *
 *    Description:  11.4 - try...catch...finally exception handling mechanism.
 *
 *        Created:  24/11/15 15:21:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class UsingExceptions{
    public static void main(String[] args){
        try{
            throwException();
        }catch(Exception exception){
            System.err.println("Exception handled in main");
        }

        doesNotThrowException();
    }
    public static void throwException() throws Exception{
        // throw an exception and immediately catch it
        try{
            System.out.println("Method throwException");
            throw new Exception();
        }catch(Exception exception){
            System.err.println(
                    "Exception handled in method throwException");
            throw exception;
        }finally{
            System.err.println("Finally executed in throwException");
        }
    }
    // demonstrate finally when no exception occurs
    public static void doesNotThrowException(){
        try{
            System.out.println("Method doesNotThrowException");
        }catch(Exception exception){
            System.err.println(exception);
        }finally{
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }

        System.out.println("End of method doesNotThrowException");
    }
}
