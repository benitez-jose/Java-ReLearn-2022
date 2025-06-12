/* Excercise 2.9: Average acceleration is defined as the change of velocity divided by
*                 the time taken to make the change, as given by the following formula:
*
*                 a = [(v1 - v0) / t]
*
*                 Write a program that prompts the user to enter the starting velocity v0 in m/s
*                 the ending velocity v1 in m/s, and the time span t in seconds, then displays the
*                 average acceleration.
 */


import java.util.*;

public class PhysicsAcceleration{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double avgAcceleration = (v1 - v0) / t;

        System.out.println("The average acceleration is " + avgAcceleration);

    }
}