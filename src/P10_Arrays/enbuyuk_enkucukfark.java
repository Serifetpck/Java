package P10_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class enbuyuk_enkucukfark {
    public static void main(String[] args) {


     /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kaç sayı gireceğinizi yazınız");
        int sayı = scan.nextInt();
        int girilensayılar[]=new int[sayı];

        sayılarınfarkı(girilensayılar);
    }

    public static void sayılarınfarkı(int[] girilensayılar) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < girilensayılar.length; i++) {
            System.out.println(i+". index için lütfen bir sayı giriniz");
            int sayı1=scan.nextInt();
            girilensayılar[i]=sayı1;

        }
        Arrays.sort(girilensayılar);
        int fark= girilensayılar[girilensayılar.length-1]-girilensayılar[0];
        System.out.println(fark);
    }


}