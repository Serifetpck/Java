package P05_IfStatements;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan =new Scanner(System.in);
        System.out.println(" lütfen Y,N giriniz");
        char harf=scan.next().charAt(0);
        if(harf=='Y' || harf=='y'){
            System.out.println(" yes");
        } else if (harf=='N' || harf=='n') {
            System.out.println("No");
        }else System.out.println(" yanlış giriş yaptınız,lütfen sadece Y/N ikisinden birini calıstırın");

    }
}
