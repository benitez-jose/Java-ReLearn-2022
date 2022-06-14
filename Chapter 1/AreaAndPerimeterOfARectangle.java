public class AreaAndPerimeterOfARectangle{
    public static void main(String[] args){
        double areaRect, perimeterRect;
        double width = 4.5, height = 7.9;

        areaRect = width * height;
        perimeterRect = (2 * width) + (2 * height);

        System.out.println("The area of the rectangle is: " + areaRect + ".");
        System.out.println("The perimeter of the rectangle is: " + perimeterRect + ".");
        
    }
}