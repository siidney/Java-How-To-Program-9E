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
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class LargestNumber{
    int current = 0, largest = 0;

    public void enterNumber(int x){
        current = x;
        if(current > largest)
            largest = current;
    }
    public int getLargestNumber(){
        return largest;
    }
}
