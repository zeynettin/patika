package Java101.Methods;

import java.util.Scanner;

public class Power {

    public static int power (int a, int b){

        //When the function has power of 0 returns 1
        if (b == 0) return 1;

        //The function recall itself and multiply it by base until power is 0
        return a * power(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        //Taking the base number from user
        System.out.print("Üslü sayının tabanını giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üslü sayının üssünü giriniz: ");
        int pow = scan.nextInt();

        System.out.println("Sonuç: " + power(base, pow));
    }
}
