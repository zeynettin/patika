package Java101.Loops;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mean = 0, k, x = -1;

        System.out.print("Lütfen bir sayı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {

                mean = mean + i;
                x++;
            }
            if (x == 0);
            continue;
        }
        mean = mean / x;
        System.out.println("Ortalama = " + mean);
    }
}
