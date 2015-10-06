/*
 *       Filename:  TwoLargest.java
 *
 *    Description:  4.23 - Using an approach similar to that for 4.21, find the
 *                  two largest values of the 10 values entered.
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
    private int fLargest = 0, sLargest = 0; // first and second largest

    public void enterNumber(int x){
        if(x > fLargest){
            sLargest = fLargest;
            fLargest = x;
        }else if(x > sLargest){
            sLargest = x;
        }
    }
    public int getFirstLargest(){
        return fLargest;
    }
    public int getSecondLargest(){
        return sLargest;
    }
}
