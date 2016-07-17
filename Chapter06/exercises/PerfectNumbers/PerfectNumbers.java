/*
 *       Filename:  PerfectNumbers.java
 *
 *    Description:  6.24 - Write a method 'isPerfect' that determines if
 *                  parameter 'number' is a perfect number.
 *                  Use this method in a application that displays all perfect
 *                  numbers between 1 and 1000.
 *                  Display the factor of each perfect number to confirm the
 *                  number is indeed perfect.
 *                  Challenge the computing power of your computer by testing
 *                  numbers much larger than 1k.
 *                  Display the results.
 *
 *                  An integer is a perfect number if its factors, including 1
 *                  but not itself, sum to the number.
 *
 *                  6 = 1 + 2 + 3 = perfect number.
 *
 *                  Also, a perfect number is one which is half the sum of its
 *                  positive divisors.
 *
 *                  (1 + 2 + 3 + 6) / 2 = 6
 *
 *
 *        Created:  14/10/15 16:40:20
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PerfectNumbers{
    public static void main(String[] args){

        for(int i=0; i<1000000; i++){
            if(isPerfect(i)){
                System.out.printf("%d: ", i);
                printFactors(i);
            }
        }
    }
    // check if the temp value composed of perfect divisors is equal to the
    // original number
    public static boolean isPerfect(int number){
        int temp = 0;
        for(int i=1; i<=number/2; i++){
            if(number % i == 0)
                temp +=i;
        }
        return (temp == number) ? true : false;
    }
    // loop and return perfect divisors (factors)
    public static void printFactors(int number){
        for(int i=1; i<=number; i++){
            if(number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
