package Java101.Conditionals;

import java.util.*;

public class WeatherCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp;
        System.out.print("Lütfen şuanki sıcaklığı giriniz: ");
        temp = input.nextInt();



        System.out.print(( temp < 5) ? "Kayak yapabilirsiniz" : "");
        System.out.print((4.5 < temp &&  temp < 14) ? "Sinemaya gidebilirsiniz" : "");
        System.out.print((14.5 < temp &&  temp < 24) ? "Pikniğe gidebilirsiniz" : "");
        System.out.print((24.5 < temp) ? "Yüzmeye gidebilirsiniz" : "");

    }
}
