/*
 *       Filename:  TwoLargest.java
 *
 *    Description:  4.23 - Find the two largest from a sequence of numbers.
 *
 *        Created:  01/10/15 18:46:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TwoLargest{
    private int current = 0, fLargest = 0, sLargest = 0; // first and second largest

    public void enterNumber(int x){
        if(x > fLargest){
            sLargest = fLargest;
            fLargest = x;
        }else if(x > sLargest){
            sLargest = x;
        }

        current = x;

        System.out.printf("First: %d. Second %d\n", fLargest, sLargest);
    }
    public int getFirstLargest(){
        return fLargest;
    }
    public int getSecondLargest(){
        return sLargest;
    }
}
