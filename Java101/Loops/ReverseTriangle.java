package Java101.Loops;
import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Çizmek istediğiniz basamak sayısını giriniz: ");
        int bas = girdi.nextInt();

        for (int i = 0; i < bas; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<bas*2-i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
