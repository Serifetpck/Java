package P06_ForDongusu;

import java.util.Scanner;

public class kareleribulma {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı=scan.nextInt();
        int toplam=0;
        for (int i =1; i <=sayı ; i++) {
           toplam+=(i*i);

        }
        System.out.println(toplam);
    }
}
