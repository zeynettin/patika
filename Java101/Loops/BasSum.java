package Java101.Loops;

import java.util.*;

public class BasSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");

        int basValue = 0, number = input.nextInt(), tempNumber, result = 0;

        tempNumber = number; //Equalized to temporary varible

        while(tempNumber != 0){
            basValue = tempNumber % 10;
            tempNumber = tempNumber / 10;
            result += basValue;

        }
        System.out.println("The sum of numbers is: "+ result);
    }
}
