/*
 *       Filename:  IntegerSetTest.java
 *
 *    Description:  8.13 - Test application
 *
 *        Created:  29/10/15 00:24:09
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class IntegerSetTest{
    public static void main(String[] args){
        IntegerSet intSet1 = new IntegerSet(1, 99, 88, 77, 56, 75, 46, 98, 100);
        IntegerSet intSet2 = new IntegerSet(13, 9, 56, 29, 75, 56, 46, 1, 100);

        System.out.printf("intSet1 : %s\n", intSet1.toString());
        System.out.printf("intSet2 : %s\n", intSet2.toString());

        IntegerSet intSetUnion = IntegerSet.union(intSet1, intSet2);
        IntegerSet intSetIntersection = IntegerSet.intersection(intSet1, intSet2);

        System.out.printf("intSetUnion : %s\n", intSetUnion.toString());
        System.out.printf("intSetIntersection : %s\n", intSetIntersection.toString());
    }
}
