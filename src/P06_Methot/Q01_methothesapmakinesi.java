package P06_Methot;

public class Q01_methothesapmakinesi {
    public static void main(String[] args) {

        /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */

        String str="abdgerssss";

        tekrareden(str);

    }

    private static void tekrareden(String str) {
        String output=""; // string default "" old için isleme etki etnesin diye bu şekilde atama yaptık
        for (int i = 0; i <str.length() ; i++) {// int i = 0; i <=str.length()-1 ; i++ bu şekidede olur
            if (!output.contains(str.substring(i,i+1))){// tekrarsız karakterleri dödüreceğimiz str den  aldığımız herhangi bir karekteri içermesi
                output+=str.substring(i,i+1);
            }
        }
        System.out.println(output);
    }
}
