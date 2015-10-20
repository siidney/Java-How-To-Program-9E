/*
 *       Filename:  DuplicateElimination.java
 *
 *    Description:  7.12 - Write an application that inputs five numbers, each
 *                  between 10 and 100, inclusive.
 *                  As each number is read, display it only if it's not a
 *                  duplicate of a number already read.
 *                  Provide for the "worse case", in which all five numbers are
 *                  different.
 *                  Use the smallest possible one-dimensional array to solve
 *                  this problem.
 *                  Display the complete set of unique values input after the
 *                  user enters each new value.
 *
 *        Created:  19/10/15 14:35:49
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination{
    private static int[] arrValues = new int[5];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int remaining = 0;

        while(remaining != 5){
            System.out.printf("Enter value %d/5 between 10 and 100: ", remaining + 1);
            int num = sc.nextInt();

            // ensure input is within range
            if(num < 10 || num > 100)
                continue;

            // print unique values
            if(isUnique(num))
                System.out.printf("Unique value: %d\n", num);

            try{
                // add to array and increase counter
                arrValues[remaining++] = num;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            // display complete set of unique values
            printUnique();
        }
    }
    // ensure value is unique
    // Arrays.binarySearch() for some reason does not work so needed this
    public static boolean isUnique(int num){
        for(int i=0; i<arrValues.length; i++){
            if(arrValues[i] == num)
                return false;
        }
        return true;
    }
    // display complete set of unique values
    public static void printUnique(){
        System.out.println("\nUnique values:\n");

        // base case is always first element
        System.out.print(arrValues[0] + " ");

        // unique value storage
        int unique = 0;

        // loop through remainder
        for(int i=1; i<arrValues.length; i++){
            // only check if value > 0
            // avoids redundant checking before array is filled
            if(arrValues[i] > 0){
                // loop backwards checking for duplicates
                for(int j=i-1; j>=0; j--){
                    if(arrValues[i] == arrValues[j]){
                        unique = 0;
                        break;
                    }else{
                        unique = arrValues[i];
                    }
                }
                if(unique > 0)
                    System.out.print(unique + " ");
            }else{
                continue;
            }
        }
        System.out.println();
    }
}
