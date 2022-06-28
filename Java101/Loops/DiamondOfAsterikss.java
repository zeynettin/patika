package Java101.Loops;

import java.util.*;

public class DiamondOfAsterikss {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = klavye.nextInt();


        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for ( int l = 1; l <= n; l++){
            for (int j = 0; j < l; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k  <= 2*(n-l+1)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
