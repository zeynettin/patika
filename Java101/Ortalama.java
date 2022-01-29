package Java101;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        int mat, kim, fiz, tur, muz, tar;
        //Scan sınıfından nesne tanımlıyoruz
        Scanner inp = new Scanner(System.in);
        //değişkenler için değerler alıyoruz
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        tur = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muz = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tar = inp.nextInt();

        //ortalama için bir değişken oluşturulup değişkenler toplanıp değişken sayısına bölünür.
        double ortalama = (mat + kim + fiz + tur + muz + tar) / 6.0;
        System.out.println("Ortalamanız : " + ortalama);
        //sınıfı geçip geçmediğmizi belirlemek için boolean bir veri oluşturup bir koşulla bunu bir sonuca bağlarız.
        boolean sinif;
        sinif = ortalama > 60;

        System.out.print("Sınıfı geçtiniz mi : " + sinif);
    }
}