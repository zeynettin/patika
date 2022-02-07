package Java101.Conditionals;

import java.util.Scanner ;
public class PassingClass {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music ;
        double average ;
        Scanner input = new Scanner(System.in);

        System.out.print("Your math score : ");
        math = input.nextInt();

        System.out.print("Your physics score : ");
        physics = input.nextInt();

        System.out.print("Your turkish score : ");
        turkish = input.nextInt();

        System.out.print("Your chemistry score : ");
        chemistry = input.nextInt();

        System.out.print("Your music score : ");
        music = input.nextInt();

        if(math < 0 || math > 100){
            average = (physics + turkish + chemistry + music) / 4.0 ;
        }
        if(physics < 0 || physics > 100){
            average = (math + turkish + chemistry + music) / 4.0 ;
        }
        if (turkish < 0 || turkish > 100){
            average = (math + physics + chemistry + music) / 4.0 ;
        }
        if (chemistry < 0 || chemistry >100){
            average = (math + physics + turkish + music) / 4.0 ;
        }
        if (music < 0 || music > 100){
            average = (math + physics + turkish + chemistry) / 4.0 ;
        }
        else {
            average = (math + physics + turkish + chemistry + music) / 5.0 ;
        }
        System.out.println("Your average is : " + average);

        if (average > 55){
            System.out.println("You passed the class ! ");
        }
        else {
            System.out.println("You failed the class ! ");
        }
    }
}