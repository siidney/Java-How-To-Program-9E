/*
 *       Filename:  test.java
 *
 *    Description:  test
 *
 *        Created:  21/10/15 13:52:14
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class test{
    public static String operationCode = "0x";
    public static int operand = 0;
    public static int input = 0;
    public static int[] memory = new int[1000];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Arrays.fill(memory, 0);

        while(true){
            System.out.print("Enter int: ");
            input = sc.nextInt();

            sc.nextLine();

            if(input == -999)
                break;

            operationCode = getOperationCode(input);
            operand = getOperand(input);

            System.out.println("operationCode: " + operationCode);
            System.out.println("operand: " + operand);

            System.out.print("Enter a string: ");
            stringToASCII(sc.nextLine());

            ASCIIToString();
        }

    }
    // store string as char separated ASCII
    public static void stringToASCII(String s){
        // ensure operand is not changed
        int counter = operand;

        // insert length and first char ASCII code outside of loop
        memory[counter++] = (s.length() * 100) + (int)s.charAt(0) - 32;

        // loop through remaining chars adding 2 letters to each mem loc
        // if last char is solo add only that to mem loc
        for(int i=1; i<s.length(); i++){
            if(i + 1 < s.length()){
                memory[counter++] = toUpper(s.charAt(i)) * 100 + toUpper(s.charAt(++i));
            }else{
                memory[counter++] = toUpper(s.charAt(i)) * 100;
            }
        }
    }
    // convert stored ASCII back to string
    public static void ASCIIToString(){
        // set length -1 as first char read before loop
        int length = (memory[operand] / 100) - 1;
        // ensure operand is not changed.
        int counter = operand;

        // read first char outside of loop as first int pair is length
        System.out.print(toChar(memory[counter++] % 100));

        // decrease length by two as each of two chars is read from memory
        while(length > 0 ){
            System.out.print(toChar(memory[counter] / 100));
            System.out.print(toChar(memory[counter++] % 100));
            length -= 2;
        }
        System.out.println();
    }
    // changes case of char if not space
    public static int toUpper(int c){
        return (c == 32) ? c : c - 32;
    }
    // returns char from int
    public static char toChar(int c){
        return (char)c;
    }
    public static String getOperationCode(int x){
        while(x > 99)
            x /= 10;

        return toHex(x);
    }
    // get the operand (mem loc) from input
    // returns x % 1000
    public static int getOperand(int x){
        while(x > 100)
            x %= 100;

        return x;
    }
    // converts operation code from int to hex
    public static String toHex(int x){
        ArrayList<Character> hexadecimal = new ArrayList<Character>();

        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};
        String strHex = "0x";

        while(x > 0){
            hexadecimal.add(hexDigits[x % 16]);
            x /= 16;
        }

        // reverse the result and construct string
        for(int i=hexadecimal.size() -1; i>=0; i--){
            strHex += hexadecimal.get(i);
        }

        return strHex;
    }
}
