/*
 *       Filename:  IntegerSet.java
 *
 *    Description:  Exercise 8.13 - Set of Integers
 *
 *        Created:  29/10/15 00:15:57
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class IntegerSet{
    private static final int SET_LENGTH = 101;
    private boolean[] integerSet = new boolean[SET_LENGTH];

    // constructor
    // Arrays.fill() would be easier but I need the learning points
    public IntegerSet(){
        for(boolean b : integerSet)
            b = false;
    }
    // constructor with set
    public IntegerSet(int... num){
        for(int n : num)
            insertElement(n);
    }
    // create a set-theoretic union of two existing sets
    // make a new set by joining two old ones
    public static IntegerSet union(IntegerSet set1, IntegerSet set2){
        IntegerSet unionSet = new IntegerSet();

        for(int i=0; i<SET_LENGTH; i++){
            if((set1.isSet(i) || set2.isSet(i)))
                unionSet.insertElement(i);
            else
                unionSet.deleteElement(i);
        }
        return unionSet;
    }
    // create a set-theoretic intersection of two existing sets
    // make a new set by joining two old ones
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2){
        IntegerSet intersectionSet = new IntegerSet();

        for(int i=0; i<SET_LENGTH; i++){
            if((!set1.isSet(i) || !set2.isSet(i)))
                intersectionSet.deleteElement(i);
            else
               intersectionSet.insertElement(i);
        }
        return intersectionSet;
    }
    // determines if value is in set
    public boolean isSet(int n){
        if(n < SET_LENGTH)
            return integerSet[n];
        else
            throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
    }
    // determine if two sets are equal
    // could use Arrays.equals() but am guessing on extra points for self
    // implementation
    public boolean isEqual(boolean[] set1, boolean[] set2){
        // return false on first failure - no need to check every element
        for(int i=0; i<SET_LENGTH; i++){
            if(set1[i] != set2[i])
                return false;
        }
        // if loop finished all are equal
        return true;
    }
    // inserts an elements into integerSet
    public void insertElement(int k){
        if(k < SET_LENGTH)
            integerSet[k] = true;
        else
            throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
    }
    // deletes an element from integerSet
    public void deleteElement(int m){
        if(m < SET_LENGTH)
            integerSet[m] = false;
        else
            throw new ArrayIndexOutOfBoundsException("element range required: 0-100");
    }
    // string representation of object
    public String toString(){
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<SET_LENGTH; i++){
            if(integerSet[i] == true)
                sb.append(" " + i);
        }
        return (sb.toString().equals("")) ? "---" : sb.toString();
    }
}
