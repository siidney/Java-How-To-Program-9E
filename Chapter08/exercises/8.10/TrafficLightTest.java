/*
 *       Filename:  TrafficLightTest.java
 *
 *    Description:  Exercise 8.10 - Traffic Light
 *
 *        Created:  28/10/15 19:18:17
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
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
