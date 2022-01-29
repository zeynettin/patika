package Java101.TemelKavramlar;

import java.util.Scanner;

public class UcgenAlan {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //Variable declaretion
            int kenarBir,kenarIki,kenarUc;
            double u, alan;

            //Taking triangle side values from client
            System.out.print("İlk kanerı giriniz: ");
            kenarBir = input.nextInt();
            System.out.print("İkinci kanerı giriniz: ");
            kenarIki = input.nextInt();
            System.out.print("Üçüncü kanerı giriniz: ");
            kenarUc = input.nextInt();

            //Calculating half of circumference
            u = (kenarBir + kenarIki + kenarUc)/2.0;

            //Calculating area of the triangle by using half circumference
            alan = Math.sqrt(u* (u - kenarBir) * (u - kenarIki) * (u -kenarUc));

            System.out.println("Üçgenin alanı : " + alan);
        }
    }
