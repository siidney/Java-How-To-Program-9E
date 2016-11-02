/*
 *       Filename:  Checkerboard.java
 *
 *    Description:  2.27 - Write an application that displays a checkerboard
 *                  pattern.
 *
 *        Created:  26/09/15 01:09:32
 *       Revision:  01/11/16 16:58:41
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */

public class Checkerboard{
    public static void main(String[] args){
        for(int i=0; i<8; ++i){
            System.out.printf("%s* * * * * * * *\n", (i % 2 != 0 ? " " : ""));
        }
    }
}
