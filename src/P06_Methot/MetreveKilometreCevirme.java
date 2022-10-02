package P06_Methot;

import java.util.Scanner;

public class MetreveKilometreCevirme {
    public static void main(String[] args) {


    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
        cevirici(9);

    }

    private static void cevirici(double cm) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen metre ve km ye dönüştürmek istediğimiz cm giriniz");
         cm= scan.nextDouble();
         double merter=cm/100;
         double kMerter=cm/100000;
        System.out.println("girdiğiniz cm değeri :" +cm+ ":" +merter+ "m dir " +kMerter+ "km tir");
    }
}