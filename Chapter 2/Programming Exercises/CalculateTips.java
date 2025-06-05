import java.util.*;

public class CalculateTips{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble() / 100.00;

        double gratuityTotal = subTotal * gratuityRate;
        double finalTotal = subTotal + gratuityTotal;

        System.out.println("The gratuity is $" + gratuityTotal + " and total is $" + finalTotal );
    }
}