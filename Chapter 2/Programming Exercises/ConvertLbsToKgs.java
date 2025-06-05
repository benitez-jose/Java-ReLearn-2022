import java.util.*;

public class ConvertLbsToKgs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");

        double lbs = input.nextDouble();
        double kgs = lbs * 0.454;

        System.out.print( lbs + " pounds is " + kgs + " kilograms.");
    }
}