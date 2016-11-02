/*
 *       Filename:  TwoLargest.java
 *
 *    Description:  Exercise 4.23 - Find the Two Largest Numbers
 *
 *        Created:  01/10/15 18:46:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
