package Problems;

import java.util.Scanner;

public class SolveQuadraticEquations {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c:  ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double answer = Math.pow(b, 2) - (4*(a)*(c));
        double squareAnswer = Math.pow(answer, 0.5);

        if (squareAnswer > 0){
            System.out.println("The equation has 2 real roots.");
        } else if (squareAnswer == 0) {
            System.out.print("The equation has 1 real root.");
        } else{ //if (squareAnswer < 0) {
            System.out.println("The equation has no real roots.");
        }

        //System.out.println(a + " + " + b + " + " + c + " = " + answer);
    }
}