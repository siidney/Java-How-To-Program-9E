/*
 *       Filename:  LargestNumberTest.java
 *
 *    Description:  4.21 - Find the largest in a sequence of numbers
 *
 *        Created:  01/10/15 18:36:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class LargestNumberTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestNumber ln = new LargestNumber();

        for(int i=1; i<11; i++){
            System.out.printf("%d. Enter a number: ", i);
            ln.enterNumber(sc.nextInt());
        }
        System.out.printf("The largest number is: %d\n", ln.getLargestNumber());
    }
}
