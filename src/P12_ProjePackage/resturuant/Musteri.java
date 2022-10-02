package P12_ProjePackage.resturuant;

public class Musteri {
    public static void main(String[] args) {


        //menü oluşturma
        //Sipariş objesi creat edilecek
        Mutfak menu = new Mutfak(); //parametriz constructor oluşturmak lazım cünkü aşağıda paremetreli olusturduğumuz için hataverir create yapmak gerekiyor
        System.out.println("menu.toString() = " + menu.toString()); // tostring bize veriableların hepsini yazdırır
                                                                     //menu.tostring.soutv yazdığımızda direk yazıyor
                                                                     //tostring kullandığımızda parametreli methot gönderdiğmiz değerleri artı paremetrdede yazmadığımız değerleride
                                                                      //yazdırır yani tostringe ne eklediysek onu döndürür
        //sipariler oluşacaklar
        Mutfak siparis=new Mutfak("kuru fasulye","yayla corbası","sütlac","şalgam");
        System.out.println(siparis);

    }
}