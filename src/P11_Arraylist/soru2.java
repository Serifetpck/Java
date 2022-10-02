package P11_Arraylist;

public class soru2 {
    public static void main(String[] args) {
// her döngü için diziyi yazdır
        // her elemanın uzunluğunu yazdır
        // Bölüm 2:
        // for eachLoop kullanarak dizideki tüm öğeleri yazdırın
        // Bir eleman 'v' ile başlıyorsa döngüden çık

        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (int i = 0; i <list.length ; i++) {
            System.out.println(i+1 +"elemaın uzunlugu =" +list[i].length());
        }
        for (String each:list) {
            System.out.println("dizideki tüm öğeler = "+each);

        }
        boolean vVarmı=false;
        while (!vVarmı)
        for (int i = 0; i < list.length ; i++) {
            if (list[i].substring(0, 1).contains("v")) {
               vVarmı=true;
                System.out.println(list[i].substring(0, 1));
                System.out.println("**");
            }
        }
                                               //HOCANIN ÇÖZDÜĞÜ
        String[] listt = {"fruits", "meat", "milk", "vegetables"};
        for (String element:listt) {
            System.out.print(element + " :" + element.length() + " ");
        }
        System.out.println();
        for (String item:list) {
            if(item.startsWith("v")){
                break;
            }
            System.out.println(item);
        }
    }
}
