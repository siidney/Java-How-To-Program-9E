/*
 *       Filename:  OddIntProduct.java
 *
 *    Description:  Exercise 5.12 - Calculating the Product of Odd Integers
 *
 *        Created:  06/10/15 23:35:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class OddIntProduct{
    public static void main(String[] args){
        int product = 1;

        for(int i=0; i<=15; i++){
            if(i % 2 != 0)
                product *= i;
        }

        System.out.printf("The product of the odd integers from 1 to 15 is: %d\n",
                product);
    }
}
