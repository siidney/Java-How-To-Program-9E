/*
 *       Filename:  UsingExceptions.java
 *
 *    Description:  11.5 - stack unwinding and obtaining data from an exception
 *                  object.
 *
 *        Created:  24/11/15 15:41:55
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
            method1();
        }catch(Exception exception){
            System.err.printf("%s\n\n", exception.getMessage());
            exception.printStackTrace();    // print exception stack trace

            // obtain the stack trace information
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.println("\nStack tract from getStackTrace: ");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // loop through traceElements to get exception description
            for(StackTraceElement element : traceElements){
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
        }
    }
    // call method2 throw exceptions back to main
    public static void method1() throws Exception{
        method2();
    }
    // call method3; throw exceptions back to main
    public static void method2() throws Exception{
        method3();
    }
    // throw Exception back to method2
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }
}
