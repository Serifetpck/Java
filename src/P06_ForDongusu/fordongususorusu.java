package P06_ForDongusu;

public class fordongususorusu {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
 ardından döngüleri kullanarak
 karakterin isimde kaç kez tekrarlandığını kontrol edin.
         */

       String karekter="a";
       String isim="kanarya";
       int kackere=0;


            if(isim.contains(karekter)) {

             for (int i =0 ; i <=isim.length()-1 ; i++) {

                    if(isim.substring(i,i+1).contains(karekter)){
                        kackere+=1;}
                    }
                }else {
            System.out.println("karekter cumlede kullanılmamış");

            }
              System.out.println(kackere+" kere "+karekter+" cumlede kullanılmıştır");
    }
}
