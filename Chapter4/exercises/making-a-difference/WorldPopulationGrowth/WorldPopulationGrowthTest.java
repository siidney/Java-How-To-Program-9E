/*
 *       Filename:  WorldPopulationGrowthTest.java
 *
 *    Description:  4.39 - World population growth test
 *
 *        Created:  06/10/15 11:13:00
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class WorldPopulationGrowthTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = sc.nextLong();

        System.out.print("Enter current world population growth rate: ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter a sample size (no of projection years): ");
        int sample = sc.nextInt();

        WorldPopulationGrowth wpg = new WorldPopulationGrowth(population, growthRate, sample);

        printProjection(wpg);
    }
    public static void printProjection(WorldPopulationGrowth wpg){
        long[][] projection = wpg.getPopulationProjection();

        System.out.println("\n***********************************\n");
        System.out.printf("Population projection for %d years\n\n", wpg.getSample());
        System.out.println("***********************************\n");

        System.out.println("Year\t\tPopulation\t\t\tDifference");
        for(int i=0; i<projection.length; i++){
            System.out.printf("%d\t\t%d\t\t\t%d\n", i+1, projection[0][i], projection[1][i]);
        }
    }
}
