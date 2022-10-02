package P12_ProjePackage.resturuant;

public class Mutfak {
    //yemek veriable
    //arasıcaklar veriable
    //tatlı veriable
    //icecekkler veriable
    public String yemekler= "kuru fasulye,köfte ";
    public String arasıcaklar ="yayla corba,mercimek corbası";
    public String tatlı="sütlac, güllac";
    public String icecekkler="şalgam, ayran , kola";


    public Mutfak(String kuru_fasulye, String yayla_corbası, String sütlac,String şalgam) {
        //thissiz nasıl çalışır ama isim açsından anlaşılmaz olur   //thisli böyle calısır
        yemekler=kuru_fasulye;                                      //this.yemekler=yemekler
        arasıcaklar=yayla_corbası;                                  //this.arasıcaklar=arasıcaklar
        tatlı=sütlac;                                               //this.tatlı=tatlı
        icecekkler=şalgam;                                         //this.icecekler=icecekler
    }

    public Mutfak() {

        //this((String kuru_fasulye, String yayla_corbası, String sütlac,String şalgam))
        //eger bu şekilde içine yazıp kullanılırsa  sadece burasu çalışır

    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "yemekler='" + yemekler + '\'' +
                ", arasıcaklar='" + arasıcaklar + '\'' +
                ", tatlı='" + tatlı + '\'' +
                ", icecekkler='" + icecekkler + '\'' +
                '}';
    }
}
