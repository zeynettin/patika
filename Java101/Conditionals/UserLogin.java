package Java101.Conditionals;

import java.util.*;

public class UserLogin {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         String userName, password;
         System.out.print("Lütfen kullanıcı adını giriniz: ");
         userName = input.next();
         System.out.print("Lütfen şifrenizi giriniz: ");
         password = input.next();



         if (userName.equals("patika") && password.equals("java101")){
             System.out.println("Giriş başarıyla yapıldı.");
         }else{
             System.out.println("Kullanıcı adı veya şifreniz yanlış.");
             System.out.print("Şifrenizi sıfırlamak istiyor musunuz?\nEğer istiyorsanız -> 1\nIstemiyorsanız -> 2 giriniz: ");
             String eskiSifre, yeniSifre;


             int select;
             eskiSifre = "java101";
             select = input.nextInt();


             if ( select == 1){
                 System.out.print("lütfen yeni şifrenizi giriniz: ");
                 yeniSifre = input.next();


                 if(eskiSifre.equals(yeniSifre) ){
                     System.out.println("Bu şifre eski şifreyle aynı, lütfen başka bir şifre giriniz.");
                     System.out.print("Lütfen yeni şifrenizi giriniz: ");
                     yeniSifre = input.next();
                     System.out.print("Şifreniz başarıyla değiştirildi.\nTekrar giriş yapmak için sayfayı yenileyiniz");
                     password = yeniSifre;
                 }else{
                     System.out.println("Şifreniz başarıyla değiştirildi.");
                     System.out.println("Tekrar giriş yapmayı deneyiniz.");
                 }


             }else{
                 System.out.println("Tekrar giriş yapmayı deneyiniz.");
             }
         }
    }
}
