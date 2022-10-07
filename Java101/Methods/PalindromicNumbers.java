package Java101.Methods;

import java.util.Scanner;

public class PalindromicNumbers {
    public static boolean isPalindrome(int number) {
        int reverseNum = 0, tempNum = number, lastDigit;

        while(tempNum != 0){

            lastDigit = tempNum %10 ;
            reverseNum = reverseNum*10 + lastDigit;
            tempNum /=10;
        }
        return reverseNum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        System.out.println("Is this a palindromic number? ==> "+isPalindrome(num));
    }
}