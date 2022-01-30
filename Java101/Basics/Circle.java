package Java101.Basics;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, circumference, radius, pi = 3.14;

        System.out.print("Lütfen yarıçap giriniz: ");
        radius = input.nextDouble();

        area = radius * radius * pi;
        circumference = 2 * pi * radius;

        System.out.println("Yarçapı " + radius + " cm olan çemberin çeversi: " + circumference + " cm");
        System.out.println("Yarçapı " + radius + " cm olan dairenin alanı: " + area + " cm^2 ");

    }
}
