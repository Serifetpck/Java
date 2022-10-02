package P06_ForDongusu;

public class Charfor {
    public static void main(String[] args) {


        //0-255 e kadar olan harflerin , sayı ve harf degerini ekrana yazdırır

        char kelime;
        for (char i =0; i <=255; i++) {
            System.out.println(i+" ="+(i*1));

        }

        int a=0;
        //char a=0;

        do {
            char karekter=(char) a; //char a=0;  charın sayısal degerini bulmak için matematiksel işleme girmesi gerekli
            System.out.println(a+ " " +karekter);
          a++;
        }while (a<=255);

    }
}
