package Java101.Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n, int k){

        if (n <=2){
            if (n == 2){
                System.out.println("Sayınız ASALDIR!");
                return true;
            } else {
                System.out.println("Sayınız asal DEĞİLDİR!");
            return false;
            }
        }
        if (n%k == 0) {
            System.out.println("Sayınız asal DEĞİLDİR!");
            return false;
        }
        if ( k*k > n){
            System.out.println("Sayınız ASALDIR!");
            return true;
        }
        return isPrime(n,k+1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sorgulatacağınız pozitif sayıyı giriniz: ");
        int inp = input.nextInt();

        isPrime(inp,2);
    }
}
