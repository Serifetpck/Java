package P10_Arrays;

public class multiD_ciftsayılarıbulma {
    public static void main(String[] args) {


        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
         //HOCANIN YAPTIĞI
        int arr[][] = {{1,3,6},{2,8},{5,7,9,14}};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("toplam = " + toplam);
        //İKİNCİ YÖNTEM
        toplam =0;
        for(int [] each1 :arr){ //outer for each
            for(int each2 :each1) { //inner for each
                if(each2%2==0){
                    toplam += each2;
                }
            }
        }
        System.out.println("toplam = " + toplam);
     //BENİM YAPTIĞIM
        int sayılar[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        ciftsayılartoplamı(sayılar);
        System.out.println(ciftsayılartoplamı(sayılar));

    }

    private static int ciftsayılartoplamı(int[][] sayılar) {
        int top=0;
        for (int i = 0; i <sayılar.length ; i++) {
            for (int j = 0; j <sayılar[i].length ; j++) {
                if (sayılar[i][j]%2==0) {
                    top += sayılar[i][j];
                }
            }

        }
        return top;
    }
}