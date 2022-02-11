package Java101.Conditionals;

import java.util.*;

public class FlightTicket {
    public static void main(String[] args) {
        int mesafe, yas, yolculuk;
        double normalTutar, yasIndirimi, indirimliTutar, yolculukIndimi, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Lütfen mesafeyi giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Lütfen yolculuk tipini seçiniz.\nTek yön => 1\nGidiş-dönüş => 2 : ");
        yolculuk = input.nextInt();

        if ((yolculuk != 1) && (yolculuk != 2) || (mesafe < 0) || (yas < 0)) {
            System.out.println("Geçersiz veri girdiniz.");
        } else {
            normalTutar = mesafe * 0.1;

            if (yas < 12) {
                yasIndirimi = normalTutar / 2;
                indirimliTutar = normalTutar - yasIndirimi;
            } else if ((yas > 12) && (yas <= 24)) {
                yasIndirimi = normalTutar / 10;
                indirimliTutar = normalTutar - yasIndirimi;
            } else if (yas > 65) {
                yasIndirimi = (3 * normalTutar) / 10;
                indirimliTutar = normalTutar - yasIndirimi;
            } else {
                indirimliTutar = normalTutar;
            }

            toplamTutar = (yolculuk == 2) ? ((4 * indirimliTutar) / 5) : indirimliTutar;
            if (yolculuk == 2) {
                toplamTutar *= 2;
            }
            System.out.println("Toplam tutar = " + toplamTutar + " TL");
        }
    }
}
