package P06_ForDongusu;

import java.util.Scanner;

public class carpımtaplosu {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=1 ; j++) {
                System.out.println(i+"ve"+j+"carpımı ="+i*j);

            }

        }
    }

    public static class UzunKelime {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("bir cumle giriniz");
            String cumle=scan.nextLine();
            System.out.println("enUzunKelime(cumle) = " + enUzunKelime(cumle));
            //ben bugun javayi daha cok sevdim ama cok zorlandim
        }
        public static String enUzunKelime(String cumle) {//enuzun kelimeyi istiyor
        String arr[]=cumle.split(" ");
        int max=0;
        String longestWord="";
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i].length()>max){
                    max=arr[i].length();// ilk calistitiginda kod max = 3 oldu
                    longestWord=arr[i];
                }
            }
    return longestWord;
        }
    }
}
