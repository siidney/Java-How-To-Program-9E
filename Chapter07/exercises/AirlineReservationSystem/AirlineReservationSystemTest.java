/*
 *       Filename:  AirlineReservationSystemTest.java
 *
 *    Description:  7.19 - Test application
 *
 *        Created:  19/10/15 16:28:20
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class AirlineReservationSystemTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AirlineReservationSystem ars = new AirlineReservationSystem();
        String section = "economy";

        ars.printGreeting();

        while(ars.seatsAvailable()){
            ars.printMenu();
            int choice = sc.nextInt();

            if(choice == 1 || choice == 2)
                section = (choice == 1) ? "economy" : "first";
            else
                continue;

            ars.assignSeat(section);
        }
        System.out.println("\tPLANE FULL\n");
    }
}
