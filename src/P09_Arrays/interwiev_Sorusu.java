package P09_Arrays;

import java.util.Scanner;

public class interwiev_Sorusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime= scan.nextLine();
        System.out.println("lütfen bir sayı giriniz");
        int  sayı= scan.nextInt();
        ilkvesonharf(kelime,sayı);
        System.out.println(ilkvesonharf(kelime,sayı));
    }

    private static String ilkvesonharf(String kelime, int sayı) {
        kelime=kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        String yenikelime="";
        for (int i =1 ; i <=sayı ; i++) {
            yenikelime+=kelime;

        }
        return yenikelime;
    }
}
