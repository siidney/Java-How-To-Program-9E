/*
 *       Filename:  BinaryOctalHexTable.java
 *
 *    Description:  6.34 - Write an application that displays a table of the
 *                  binary, octal and hexadecimal equivalents of the decimal
 *                  numbers in the range 1 through 256.
 *
 *                  NOTE : Although it is not forbidden to use
 *                  toBinary/Octal/HexString() it was assumed that the task was
 *                  to implement the methods manually.
 *
 *        Created:  14/10/15 20:49:05
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.ArrayList;

public class BinaryOctalHexTable{
    public static void main(String[] args){
        System.out.println("Decimal\t\tBinary\t\tOctal\t\tHexadecimal");

        for(int i=1; i<=256; i++){
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\n",
                    i, decimalToBinary(i), decimalToOctal(i), decimalToHex(i));
        }
    }
    // Binary - Base 2
    public static String decimalToBinary(int decimal){
        ArrayList<Integer> binary = new ArrayList<Integer>();
        String strBinary = "";

        // modulus and divide by 2 to get correct 2's place values
        while(decimal > 0){
            binary.add(decimal % 2);
            decimal /= 2;
        }

        // reverse the result and construct string
        for(int i=binary.size() - 1; i>=0; i--){
            strBinary += binary.get(i);
        }

        return strBinary;
    }
    // Octal - Base 8
    public static String decimalToOctal(int decimal){
        ArrayList<Integer> octal = new ArrayList<Integer>();
        String strOctal = "";

        // modulus and divide by 8 to get correct 8's place value
        while(decimal > 0){
            octal.add(decimal % 8);
            decimal /= 8;
        }

        // reverse the result and construct string
        for(int i=octal.size() - 1; i>=0; i--){
            strOctal += octal.get(i);
        }

        return strOctal;
    }
    // Hexadecimal - Base 16
    public static String decimalToHex(int decimal){
        ArrayList<Character> hexadecimal = new ArrayList<Character>();

        // hexadecimal digits
        // stored as an array so int remainder can be used to index the
        // correct value.
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};
        String strHex = "";

        while(decimal > 0){
            hexadecimal.add(hexDigits[decimal % 16]);
            decimal /= 16;
        }

        // reverse the result and construct a string
        for(int i=hexadecimal.size() -1; i>=0; i--){
            strHex += hexadecimal.get(i);
        }

        return strHex;
    }
}
