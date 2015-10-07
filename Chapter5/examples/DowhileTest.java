/*
 *       Filename:  DowhileTest.java
 *
 *    Description:  5.7 - do...while repetition statement
 *
 *        Created:  06/10/15 14:42:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class DowhileTest{
    public static void main(String[] args){
        int counter = 1;

        do{
            System.out.printf("%d ", counter);
            ++counter;
        }while(counter <= 10);

        System.out.println();
    }
}
