package Java101.Conditionals;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYiliniz, modYil;

        System.out.print("Lütfen doğum yılınızı giriniz: ");
        dogumYiliniz = input.nextInt();


        modYil = dogumYiliniz % 12;
        switch (modYil) {
            case 0:
                System.out.println("Cin zodyağı burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Cin zodyağı burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Cin zodyağı burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Cin zodyağı burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Cin zodyağı burcunuz: Fare");
                break;
            case 5:
                System.out.println("Cin zodyağı burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Cin zodyağı burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Cin zodyağı burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Cin zodyağı burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Cin zodyağı burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Cin zodyağı burcunuz: At");
                break;
            case 11:
                System.out.println("Cin zodyağı burcunuz: Koyun");
                break;
        }
    }
}