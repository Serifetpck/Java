package P04_String_Manipulation;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen cümle olusturmak icin kelime giriniz");
        String isim1=scan.nextLine().toLowerCase();
        System.out.println("lütfen cümle olusturmak icin kelime giriniz");
        String isim2=scan.nextLine().toLowerCase();
        System.out.println("lütfen cümle olusturmak icin kelime giriniz");
        String isim3=scan.nextLine().toLowerCase();
        System.out.println("lütfen cümle olusturmak icin kelime giriniz");
        String isim4=scan.nextLine().toLowerCase();
        System.out.println(isim1.substring(0,1).toUpperCase()+isim1.substring(1)+" "+isim2+" "+isim3+" "+isim4+".");

    }
}
