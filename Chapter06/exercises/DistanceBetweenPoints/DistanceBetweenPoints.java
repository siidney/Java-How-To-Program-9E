/*
 *       Filename:  DistanceBetweenPoints.java
 *
 *    Description:  6.32 - Write method 'distance' to calculate the distance
 *                  between two points (x1, y1) (x2, y2).
 *                  All numbers and return values should be of type double.
 *                  Incorporate this method into an application that enables the
 *                  user to enter the coordinates of the points.
 *
 *        Created:  14/10/15 19:27:25
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class DistanceBetweenPoints{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st set of space separated coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter 2nd set of space separated coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.printf("The distance between (%.2f, %.2f) & (%.2f, %.2f) = %.2f\n",
                x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }
    // distance between 2 2d points (Pythagoras theorem):
    // d = sqrt(x2-x1^2 +y2-y1^2)
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
