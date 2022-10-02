package P04_String_Manipulation;

public class Q03_StringManipulasyonu {
    public static void main(String[] args) {


       /*
       name1 ve name2 degiskenlerini olusturun.
       name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
       name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
        */
        String name1 = "mehmet";
        String name2 =  "ahmet";
        int uzunluk=name1.length();
        if(uzunluk%2==0){
            int ortası=uzunluk/2;
            System.out.println(name1.substring(0,ortası).concat(name2).concat(name1.substring(ortası)));
        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }

    }
}