public class Algebra{
    public static void main(String[] args){
        double a = 3.4, b = 50.2, c = 2.1;
        double d = .55, e = 44.5, f = 5.9;
        double x, y;

        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("The value of x is: " + x + ".");
        System.out.println("The value of y is: " + y + ".");
    }
}