package Java101.Loops;

import java.util.*;

public class PowCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Üstünü alacağınız sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.print("Üstü giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++){

            result *= a;
        }

        System.out.println("Sonuç: " + result);
    }
}
