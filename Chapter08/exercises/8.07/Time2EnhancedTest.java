/*
 *       Filename:  Time2EnhancedTest.java
 *
 *    Description:  Exercise 8.7 - Enhancing Class Time2
 *
 *        Created:  22/10/15 19:38:21
 *       Revision:  28/10/15 18:08:33a
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.2
 *
 * =====================================================================================
 */
public class Time2EnhancedTest{
    public static void main(String[] args){
        Time2Enhanced t1 = new Time2Enhanced();             // 00:00:00
        Time2Enhanced t2 = new Time2Enhanced(2);            // 02:00:00
        Time2Enhanced t3 = new Time2Enhanced(21, 34);       // 21:34:00
        Time2Enhanced t4 = new Time2Enhanced(12, 25, 42);   // 12:25:42
        Time2Enhanced t5 = new Time2Enhanced(t4);           // 12:25:42
        Time2Enhanced t7 = new Time2Enhanced(22, 58, 59);   // 22:58:59

        System.out.println("Constructed with: ");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("     %s\n", t1.toUniversalString());
        System.out.printf("     %s\n", t1.toString());

        System.out.println("t2: hour specified: minute and second defaulted");
        System.out.printf("     %s\n", t2.toUniversalString());
        System.out.printf("     %s\n", t2.toString());

        System.out.println("t3: hour and minute specified: second defaulted");
        System.out.printf("     %s\n", t3.toUniversalString());
        System.out.printf("     %s\n", t3.toString());

        System.out.println("t4: hour, minute and second specified");
        System.out.printf("     %s\n", t4.toUniversalString());
        System.out.printf("     %s\n", t4.toString());

        System.out.println("t5: Time2Enhanced object t4 specified");
        System.out.printf("     %s\n", t5.toUniversalString());
        System.out.printf("     %s\n", t5.toString());

        System.out.println("t7: hour, minute and second specified");
        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        System.out.println("t7: increment hour(1) and minute(2)");
        t7.incrementHour();
        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        t7.incrementMinute();
        t7.incrementMinute();

        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());


        // sttempt to initialise t6 with invalid values
        try{
            Time2Enhanced t6 = new Time2Enhanced(27, 74, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("\nException while initialising t6: %s\n",
                    e.getMessage());
        }
    }
}
