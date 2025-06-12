import java.util.*;
//import java.lang.*;

public class VolumeOfCylinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");

        double radCylinder = input.nextDouble();
        double lengthCylinder = input.nextDouble();

        double areaCylinder = radCylinder * radCylinder * Math.PI;
        double volCylinder = areaCylinder * lengthCylinder;

        System.out.println("The area is " + areaCylinder);

        System.out.println("The volume is " + volCylinder);
    }
}