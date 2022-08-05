package Java101.Loops;
import java.util.*;
public class ExtremumOfNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many do you want type: ");
        int numberOfNumbers = input.nextInt();
        int tempNMax = 0, tempNMin = 0, num;
        for (int i =1; i <= numberOfNumbers; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            num = input.nextInt();
            if (num < tempNMin){
                tempNMin = num;
            }
            if (num > tempNMax){
                tempNMax = num;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("En büyük sayı: "+ tempNMax);
        System.out.println("En küçük sayı: "+ tempNMin);
    }
}
