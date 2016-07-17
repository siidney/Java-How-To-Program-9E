/*
 *       Filename:  WorldPopulationGrowthCalc.java
 *
 *    Description:  2.34 - Use the web to determine the current world population
 *                  and the annual world population growth rate. Write an
 *                  application that inputs these values, then displays the
 *                  estimated world population after one, two, three, four, and
 *                  five years.
 *
 *        Created:  05/10/15 16:22:35
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class WorldPopulationGrowthCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long population;
        double growthRate;

        System.out.print("Enter current world population: ");
        population = sc.nextLong();

        System.out.print("Enter annual world population growth rate: ");
        growthRate = sc.nextDouble();

        // print growth rate
        for(int i=1; i<6; i++){
            population *= growthRate;
            System.out.printf("%d years = %d\n", i, population);
        }
    }
}
