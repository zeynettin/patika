package Java101.Conditionals;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        // initialization a new scanner object
        Scanner secim = new Scanner(System.in);
        // init
        int sayi1 , sayi2, islem, total;
        System.out.print("Toplama için -> 1\nÇıkarma için -> 2\nÇarpma için -> 3\nBölme için -> 4\n");
        System.out.print("Lütfen seçiminizi giriniz:");
        islem = secim.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = secim.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2   = secim.nextInt();
        switch (islem){
            case 1:
                total = sayi1 + sayi2;
                System.out.print("Sonuç: " + total);
                break;
            case 2:
                total = sayi1 - sayi2;
                System.out.print("Sonuç: " + total);
                break;
            case 3:
                total = sayi1 * sayi2;
                System.out.print("Sonuç: " + total);
                break;
            case 4:
                total = sayi1 / sayi2;
                System.out.print("Sonuç: " + total);
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz.");
        }
    }
}
