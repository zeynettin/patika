package Java101.Basics;
import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rate = 2.20 , km, total = 10;

        System.out.print("Lütfen kilometreyi giriniz: ");
        km = input.nextDouble();
        total += (rate *km) ;
        total =  (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);

    }
}
