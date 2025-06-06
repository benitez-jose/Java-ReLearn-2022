/* Problem 2.7 (find the number of years) Write a program tht prompts the user to enter the
*               minutes (e.g., 1 billion), and displays the maximum number of years and remaining
*               days for the minutes. For simplicity, assume that a year has 365 days.
 */

import java.util.*;

public class FindNumberYears{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final int MININAYEAR = 525600;
        final int MININADAY = 1440;

        System.out.print("Enter the number of minutes: ");

        int numMinutes = input.nextInt();

        int numYrs = numMinutes / MININAYEAR;

        int remainingMinutes = numMinutes % MININAYEAR;

        int numDays = remainingMinutes / MININADAY;

        //int remMinAfter = ;

        //To test so far
        System.out.println("The number of years is: " + numYrs);
        //System.out.println("The number of minutes left is: " + remainingMinutes);
        System.out.println("The number of days is: " + numDays);


    }
}