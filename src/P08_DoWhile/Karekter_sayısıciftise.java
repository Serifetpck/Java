package P08_DoWhile;

import java.util.Scanner;

public class Karekter_sayısıciftise {
    public static void main(String[] args) {
          /*
        Ask user to enter a word. If the word has odd number of characters
         and has 3 or more characters,
         print the character in the middle of the word.
         the word has even number of character print "You entered wrong word."
             INPUT      :   celik
             OUTPUT     :   l
             INPUT      :   elif
             OUTPUT     :   You entered wrong word.*/
         /*Kullanıcıdan bir kelime girmesini isteyin. Kelimenin tek sayıda karakteri varsa
ve 3 veya daha fazla karaktere sahip,
karakteri kelimenin ortasına yazdırın.
kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."*/
        Scanner scan = new Scanner(System.in);

        String word="";
        do {

            System.out.println("lütfen bir sayı giriniz");
            String kelime= scan.next();
            if (kelime.length()<3) {
            }  System.out.println("lütfen bir sayı giriniz");
            if (word.length()%2==1 && word.length()>=3){
                System.out.println("ortadaki karekter" +word.charAt(word.length()/2));
            }else {
                System.out.println("You entered wrong word.");
            }


        }while(!(word.length()%2==1  && word.length()>=3));
    }
}
