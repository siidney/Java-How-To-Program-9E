/*
 *       Filename:  AirlineReservationSystem.java
 *
 *    Description:  Exercise 7.19 - Airline Reservation System
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
