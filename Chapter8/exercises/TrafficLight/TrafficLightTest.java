/*
 *       Filename:  TrafficLightTest.java
 *
 *    Description:  8.10 - Write a program to test the TrafficLight enum so that
 *                  it displays the enum constants and their durations
 *
 *        Created:  28/10/15 19:18:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class TrafficLightTest{
    public static void main(String[] args){
        for(TrafficLight trafficLight : TrafficLight.values())
            System.out.printf("%s - %d\n", trafficLight, trafficLight.getDuration());
    }
}
