/*
 *       Filename:  MachineLanguageProgramming.java
 *
 *    Description:  7.35-7 - Simpletron Machine Language
 *
 *                  TODO : String input doesn't handle numbers
 *                  Validate user input instructions
 *
 *        Created:  20/10/15 18:53:10
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MachineLanguageProgramming{
    // IO operations
    final String READ        = "0xA";  // 10. read a word into specified operand
    final String READSTRING  = "0xB";  // 11. reads string as ASCII chars into specified operand
    final String WRITE       = "0xC";  // 12. write a word from specified operand
    final String WRITESTRING = "0xD";  // 13. write a string starting at specified operand
    final String NEWLINE     = "0xE";  // 14. prints a newline character
    // Load/Store operations
    final String LOAD        = "0x14"; // 20. load a word from operand into accumulator
    final String STORE       = "0x15"; // 21. store a word from accumulator into operand
    // arithmetic operations
    // all results left in accumulator
    final String ADD         = "0x1E"; // 30. add a word from operand to word in accumulator
    final String SUBTRACT    = "0x1F"; // 31. subtract word from operand to word in accumulator
    final String DIVIDE      = "0x20"; // 32. divide word from operand to word in accumulator
    final String MULTIPLY    = "0x21"; // 33. multiply word from operand to word in accumulator
    final String MODULUS     = "0x22"; // 34. get modulus from operand to word in accumulator
    final String EXPONENT    = "0x23"; // 35. accumulator ^ operand
    // Transfer-of-control operations
    final String BRANCH      = "0x28"; // 40. branch to specified operand
    final String BRANCHNEG   = "0x29"; // 41. branch to specified operand if accumulator is negative
    final String BRANCHZERO  = "0x2A"; // 42. branch to specified operand if accumulator is zero
    final String HALT        = "0x2B"; // 43. EXIT.
    final String FATALERROR  = "0x2c"; // 44. FATAL ERROR - So dump only run on failure


    private final int MAX_INSTRUCTIONS      = 99;   // instruction code limit
    private final int OPERATION_MULTIPLIER  = 10;   // divisor for operation code
    private final int OPERAND_DIVISOR       = 100;  // modulus for operand

    private int[] memory = new int[1000];   // loc 999 used as temporary arithmetic storage
    private int accumulator = 0;            // accumulator register
    private int instructionCounter = 0;     // location in memory of current instruction
    private String operationCode = "0x0";   // current operation
    private int operand = 0;                // mem loc on which current instruction operates
    private int instructionRegister = 0;    // next instruction to be performed

    private Scanner scInt = new Scanner(System.in);
    private Scanner scStr = new Scanner(System.in);

    // constructor
    public MachineLanguageProgramming(){
        reset();
    }
    // run sml
    public void run(){

        printGreeting();

        int counter = 0;

        while(true){

            System.out.printf("%03d ? ", counter);

            int input = scInt.nextInt();

            if(input == -99999)
                break;

            if(getOperand(input) > memory.length)
                continue;

            memory[counter++] = input;
        }
        System.out.println("\n*** Program loading complete ***");
        System.out.println("*** Program execution begins ***\n");

        // .equals() is necessary to compare string values rather than objects
        while(!operationCode.equals(HALT) && !operationCode.equals(FATALERROR)){
            // fetch instruction from memory (and increment counter)
            instructionRegister = memory[instructionCounter++];
            // get operation
            operationCode = getOperationCode(instructionRegister);
            // get memory location for current operation
            operand = getOperand(instructionRegister);

            // execute the next operation
            execute();
        }
    }
    // print greeting
    private void printGreeting(){
        System.out.println("*** Welcome to Simpletron! ***");
        System.out.println("*** Please enter your program one instruction ***");
        System.out.println("*** (or data word) at a time. I will display ***");
        System.out.println("*** the location number and a question mark (?) ***");
        System.out.println("*** You then type the word for that location. ***");
        System.out.println("*** Type -99999 to stop entering your program. ***\n");
    }
    // execute instruction
    private void execute(){
        switch(operationCode){
            case READ:
                memory[operand] = getInput("Enter an integer: ");
                break;
            case READSTRING:
                System.out.print("Enter a string: ");
                stringToASCII(scStr.nextLine());
                break;
            case WRITE:
                System.out.printf("%03d ? %d\n", operand, memory[operand]);
                break;
            case WRITESTRING:
                ASCIIToString();
                break;
            case NEWLINE:
                System.out.printf("\n");
                break;
            case LOAD:
                accumulator = memory[operand];
                break;
            case STORE:
                memory[operand] = accumulator;
                break;
            case ADD:
                if(isValid(accumulator + memory[operand]))
                    accumulator += memory[operand];
                else
                    fatalError("Accumulator memory overflow");
                break;
            case SUBTRACT:
                if(isValid(accumulator - memory[operand]))
                    accumulator -= memory[operand];
                else
                    fatalError("Accumulator memory overflow");
                break;
            case DIVIDE:
                if(accumulator == 0 || memory[operand] == 0)
                    fatalError("Attempt to divide by zero");
                else
                    accumulator /= memory[operand];
                break;
            case MULTIPLY:
                memory[999] = accumulator * memory[operand];
                if(isValid(memory[999]))
                    accumulator = memory[999];
                else
                    fatalError("Accumulator memory overflow");
                break;
            case MODULUS:
                memory[999] = accumulator % memory[operand];
                if(isValid(memory[999]))
                    accumulator = memory[999];
                else
                    fatalError("Accumulator memory overflow");
                break;
            case EXPONENT:
                memory[999] = exp(accumulator, memory[operand]);
                if(isValid(memory[999]))
                    accumulator = memory[999];
                else
                    fatalError("Accumulator memory overflow");
                break;
            case BRANCH:
                instructionCounter = operand;
                break;
            case BRANCHNEG:
                if(accumulator < 0)
                    instructionCounter = operand;
                break;
            case BRANCHZERO:
                if(accumulator == 0)
                    instructionCounter = operand;
                break;
            case HALT:
                System.out.println("\n*** Simpletron execution terminated ***\n");
                break;
            case FATALERROR:
                break;
            default:
                fatalError("Invalid execution code");
                break;
        }
    }
    // exponentiation
    private int exp(int n, int x){
        if(x == 1)
            return n;
        else
            return n * exp(n, --x);
    }
    // gets the operation code from input
    // divides by 10 until 2 digits remain
    private String getOperationCode(int x){
        while(x > MAX_INSTRUCTIONS)
            x /= OPERATION_MULTIPLIER;

        return toHex(x);
    }
    // converts operation code from int to hex
    private String toHex(int x){
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
    // get the operand (mem loc) from input
    // returns x % 1000
    private int getOperand(int x){
        while(x > memory.length)
            x %= OPERAND_DIVISOR;

        return x;
    }
    // store string as char separated ASCII
    public void stringToASCII(String s){
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
    public void ASCIIToString(){
        // set length -1 as first char read before loop
        int length = (memory[operand] / 100) - 1;
        // ensure operand is not changed.
        int counter = operand;

        // read first char outside of loop as first int pair is length
        System.out.printf("%03d ? %c", operand, toChar(memory[counter++] % 100));

        // decrease length by two as each of two chars is read from memory
        while(length > 0 ){
            System.out.print(toChar(memory[counter] / 100));
            System.out.print(toChar(memory[counter++] % 100));
            length -= 2;
        }
        System.out.println();
    }
    // changes case of char if not space
    public int toUpper(int c){
        return (c == 32) ? c : c - 32;
    }
    // returns char from int
    public char toChar(int c){
        return (char)c;
    }
    // memory dump
    private void memoryDump(){
        System.out.println("REGISTERS:");
        System.out.printf("accumulator          %c%04d\n",
                (accumulator >= 0) ? '+' : ' ', accumulator);
        System.out.printf("instructionCounter      %02d\n", instructionCounter);
        System.out.printf("instructionRegister  +%04d\n", instructionRegister);
        System.out.printf("operationCode         %s\n", operationCode);
        System.out.printf("operand                 %02d\n", operand);

        System.out.println("\nMEMORY:");
        System.out.printf("%8d%6d%6d%6d%6d%6d%6d%6d%6d%6d\n",
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(int i=0; i<memory.length; i+=10){
            System.out.printf("%3d ", i);
            for(int j=i; j<i+10; j++){
                System.out.printf("%c%04d ", (memory[j] >= 0) ? '+' : ' ', memory[j]);
            }
            System.out.println();
        }
    }
    // prints error string and dumps memory
    private void fatalError(String s){
        System.out.printf("\n*** %s ***\n", s);
        System.out.println("*** Simpleton execution abnormally terminated ***\n");
        memoryDump();
        operationCode = FATALERROR;
    }
    // validates input and accumulator values
    private boolean isValid(int x){
        return (x >= -9999 && x <= 9999);
    }
    // reset memory and special registers
    private void reset(){
        Arrays.fill(memory, 0);
        accumulator = 0;
        instructionCounter = 0;
        operationCode = "0x0";
        operand = 0;
        instructionRegister = 0;
    }
    // gets and returns user input
    private int getInput(String s){
        System.out.print(s);
        while(!scInt.hasNextInt()){
            scInt.next();
            System.out.println("Invalid Input!");
            System.out.print(s);
        }
        return scInt.nextInt();
    }
}
