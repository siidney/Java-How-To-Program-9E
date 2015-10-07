/*
 *       Filename:  Sum.java
 *
 *    Description:  5.5 - Summing integers with the for statement
 *
 *        Created:  06/10/15 13:42:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Sum{
    public static void main(String[] args){
        int total = 0;

        for(int number=2; number<=20; number+=2){
            total += number;
        }
        System.out.printf("Sum is %d\n", total);
    }
}
