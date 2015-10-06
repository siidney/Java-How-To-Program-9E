/*
 *       Filename:  TwoLargestTest.java
 *
 *    Description:  4.23 - Find the two largest from a sequence of numbers
 *
 *        Created:  01/10/15 18:49:11
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class TwoLargestTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TwoLargest tl = new TwoLargest();

        for(int i=1; i<11; i++){
            System.out.printf("%d. Enter number: ", i);
            tl.enterNumber(sc.nextInt());
        }

        System.out.printf("First Largest: %d\nSecond Largest: %d\n",
                tl.getFirstLargest(), tl.getSecondLargest());
    }
}
