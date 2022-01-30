package Java101.Basics;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double weight, height, BMI;

        System.out.print("Lütfen vücut kütlenizi kilogram cinsinden giriniz: ");
        weight = girdi.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz ");
        height = girdi.nextDouble();

        BMI= weight/(height * height);

        System.out.print("Vücüt kitle endeksiniz: " + BMI);
    }
}
