public class ApproximatePI{
    public static void main(String[] args){
        double pi1, pi2, piAvg;

        pi1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);

        pi2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println("The result of pi1 is: " + pi1 + ".");
        System.out.println("The result of pi2 is: " + pi2 + ".");

        piAvg = (pi1 + pi2) / 2.0;
        System.out.println("The approximation of PI is: " + piAvg + ".");


    }
}