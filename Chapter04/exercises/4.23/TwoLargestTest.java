/*
 *       Filename:  TwoLargestTest.java
 *
 *    Description:  Exercise 4.23 - Find the Two Largest Numbers
 *
 *        Created:  01/10/15 18:49:11
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class TwoLargestTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TwoLargest tl = new TwoLargest();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter number: ", i+1);
            tl.enterNumber(sc.nextInt());
        }

        System.out.printf("First Largest: %d\nSecond Largest: %d\n",
                tl.getFirstLargest(), tl.getSecondLargest());
    }
}
