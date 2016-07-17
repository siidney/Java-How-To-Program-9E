/*
 *       Filename:  Time1PackageTest.java
 *
 *    Description:  8.16 - Time1 object used in an application
 *
 *        Created:  26/10/15 17:42:19
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
// import class Time1
import com.deitel.jhtp.ch08.Time1;

public class Time1PackageTest{
    public static void main(String[] args){
        // create and initialise a Time1 object
        Time1 time = new Time1();

        // ouput string representations of the time
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println();

        // change time and output updated time
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime() is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime() is: ");
        System.out.println(time.toString());
        System.out.println();

        // attempt to set time with invalid dates
        try{
            time.setTime(99, 99, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }

        // display time after attempt to set invalid values
        System.out.println("After attempting invalid settings: ");
        System.out.print("Universal time after setTime() is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime() is: ");
        System.out.println(time.toString());
        System.out.println();
    }
}
