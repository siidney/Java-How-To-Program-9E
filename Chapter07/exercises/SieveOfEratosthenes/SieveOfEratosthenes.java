/*
 *       Filename:  SieveOfEratosthenes.java
 *
 *    Description:  7.27 - Write an application that uses an array of 1000
 *                  elements to determine and display the prime numbers between
 *                  2 and 999. Ignore array elements 0 and 1.
 *                  Use The Sieve of Eratosthenes:
 *                  a) Create a primitive type boolean array with all elements
 *                  initialised to true.
 *                  b) Starting at index 2, determine whether a given element is
 *                  true.
 *                  If so, loop through the remainder of the array and set to
 *                  false every element whose index is a multiple of the index
 *                  for the element with value true.
 *                  The continue the process with the next element with value
 *                  true.
 *                  Index 2 (4, 6, 8, 19...)
 *                  Index 3 (6, 9, 12, 15...)
 *
 *        Created:  20/10/15 00:14:48
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Arrays;

public class SieveOfEratosthenes{
    private static final int SAMPLE_SIZE = 1000;
    private static boolean[] arrPrimes= new boolean[SAMPLE_SIZE];

    public static void main(String[] args){
        Arrays.fill(arrPrimes, true);
        arrPrimes[0] = false;
        arrPrimes[1] = false;

        for(int i=0; i<arrPrimes.length; i++){
            // check if arrPrimes is true
            if(arrPrimes[i]){
                // mark false any j multiples of i
                for(int j=i;i*j<arrPrimes.length; j++){
                    arrPrimes[i * j] = false;
                }
            }
        }

        for(int i=0; i<arrPrimes.length; i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    // check if index is prime (still true)
    public static boolean isPrime(int x){
        return arrPrimes[x];
    }
}
