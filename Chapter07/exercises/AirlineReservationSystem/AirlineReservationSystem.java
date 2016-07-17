/*
 *       Filename:  AirlineReservationSystem.java
 *
 *    Description:  7.19 - Write an application to assign seats on each flight's
 *                  of an airline's only 10 seat capacity plane.
 *                  Your application should display the following alternatives:
 *                      "Please type 1 for First Class"
 *                      "Please type 2 for Economy"
 *                  First class section - seats 1-5.
 *                  Economy section - seats 6-10.
 *                  Your application should then display a boarding pass
 *                  indicating the person's seat number and whether it's in the
 *                  first class or economy section of the plane.
 *
 *                  Use a 1d array of primitive type boolean to represent the
 *                  seating chart of the plane.
 *                  Initialise all the elements of the array to false to
 *                  indicate all seats are empty.
 *                  As each seat is assigned, set the corresponding element of
 *                  the array to true to indicate that the set is no longer
 *                  available.
 *
 *                  Your application should never assign a seat that has already
 *                  been assigned.
 *                  When each section is full, your application should ask the
 *                  person if it's acceptable to place them in the other.
 *                  If yes assign the seat.
 *                  If no display "Next flight leaves in 3 hours."
 *
 *        Created:  19/10/15 16:19:44
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class AirlineReservationSystem{
    boolean[] arrSeats = new boolean[10];
    Scanner sc = new Scanner(System.in);

    // SETTERS
    // assigns first empty seat in relevant section
    public boolean assignSeat(String section){
        if(section == "first"){
            if(getFreeSeats(section) > 0){
                for(int i=0; i<5; i++){
                    if(arrSeats[i] == false){
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }
            }
        }else if(section == "economy"){
            if(getFreeSeats(section) > 0){
                for(int i=5; i<arrSeats.length; i++){
                    if(arrSeats[i] == false){
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }

            }
        }
        // seats in chosen section full
        // check if ok to assign to other section
        System.out.printf("All seats in section \"%s\" are booked.\n", section);
        System.out.printf("Would you like to be moved to section \"%s\" (y/n)? ",
                (section == "first") ? "economy" : "first");

        if(sc.next().charAt(0) == 'y')
            assignSeat((section == "first") ? "economy" : "first");
        else
            System.out.println("\nNext flight leaves in 3 hours.\n");

        return false;
    }
    // GETTERS
    // returns number of free seats in each section
    private int getFreeSeats(String section){
        int total = 0;
        if(section == "first"){
            // first class 1-5 (array 0-4)
            for(int i=0; i<5; i++){
                if(arrSeats[i] == false)
                    total += 1;
            }
        }else if(section == "economy"){
            // economy 6-10 (array 5-9)
            for(int i=5; i<arrSeats.length; i++){
                if(arrSeats[i] == false)
                    total += 1;
            }
        }
        return total;
    }
    // see whether or not all seats are booked
    public boolean seatsAvailable(){
        // if empty seat found return true
        for(boolean seat : arrSeats)
            if(seat == false)
                return true;

        // if none found plane is full
        return false;
    }

    public void printGreeting(){
        System.out.println("\nWelcome to Crap Airlines booking system.\n");
    }
    // print the menu with remaining number of seats for each section
    public void printMenu(){
        System.out.printf("1. Economy class %s\n",
                (getFreeSeats("economy") > 0) ?
                "(" + Integer.toString(getFreeSeats("economy")) + ")" : "(full)");
        System.out.printf("2. First class %s\n",
                (getFreeSeats("first") > 0 ?
                 "(" + Integer.toString(getFreeSeats("first")) + ")" : "(full)"));
        System.out.print("> ");
    }
    // prints the boarding pass
    private void printBoardingPass(int seat){
        System.out.println("\nBoarding pass for Crap Airlines.");
        System.out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",
                (seat < 5) ? "first" : "economy", seat + 1);
    }
}
