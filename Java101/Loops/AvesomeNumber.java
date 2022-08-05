package Java101.Loops;
import java.util.*;

public class AvesomeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt(), res = 0;

        for (int i = 1; i < num; i++){
            if(num%i==0){
                res += i;
            }
        }
        if(res == num){
            System.out.println(num+" sayısı mükemmel bir sayıdır.");
        } else {
            System.out.println(num+" sayısı mükemmel bir sayı değildir.");
        }
    }
}
