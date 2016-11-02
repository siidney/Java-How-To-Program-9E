/*
 *       Filename:  HealthProfileTest.java
 *
 *    Description:  Exercise 3.17 - Computerization of Health Records
 *
 *        Created:  29/09/15 12:09:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class HealthProfileTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fName = sc.nextLine();

        System.out.print("Enter you last name: ");
        String lName = sc.nextLine();

        System.out.print("Enter your gender (male/female): ");
        String gender = sc.nextLine();

        System.out.print("Enter Date of birth dd mm yyyy: ");
        int[] dob = new int[3];

        for(int i=0; i<3; i++){
            dob[i] = sc.nextInt();
        }

        System.out.print("1 for imperial, 2 for metric: ");
        int choice = sc.nextInt();

        System.out.printf("Input weight in %s: ",
                (choice == 1) ? "pounds" : "kilograms");
        double weight = sc.nextDouble();

        System.out.printf("Input height in %s: ",
                (choice == 1) ? "inches(ft * 12 * in)" : "metres");
        double height = sc.nextDouble();

        HealthProfile profile = new HealthProfile(fName, lName, gender, dob, height, weight, choice);
        profile.showHealthProfile();
    }
}
