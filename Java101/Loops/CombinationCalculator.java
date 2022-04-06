package Java101.Loops;
import java.util.*;
public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, r, i = 1, k = 1, nom = 1, den = 1;


        System.out.print("Please enter the number n: ");
        n = scan.nextInt();
        System.out.print("Please enter the number r: ");
        r = scan.nextInt();


        while (i <= n ) {
            nom = nom * i;
            i++;
        }
        while (k <= r ) {
            den = den * k;
            k++;
        }

        System.out.println("Your result combination [C(n,r)] is " + (nom/den));
    }
}
