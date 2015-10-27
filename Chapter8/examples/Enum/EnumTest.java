/*
 *       Filename:  EnumTest.java
 *
 *    Description:  8.111 - Testing enum type Book
 *
 *        Created:  26/10/15 16:36:10
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.EnumSet;

public class EnumTest{
    public static void main(String[] args){
        System.out.println("All Books:\n");

        // print all book in enum Book
        for(Book book : Book.values())
            System.out.printf("%-10s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());

        System.out.println("\nDisplay a range of enum constants:\n");

        // print first four books
        for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());
    }
}
