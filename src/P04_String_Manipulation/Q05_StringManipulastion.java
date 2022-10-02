package P04_String_Manipulation;

import java.util.Scanner;

public class Q05_StringManipulastion {
    public static void main(String[] args) {
        // Kullanıcıdan isim ve soyisimi girmesini isteyin ve hangisinin daha uzun oldugunu yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ismini ve soyismini giriniz :\nisim");
        String isim=scan.next();
        System.out.println("soyisim");
        String soyisim= scan.next();
        if (isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");

        }else if (isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminiz ile esit uzunlukta");
        }else System.out.println("soyisminiz isminizden uzun");

    }
}