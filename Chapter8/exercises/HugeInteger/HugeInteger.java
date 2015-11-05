/*
 *       Filename:  HugeInteger.java
 *
 *    Description:  8.16 - Create a class 'HugeInteger' which uses a 40 element
 *                  array of digits to store integers as large as 40 digits
 *                  each.
 *                  Provide the following methods:
 *                  Parse - receive a String, extract each digit using charAt
 *                  and place the integer equivalent into the int array.
 *                  toString - String representation
 *                  add - add two HugeInteger objects
 *                  subtract - subtract two HugeInteger objects
 *                  Predicate(boolean) comparison methods:
 *                  isEqualTo, isNotEqualTo, isGreaterThan, isLessThan,
 *                  isGreaterThanOrEqualTo, isLessThanOrEqualTo, isZero.
 *
 *                  TODO : Finish this. Can't be doing with all the special
 *                  maths stuff so am leaving this before it gets a fist through
 *                  the monitor.
 *
 *        Created:  04/11/15 15:36:34
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HugeInteger{
    private static final int HUGE_INTEGER_LIMIT = 40;
    private int[] hugeInteger = new int[HUGE_INTEGER_LIMIT];
    private int hiLength;   // store length to avoid truncating trailing zero's

    // constructor
    public HugeInteger(String strInteger){
        if(strInteger.length() <= 0)
            throw new IllegalArgumentException("length must be greater than zero");

        parse(strInteger);
    }
    public HugeInteger(int[] hugeInteger){
        this.hugeInteger = hugeInteger;
    }
    // GETTERS
    public int[] getHugeInteger(){
        return this.hugeInteger;
    }
    public int getLength(){
        return this.hiLength;
    }
    // parse
    // add to array starting at HUGE_INTEGER_LIMIT - length to avoid truncating
    // trailing zero's
    private void parse(String strOriginal){
        String strHugeInteger = "";

        // build String composed of only digits
        for(int i=0; i<strOriginal.length(); i++){
            Character c = strOriginal.charAt(i);

            if(Character.isDigit(c))
                strHugeInteger += c;
        }

        // ensure String length does not exceed hugeInteger size
        hiLength = (strHugeInteger.length() > hugeInteger.length) ?
                    hugeInteger.length : strHugeInteger.length();

        // add to array
        int c = 0;

        for(int i=HUGE_INTEGER_LIMIT - hiLength; i<HUGE_INTEGER_LIMIT; i++){
            hugeInteger[i] = strHugeInteger.charAt(c++) - 48;
        }
    }
    // parse to string for printing
    private String parseToString(){
        String strHugeInteger = "";

        for(int i=HUGE_INTEGER_LIMIT - hiLength; i<HUGE_INTEGER_LIMIT; i++){
            strHugeInteger += hugeInteger[i];
        }

        return strHugeInteger;
    }
    // MATHEMATIC OPERATIONS
    // addition
    public static HugeInteger add(HugeInteger hi1, HugeInteger hi2){
        int[] tmp1 = hi1.getHugeInteger();
        int[] tmp2 = hi2.getHugeInteger();

        String strTmp = "";

        // avoid redundant arithmetic
        int count = (hi1.getLength() > hi2.getLength()) ?
            hi1.getLength() : hi2.getLength();

        for(int i=HUGE_INTEGER_LIMIT - count; i<HUGE_INTEGER_LIMIT; i++){
            strTmp += tmp1[i] + tmp2[i];
        }
        return new HugeInteger(strTmp);
    }
    // subtraction
    public static HugeInteger subtract(HugeInteger hi1, HugeInteger hi2){
        int[] tmp1 = hi1.getHugeInteger();
        int[] tmp2 = hi2.getHugeInteger();

        String strTmp = "";

        // avoid redundant arithmetic
        int count = (hi1.getLength() > hi2.getLength()) ?
            hi1.getLength() : hi2.getLength();

        for(int i=HUGE_INTEGER_LIMIT - count; i<HUGE_INTEGER_LIMIT; i++){
            strTmp += tmp1[i] - tmp2[i];
        }
        return new HugeInteger(strTmp);
    }
    // COMPARISONS
    // isEqualTo
    public static boolean isEqualTo(HugeInteger hi1, HugeInteger hi2){
        int[] tmp1 = hi1.getHugeInteger();
        int[] tmp2 = hi2.getHugeInteger();

        for(int i=0; i<HUGE_INTEGER_LIMIT; i++){
            if(tmp1[i] != tmp2[i])
                return false;
        }
        return true;
    }
    // isNotEqualTo
    public static boolean isNotEqualTo(HugeInteger hi1, HugeInteger hi2){
        if(isEqualTo(hi1, hi2))
            return false;
        return true;
    }
    // isGreaterThan
    public static boolean isGreaterThan(HugeInteger hi1, HugeInteger hi2){
        // check if they are equal
        if(isEqualTo(hi1, hi2))
            return false;

        // check if is greater than

        return true;
    }
    // isLessThan
    public static boolean isLessThan(HugeInteger hi1, HugeInteger hi2){
        return true;
    }
    // isGreaterThanOrEqualTo
    public static boolean isGreaterThanOrEqualTo(HugeInteger hi1, HugeInteger hi2){
        if(isGreaterThan(hi1, hi2) || isEqualTo(hi1, hi2))
            return true;

        return false;
    }
    // isLessThanOrEqualTo
    public static boolean isLessThanOrEqualTo(HugeInteger hi1, HugeInteger hi2){
        if(isLessThan(hi1, hi2) || isEqualTo(hi1, hi2))
            return true;

        return false;
    }
    // isZero
    public boolean isZero(){
        for(int i : getHugeInteger()){
            if(i != 0)
                return false;
        }
        return true;
    }
    // String representation
    public String toString(){
        return String.format("%s", parseToString());
    }
}
