/*
 *       Filename:  Time1Test.java
 *
 *    Description:  8.2 - Time1 object used in an application
 *
 *        Created:  22/10/15 16:56:28
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Time1Test{
    public static void main(String[] args){
        Time1 time = new Time1();

        // ouput string representations of the time
        System.out.print("The initial Universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println();

        // change time and ouput updated time
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();

        // attempt to set time with invalid values
        try{
            time.setTime(99, 99, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }

        // display time after attempt to set invalid values
        System.out.println("After attempting invalid settings: ");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());
        System.out.println();
    }
}
