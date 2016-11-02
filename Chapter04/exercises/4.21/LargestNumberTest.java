/*
 *       Filename:  LargestNumberTest.java
 *
 *    Description:  4.21 - Find the largest in a sequence of 10 numbers
 *
 *        Created:  01/10/15 18:36:58
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class LargestNumberTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestNumber ln = new LargestNumber();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter a number: ", i+1);
            ln.enterNumber(sc.nextInt());
        }
        System.out.printf("The largest number is: %d\n", ln.getLargestNumber());
    }
}
