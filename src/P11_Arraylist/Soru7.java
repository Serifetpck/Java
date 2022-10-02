package P11_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Soru7 {
    public static void main(String[] args) {
        /*getSum isminde bir method oluşturun.
    Parametresi ArrayList'tir.
    Dizideki tüm $ ları kaldır ve tüm sayıları topla
    return yaptğımız veri tipi 'int' olmalıdır.
    sonuç 0'dan küçükse, -1 yazdırın.

    Örnek1:
    ArrayList = $13, $15, $20
    Cevap = 48 olmalı

    Örnek 2 :
    ArrayList= $-13, $0, $0
    Cevap = -1 olmalı.
*/
        List<String> ArrayList= new ArrayList<>();
        ArrayList.add("$13");
        ArrayList.add("$15");
        ArrayList.add("$20");
        getSum(ArrayList);
        System.out.println(getSum(ArrayList));

    }

    private static int getSum(List<String> arrayList) {
        int toplam=0;
        String sayılar="";
        for (String each:arrayList) {
            if (each.contains("$")){
                toplam+=Integer.parseInt(each.replace("$",""));

            }

        }
        ;
        return toplam;
    }
}
