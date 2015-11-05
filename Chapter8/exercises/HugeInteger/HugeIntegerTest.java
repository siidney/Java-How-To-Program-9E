/*
 *       Filename:  HugeIntegerTest.java
 *
 *    Description:  8016 - Test application
 *
 *        Created:  04/11/15 15:41:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HugeIntegerTest{
    public static void main(String[] args){
        HugeInteger hi1 = new HugeInteger("1234567800911");
        HugeInteger hi2 = new HugeInteger("1234567800911");
        HugeInteger hiAdd = HugeInteger.add(hi2, hi2);
        HugeInteger hiSub = HugeInteger.subtract(hi2, hi2);


        System.out.println("hi1 " + hi1.toString());
        System.out.println("hi2 " + hi2.toString());
        System.out.println("add " + hiAdd.toString());
        System.out.println("sub " + hiSub.toString());
        System.out.println("isEqualTo " + HugeInteger.isEqualTo(hi1, hi2));
        System.out.println("isNotEqualTo " + HugeInteger.isNotEqualTo(hi1, hi2));
        System.out.println("isGreaterThan " + HugeInteger.isGreaterThan(hi1, hi2));
        System.out.println("isLessThan " + HugeInteger.isLessThan(hi1, hi2));
        System.out.println("isGreaterThanOrEqualTo " +
                HugeInteger.isGreaterThanOrEqualTo(hi1, hi2));
        System.out.println("isLessThanOrEqualTo " +
                HugeInteger.isLessThanOrEqualTo(hi1, hi2));
        System.out.println("hi1 isZero " + hi1.isZero());
        System.out.println("hi1 isZero " + hi2.isZero());
    }
}
