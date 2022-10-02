package P09_Arrays;

import java.util.Scanner;

public class sekizElemanlı_uceBolunen {
    public static void main(String[] args) {
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        int[] arr=new int[8];
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+ "indexdeki sayıyı giriniz");
            arr[i]=oku.nextInt();
            if (arr[i]%3==0){
                sayac++;

            }

        }
        System.out.println("3'e bolunebilen sayi : " +sayac);
    }
}
