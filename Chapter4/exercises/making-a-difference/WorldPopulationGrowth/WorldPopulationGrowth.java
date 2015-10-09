/*
 *       Filename:  WorldPopulationGrowth.java
 *
 *    Description:  4.39 - Write a program that calculates world population
 *                  growth each year for the next 75 years, using the
 *                  simplifying assumption that the current growth rate will
 *                  stay constant.
 *                  Print the results in a table:
 *                  1st column - display the year from year 1 to year 75.
 *                  2nd column - display the anticipated world population at the
 *                  end of that year.
 *                  3rd column - display the numerical increase in world
 *                  population that would occur that year.
 *
 *
 *        Created:  06/10/15 10:45:27
 *       Revision:  09/10/15 16:58:51
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.1
 *
 * =====================================================================================
 */
public class WorldPopulationGrowth{
    private int sample;
    private long[][] populationProj;
    private long population, basePopulation;
    private double growthRate;

    public WorldPopulationGrowth(long basePopulation, double growthRate, int sample){
        setBasePopulation(basePopulation);
        setGrowthRate(growthRate);
        setSample(sample);
    }
    // SETTERS
    public void setBasePopulation(long basePopulation){
        this.basePopulation = basePopulation;
        population = basePopulation;
    }
    public void setGrowthRate(double growthRate){
        this.growthRate = growthRate;
    }
    public void setSample(int sample){
        this.sample = sample;
        populationProj = new long[sample][sample];
    }
    // GETTERS
    public int getSample(){
        return sample;
    }
    public long[][] getPopulationProjection(){
        return projectPopulation();
    }
    // populate the projection array with projected population data
    private long[][] projectPopulation(){
        for(int i=0; i<sample; i++){
            population *= (1 + growthRate);
            populationProj[0][i] = population;

            populationProj[1][i] = (i == 0) ?
                            population - basePopulation :
                            population - populationProj[0][i-1];
        }
        return populationProj;
    }
}
