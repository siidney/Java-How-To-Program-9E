/*
 *       Filename:  BMICalculator.java
 *
 *    Description:  2.33 - Create a BMI calculator that reads the user's weight
 *                  in pounds and height in inches (or, kilograms and metres),
 *                  then calculates and displays the user's body mass index.
 *
 *        Created:  26/09/15 11:31:36
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double weight, height, bmi;
        int choice;

        System.out.print("BMI calculator: 1 for imperial, 2 for metric: ");
        choice = input.nextInt();

        System.out.printf("Input weight in %s: ",
                (choice == 1) ? "pounds" : "kilograms");
        weight = input.nextDouble();

        System.out.printf("Input height in %s: ",
                (choice == 1) ? "inches(ft * 12 * in)" : "metres");
        height = input.nextDouble();

        bmi = (choice == 1) ? calculateImperial(weight, height) : calculateMetric(weight, height);

        System.out.printf("Your BMI : %.1f\n", bmi);
        printBmiTable();
    }

    // calculate using imperial measures
    private static double calculateImperial(double weight, double height){
        return ((weight * 700) / (height * height));
    }
    // calculate using metric measures
    private static double calculateMetric(double weight, double height){
        return weight / (height * height);
    }
    // print BMI information from Department of Health and Human Services /
    // National Institutes of Health.
    private static void printBmiTable(){
        System.out.printf("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
