/*
 *       Filename:  TrafficLight.java
 *
 *    Description:  Exercise 8.10 - Traffic Light
 *
 *        Created:  28/10/15 19:17:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public enum TrafficLight{
    RED(90),
    GREEN(70),
    YELLOW(60);

    // instance field
    private final int duration;

    // constructor
    TrafficLight(int duration){
        this.duration = duration;
    }
    // accessor for duration
    public int getDuration(){
        return this.duration;
    }
}
