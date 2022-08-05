package Java101.Loops;
import java.util.*;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fist number of from your two number: ");
        int fst = input.nextInt();

        System.out.print("Enter the second number: ");
        int snd = input.nextInt();
        int i = 1, ebob=0;
        if (fst < snd){
            while(i < snd){
                if (fst%i == 0 && snd%i == 0 ){
                    ebob = i;
                }
                i++;
            }
        } else {
            while(i < fst ){
                if (fst%i == 0 && snd%i == 0 ){
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Ebob : " +ebob+", Ekok : " + ((fst*snd)/ebob) );


    }
}
