import java.util.*;

public class SumDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int num = input.nextInt();

        int lastDigit = num % 10;
        num /= 10;
        int middleMiddle = num % 10;
        int firstDigit = num / 10;

        int sum = firstDigit + middleMiddle + lastDigit;

        System.out.print("The sum of the digits is " + sum);
    }
}