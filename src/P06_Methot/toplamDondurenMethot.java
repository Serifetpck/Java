package P06_Methot;

import java.util.Scanner;

public class toplamDondurenMethot {
    public static void main(String[] args) {


        // girilen sayıların basmaklarındaki rakamların toplamı
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı= scan.nextInt();
        basamaktop(sayı);
        System.out.println(basamaktop(sayı));
    }

    private static int basamaktop(int sayı) {
        int toplam=0;
        while (sayı!=0){
            toplam+=sayı%10;
            sayı/=10;

        }
        return toplam;
    }
}