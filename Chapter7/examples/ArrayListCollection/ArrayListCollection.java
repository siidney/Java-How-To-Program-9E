/*
 *       Filename:  ArrayListCollection.java
 *
 *    Description:  7.24 - Generic ArrayList<T> collection demonstration.
 *
 *        Created:  18/10/15 15:55:12
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.ArrayList;

public class ArrayListCollection{
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        // header
        System.out.print("Display list contents with counter controlled loop: ");

        for(int i=0; i<items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }

        // display colours using foreach in the display method
        display(items, "\nDisplay list contents with enhanced for statement: ");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements: ");

        items.remove("yellow"); // remove the first yellow
        display(items, "Remove first instance of yellow: ");

        items.remove(1); // remove item at index 1
        display(items, "Remove second list element (green): ");

        // check if a value is in the list
        System.out.printf("\"red\" is %sin the list\n",
                items.contains("red") ? "" : "not ");

        // display number of elements in the list
        System.out.printf("Size: %s\n", items.size());
    }
    // display the ArrayList's elements
    public static void display(ArrayList<String> items, String header){
        System.out.print(header);

        for(String item : items)
            System.out.printf("%s ", item);

        System.out.println();
    }
}
