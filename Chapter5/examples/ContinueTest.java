/*
 *       Filename:  ContinueTest.java
 *
 *    Description:  5.13 - continue statement terminating an iteration of a for
 *                  statement.
 *
 *        Created:  06/10/15 15:19:12
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ContinueTest{
    public static void main(String[] args){
        for(int count=0; count<=10; count++){
            if(count == 5)
                continue;

            System.out.printf("%d ", count);
        }
        System.out.println();
    }
}
