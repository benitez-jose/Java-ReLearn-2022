import java.util.*;

public class ConvertFtToMeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");

        double feetMeasurement = input.nextDouble();

        double meterConversion = feetMeasurement * 0.305;

        System.out.println(feetMeasurement + " feet is " + meterConversion + " meters.");
    }
}