package P10_Arrays;

public class mindeger_bulma {
    public static void main(String[] args) {


        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        // HOCANIN YAPTIĞI
            int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, -1}};
            int min = arr[0][0];
            for (int i = 0; i < arr.length; i++) { //outer for
                System.out.println("arr [" + i + "]. length i : " + arr[i].length);
                for (int j = 0; j < arr[i].length; j++) { //inner for
                    if(arr[i][j]<min){
                        min = arr[i][j];
                    }
                }
            }
            System.out.println("min = " + min);
       //BENİM YAPTIĞIM

            int sayılar[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5,0}, {2, 1, 6}};
        int enkucuksayı=sayılar[0][0];

        for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j < sayılar[i].length; j++) {
                if (sayılar[i][j] > enkucuksayı) {


                } else if (sayılar[i][j] < enkucuksayı) {
                    enkucuksayı = sayılar[i][j];
                }
            }
        }
        System.out.println(enkucuksayı);
    }
}