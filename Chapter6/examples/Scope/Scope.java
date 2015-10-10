/*
 *       Filename:  Scope.java
 *
 *    Description:  6.9 - Scope class demonstrates field and local variable
 *                  scopes.
 *
 *        Created:  09/10/15 23:19:16
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Scope{
    private static int x = 1;

    public static void main(String[] args){
        int x = 5; // methods local variable x shadows field x

        System.out.printf("local x in main is %d\n", x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("\nlocal x in main is %d\n", x);
    }
    // create and initialise local variable x during each call
    public static void useLocalVariable(){
        int x = 25;

        System.out.printf("\nlocal x on entering method useLocalVariable is %d\n",
                x);

        ++x;

        System.out.printf("local x before exiting method useLocalVariable is %d\n",
                x);
    }
    // modify class Scope's field x during each call
    public static void useField(){
        System.out.printf("\nfield x on entering method useField is %d\n",
                x);

        x *= 10;

        System.out.printf("field x before exiting method useField is %d\n",
                x);
    }
}
