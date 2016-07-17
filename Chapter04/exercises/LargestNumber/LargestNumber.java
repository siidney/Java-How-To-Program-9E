/*
 *       Filename:  LargestNumber.java
 *
 *    Description:  4.21 - Write a java application that inputs a series of 10
 *                  numbers and determines and prints the largest integer.
 *                  Your program should use at least the following three
 *                  variables:
 *                      a) counter
 *                      b) number
 *                      c) largest
 *
 *        Created:  01/10/15 18:34:43
 *       Revision:  09/10/15 16:38:15
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class LargestNumber{
    int current = 0, largest = 0;

    public void enterNumber(int x){
        largest = Math.max(x, largest);
    }
    public int getLargestNumber(){
        return largest;
    }
}
