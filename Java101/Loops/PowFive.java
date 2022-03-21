package Java101.Loops;

import java.util.*;

public class PowFive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int oputFv = 1, oputFr = 1, pow;

        System.out.print("please type down an integer: ");
        pow = inp.nextInt();

        while (pow > 0) {
            oputFv = oputFv * 5;
            oputFr = oputFr * 4;

            pow--;

        }
        System.out.println("Your number's fourth power is " + oputFr);
        System.out.println("Your number's fifth power is " + oputFv);

    }
}
