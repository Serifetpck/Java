package P10_Arrays;

import java.util.Arrays;


public class bircumlede_charecterbulma {
    public static void main(String[] args) {


        //HOCANIN YAPTIĞI
            String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
            str = str.replace(" ", "");
            System.out.println("str = " + str);
            System.out.println("str.length() : "+ str.length());
            String harf[] = str.split("");
            System.out.println(harf.length);
            String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
            String kelime[] =str1.split(" ");
            int boslukSayisi = kelime.length-1;
            System.out.println("boslukSayisi = " + boslukSayisi);
            String charcter [] = str1.split("");
            System.out.println("charcter sayisi  = " + (charcter.length-boslukSayisi));

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */


        String cumle="Verilen bir ";

      karektersayısı(cumle);
        System.out.println(karektersayısı(cumle));
    }

    public static int karektersayısı(String cumle) {
        cumle=cumle.replaceAll("\\s","");
        String cumleninarrayı []=cumle.split("");
        int sayac=0;
        for (String each:cumleninarrayı
             ) {
            sayac++;
        }

return sayac;
    }
}
