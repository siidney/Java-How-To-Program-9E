/*
 *       Filename:  OddIntProduct.java
 *
 *    Description:  5.12 - Write an application that calculates the product of
 *                  the odd integers from 1 to 15;
 *
 *        Created:  06/10/15 23:35:53
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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
