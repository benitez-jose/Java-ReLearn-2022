public class AverageSpeedInMiles{
    public static void main(String[] args){
        double miles, mph, hour;

        miles = 14 * 1.6;
        hour = (45.0 * 60.0 + 30.0) / (60.0 * 60.0);

        mph = miles / hour;

        System.out.println("The runners mph from 14km in 45 minutes is: " + mph + ".");
    }
}