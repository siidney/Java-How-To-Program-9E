/*
 *       Filename:  LogicalOperators.java
 *
 *    Description:  5.18 - Logical operators
 *
 *        Created:  06/10/15 15:29:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class LogicalOperators{
    public static void main(String[] args){
        // && truth table
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Conditional AND (&&)",
                "false && false", (false && false),
                "false && true", (false && true),
                "true  && false", (true && false),
                "true  && true", (true && true)
                );

        // || truth table
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Conditional OR (||)",
                "false || false", (false || false),
                "false || true", (false || true),
                "true  || false", (true || false),
                "true  || true", (true || true)
                );

        // & truth table
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical AND (&)",
                "false & false", (false & false),
                "false & true", (false & true),
                "true  & false", (true & false),
                "true  & true", (true & true)
                );

        // | truth table
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical inclusive OR (!)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true  | false", (true | false),
                "true  | true", (true | true)
                );

        // ^ truth table
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical exclusive OR (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true  ^ false", (true ^ false),
                "true  ^ true", (true ^ true)
                );

        // ! truth table
        System.out.printf("%s\n%s: %b\n%s: %b\n\n",
                "Logical NOT (!)",
                "!false", (!false),
                "!true ", (!true)
                );
    }
}
