/*
 *       Filename:  PackageDataTest.java
 *
 *    Description:  8.17 - Package-access members of a class are accessible by
 *                  other classes in the same package.
 *
 *        Created:  26/10/15 17:55:15
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class PackageDataTest{
    public static void main(String[] args){
        PackageData packageData = new PackageData();

        // output string representation of packageData
        System.out.printf("After instantiation:\n%s\n", packageData);

        // change package access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye";

        // output string representation of packageData
        System.out.printf("After changing values:\n%s\n", packageData);
    }
}
// class with package access instance variables
class PackageData{
    int number;
    String string;

    // constructor
    public PackageData(){
        number = 0;
        string = "Hello";
    }

    // return PackageData object String representation
    public String toString(){
        return String.format("number: %d; string: %s", number, string);
    }
}

