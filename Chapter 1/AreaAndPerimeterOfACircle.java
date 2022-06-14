public class AreaAndPerimeterOfACircle{
    public static void main(String[] args){
        double areaCirle, perimeterCirlce;
        double radius = 5.5;
        double pi = 3.14;

        perimeterCirlce = (2 * radius * pi);
        areaCirle = (radius * radius * pi);

        System.out.println("The perimeter of the circle is: " + perimeterCirlce +
            ".");
        
        System.out.println("The area of the circle is: " + areaCirle + ".");
    }
}