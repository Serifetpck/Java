package P03_Switch_Case;

import java.util.Scanner;

public class Q10_NestedTernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        String not= scan.next();
        String sonuc= not=="A" ? "gayet basarılı" : not=="B" ?  "basarılı" : not=="C" ? "Ha gayret " : " Digerleri...";
        System.out.println("sonuc = " + sonuc);
    }
}