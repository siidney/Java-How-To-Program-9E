/*
 *       Filename:  Bicycle.java
 *
 *    Description:  10.13 - Bicycle class implements CarbonFootprint
 *
 *                  NOTE: Am now bored of this hippy stuff with so much
 *                  contradictory information that I'm leaving this as is.
 *
 *        Created:  19/11/15 15:29:07
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Bicycle implements CarbonFootprint{
    private final double CALORIES_PER_MILE = 34.0f;

    private double distance;

    // constructor
    public Bicycle(double distance){
        setDistance(distance);
    }
    // SETTERS
    public void setDistance(double distance){
        if(distance >= 0.0f)
            this.distance = distance;
        else
            throw new IllegalArgumentException(
                    "distance must be >= 0.0f");
    }
    // GETTERS
    public double getDistance(){
        return this.distance;
    }
    // calculate carbon footprint
    @Override
    public double getCarbonFootprint(){
        return distance * CALORIES_PER_MILE;
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s %s %.2f %s : %.2f\n",
                this.getClass().getName(), "carbon footprint for",
                getDistance(), "miles is", getCarbonFootprint());
    }
}
