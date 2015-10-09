/*
 *       Filename:  TheTwelveDaysOfChristmas.java
 *
 *    Description:  5.29 - Write an application that uses repetition and switch
 *                  statements to print the song "The Twelve Days of Christmas".
 *                  One switch statement should be used to print the remainder
 *                  of each verse.
 *
 *        Created:  08/10/15 16:32:15
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TheTwelveDaysOfChristmas{
    public static void main(String[] args){
        for(int i=1; i<=12; i++){
            System.out.print("\nOn the ");
            switch(i){
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default:
                    break;
            }
            System.out.print("day of christmas my true love sent to me:\n");

            // omit break statements so results cascade
            // countdown to avoid extra entries
            switch(i){
                case 12:
                    System.out.print("12 Drummers Drumming\n");
                case 11:
                    System.out.print("11 Pipers Piping\n");
                case 10:
                    System.out.print("10 Lords a-Leaping\n");
                case 9:
                    System.out.print("9 Ladies Dancing\n");
                case 8:
                    System.out.print("8 Maids a-Milking\n");
                case 7:
                    System.out.print("7 Swans a-Swimming\n");
                case 6:
                    System.out.print("6 Geese a-Laying\n");
                case 5:
                    System.out.print("5 Gold Rings\n");
                case 4:
                    System.out.print("4 Calling Birds\n");
                case 3:
                    System.out.print("3 French Hens\n");
                case 2:
                    System.out.print("2 Turtle Doves\n");
                case 1:
                    // check for dramatic effect
                    if(i > 1)
                        System.out.print((i < 12) ? "and\n" : "aaaaaand\n");
                    System.out.print("A Partridge in a Pear Tree\n");
            }
        }
    }
}
