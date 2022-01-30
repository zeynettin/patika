package Java101.Basics;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5.00;
        double total, armutTotal, elmaTotal, domatesTotal, muzTotal, patlicanTotal;
        double armutMiktar, elmaMiktar, domatesMitar, muzMiktar, patlicanMiktar;

        System.out.print("Alacağınız armut miktarını giriniz(kg): ");
        armutMiktar = input.nextDouble();

        System.out.print("Alacağınız elma miktarını giriniz(kg): ");
        elmaMiktar = input.nextDouble();

        System.out.print("Alacağınız domates miktarını giriniz(kg): ");
        domatesMitar = input.nextDouble();

        System.out.print("Alacağınız muz miktarını giriniz(kg): ");
        muzMiktar = input.nextDouble();

        System.out.print("Alacağınız patlıcan miktarını giriniz(kg): ");
        patlicanMiktar = input.nextDouble();


        armutTotal = armutKg * armutMiktar;
        elmaTotal = elmaKg * elmaMiktar;
        domatesTotal = domatesKg * domatesMitar;
        muzTotal = muzKg * muzMiktar;
        patlicanTotal = patlicanKg * patlicanMiktar;

        total = armutTotal + elmaTotal + domatesTotal + muzTotal + patlicanTotal;

        System.out.println("Armut tutarı: " + armutTotal);
        System.out.println("Elma tutarı: " + elmaTotal);
        System.out.println("Domates tutarı: " + domatesTotal);
        System.out.println("Muz tutarı: " + muzTotal);
        System.out.println("Patlıcan tutarı: " + patlicanTotal);
        System.out.println("Toplam tutar: "+ total);

    }
}
