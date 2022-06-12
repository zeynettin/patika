package Java101.Loops;

import java.util.*;

public class HarmonicRateCal {
    public static void main(String[] args) {

        System.out.print("Enter the order you want to calcualate of its harmonic rate: ");
        Scanner input = new Scanner(System.in);

        //Initializatons
        float n = input.nextInt();
        float result = 0;

        for (float i = 1; i <= n; i++){

            result = (1/i) + result;
            System.out.print("The result is: " + result + "\n");
        }
    }
}
