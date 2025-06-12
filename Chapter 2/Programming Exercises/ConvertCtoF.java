//package Problems;

import java.util.*;

public class ConvertCtoF{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Celsius: ");

        double celsiusNum = input.nextDouble();

        double fahConverted = ((9.0/5.0) * celsiusNum) + 32.0;

        System.out.println(celsiusNum + " Celsius is " + fahConverted + " Fahrenheit");
    }
}