package P05_IfStatements;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kılo= scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy= scan.nextDouble()/100; // boyu metre olarak cevirir

        double bmı=kılo/(boy*boy);
        if(bmı<=20){
            System.out.println("oldukca zayıfsınız");
        } else if (bmı>=20 && bmı<=25) {
            System.out.println("Normal sinirlardasiniz");

        } else if (bmı>25 && bmı<=30) {
            System.out.println("Sisman kategorisindesiniz");

        }else {
            System.out.println("Obez grubundasiniz");
        }
    }
}
