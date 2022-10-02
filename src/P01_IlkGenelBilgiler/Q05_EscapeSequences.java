package P01_IlkGenelBilgiler;

import java.util.Scanner;

public class Q05_EscapeSequences {
    public static void main(String[] args) {
        double num1=23.4;
        double num2=24.0;
        double num3=12;
        double num4=450.3;
        double num5=23000;
        double toplam= num1+num2+num3+num4+num5;
        double ortlama= toplam/5;
        System.out.println("ortlama = " + ortlama);
        System.out.println("ortalama = " + (num1+num2+num3+num4+num5)/5);

        Scanner scan = new Scanner(System.in);
        System.out.print("fahrenat degerini giriniz : ");
        double fh= scan.nextDouble();
        System.out.println("girdiginiz fahrenat degeri : " + (fh-32)*5/9);
        System.out.println( "lütfen 1. sayı giriniz?");
        int sayi = scan.nextInt();
        System.out.println( "lütfen 2. sayiyi giriniz?");
        int sayi1 = scan.nextInt();
        System.out.println("giridiginiz sayının toplamı = " +(sayi+sayi1));

                

    }
}