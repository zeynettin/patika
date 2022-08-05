package Java101.Loops;
import java.util.*;

public class FibNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prev= 0, pres = 1, res = 0;
        System.out.print("Enter how many number do you want: ");
        int LN  = input.nextInt();
        System.out.print(prev + " " + pres);
        for(int i= 1; i +1 < LN; i++){
            res = prev + pres;
            prev = pres;
            pres = res;
            System.out.print(" "+ res);
        }

        ;
    }
}
