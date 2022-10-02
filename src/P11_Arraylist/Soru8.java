package P11_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru8 {
    public static void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */
        int[] sayilar = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        Arrays.sort(sayilar);
        List<Integer> tekrarsızlar=new ArrayList<>();
        tekrarsızlar.add(sayilar[0]);

        for (int i = 0; i < sayilar.length ; i++) {
           if (!tekrarsızlar.contains(sayilar[i])){
               tekrarsızlar.add(sayilar[i]);
           }
        }
        System.out.println(tekrarsızlar);
        }
    }

