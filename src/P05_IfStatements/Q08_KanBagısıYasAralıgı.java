package P05_IfStatements;

import java.util.Scanner;

public class Q08_KanBagısıYasAralıgı {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas = scan.nextInt();
        System.out.println("lütfen kilonuzu giriniz");
        int kılo= scan.nextInt();
        if (yas > 0 && yas<18){
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas>=18) {
            if (kılo>0 && kılo<50){
                System.out.println("kan bagısı yapamazsınız");
            } else if (kılo>=50) {
                System.out.println("kan bagısı yapabilirsiniz");
            }else System.out.println("yanlıs deger girdiniz");

        }
    }
}
