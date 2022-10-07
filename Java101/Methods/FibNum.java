package Java101.Methods;

import java.util.Scanner;


public class FibNum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı fibonacci sayısını istiyorsun: ");
        int nth = input.nextInt();

        System.out.println(FibNum(nth));


    }
    public static int FibNum(int n) {


        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        return FibNum(n - 1) + FibNum(n - 2);

    }
}
