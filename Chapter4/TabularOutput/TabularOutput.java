/*
 *       Filename:  TabularOutput.java
 *
 *    Description:  4.22 - Output a table of values using loops
 *
 *        Created:  01/10/15 18:41:29
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TabularOutput{
    public static void main(String[] args){
        System.out.println("N\t\t10*N\t\t100*N\t\t1000*N");

        for(int i=1; i<6; i++){
            System.out.printf("%d\t\t%d0\t\t%d00\t\t%d000\n", i, i, i, i);
        }
    }
}
