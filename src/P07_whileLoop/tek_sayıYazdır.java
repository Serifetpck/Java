package P07_whileLoop;

import java.util.Scanner;

public class tek_sayıYazdır {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.girilen sayi dahil
        // (tek ise)
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı= scan.nextInt();
        int count=0;
        while (sayı>0){
            if (sayı%2!=0){
                System.out.println(sayı);
                count++;
            }
            sayı--;
        }
        System.out.println(count);
    }
}
