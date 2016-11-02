/*
 *       Filename:  LargestNumber.java
 *
 *    Description:  Exercise 4.21 - Find the Largest Number
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
    int largest = 0;

    public void enterNumber(int x){
        largest = Math.max(x, largest);
    }
    public int getLargestNumber(){
        return largest;
    }
}
