/*
 *       Filename:  HealthProfileTest.java
 *
 *    Description:  3.17 - HealthProfileTest
 *
 *        Created:  29/09/15 12:09:42
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
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

        System.out.print("Enter your height in inches (ft * 12 + inches): ");
        double height = sc.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        double weight = sc.nextDouble();

        HealthProfile profile = new HealthProfile(fName, lName, gender, dob, height, weight);
        profile.showHealthProfile();

    }
}
