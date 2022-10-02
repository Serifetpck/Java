package P01_IlkGenelBilgiler;

import java.util.Scanner;

public class Q02_YolHizZaman {
    public static void main(String[] args) {

/*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("gideceginiz yol mesafesi(km) :");
        double yol = scan.nextDouble();
        System.out.println("ortalama hızınız :");
        double ort_hiz = scan.nextDouble();

        double varıs_suresi = yol / ort_hiz;
        System.out.println("varıs_suresi " + varıs_suresi);
        scan.close();
    }
}