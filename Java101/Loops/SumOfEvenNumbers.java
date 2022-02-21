package Java101.Loops;

import java.util.*;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int sayi, toplam = 0;

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = inp.nextInt();


            if (sayi % 4 == 0) {
                toplam += sayi;
            }

        } while (!(sayi % 2 == 1));

        System.out.println("Toplam :" + toplam);

    }
}
