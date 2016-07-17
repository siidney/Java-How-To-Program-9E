/*
 *       Filename:  ThisTest.java
 *
 *    Description:  8.4 - This used implicitly and explicitly to refer to
 *                  memebers of an object.
 *
 *        Created:  22/10/15 18:48:11
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class ThisTest{
    public static void main(String[] args){
        SimpleTime time = new SimpleTime(15, 30, 19);

        System.out.println(time.buildString());
    }
}
// demonstrates the "this" reference
class SimpleTime{
    private int hour;
    private int minute;
    private int second;

    // if the constructor uses parameter names identical to
    // instance variable names the "this" reference is
    // required to distinguish between the names
    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // use explicit and implicit "this" to call toUniversalString
    public String buildString(){
        return String.format("%24s: %s\n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }
    // convert to string in universal time format (HH:MM:SS)
    public String toUniversalString(){
        // "this" is not required here to access instance variables.
        // because method does not have local variables with the same
        // names as instance variables.
        return String.format("02d:%02d:%02d",
                this.hour, this.minute, this.second);
    }
}
