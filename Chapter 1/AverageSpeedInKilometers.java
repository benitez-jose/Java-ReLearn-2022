public class AverageSpeedInKilometers{
    public static void main(String[] args){
        double miles = 24 * 1.6;
        double kmh, hrs, minutes = 100.0;

        hrs = minutes / 60.0;
        //System.out.println("the hours is: " + hrs + ".");

        kmh = miles / hrs;

        System.out.println("The runners kmh is: " + kmh + ".");
    }
}