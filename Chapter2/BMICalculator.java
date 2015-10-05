/*
 *       Filename:  BMICalculator.java
 *
 *    Description:  2.32 - BMI calculator
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

        double weight, height;

        System.out.print("Input weight in pounds: ");
        weight = input.nextDouble();

        System.out.print("Input height in inches (ft * 12 + inches): ");
        height= input.nextDouble();

        double bmi = ((weight * 703) / (height * height));

        System.out.printf("Your BMI : %.1f\n", bmi);
        System.out.println("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
