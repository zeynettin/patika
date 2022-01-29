package Java101;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kdv = 0.18,kdvsiz,kdvli;
        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        double fiyat = input.nextDouble();

        kdvli = fiyat * kdv + fiyat ;
        kdvsiz = kdvli - fiyat ;

        System.out.println("Ürünün KDVli fiyatı : " + kdvli);
        System.out.println("Üründe uygulanan KDV tutarı : " + kdvsiz);
    }
}
