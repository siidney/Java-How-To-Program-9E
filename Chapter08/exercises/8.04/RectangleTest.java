/*
 *       Filename:  RectangleTest.java
 *
 *    Description:  Exercise 8.4 - Rectangle Class
 *
 *        Created:  28/10/15 16:24:35
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class RectangleTest{
    public static void main(String[] args){
        // default constructor
        Rectangle rect1 = new Rectangle();

        rect1.setLength(2.0f);
        rect1.setWidth(8.0f);

        // constructor with values
        Rectangle rect2 = new Rectangle(4.0f, 3.0f);

        System.out.println("rect1 default constructor");
        System.out.printf("%s\n", rect1.toString());

        System.out.println("rect2 constructed with width and length");
        System.out.printf("%s\n", rect2.toString());

        // constructor with invalid values
        try{
            Rectangle rect3 = new Rectangle(40.0f, -1.0f);
        }catch(IllegalArgumentException e){
            System.out.printf("\nException while initialising rect3: %s\n",
                    e.getMessage());
        }
    }
}
