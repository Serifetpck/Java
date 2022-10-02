package P04_String_Manipulation;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi ve soy isminizi giriniz");
        String firstName=scan.nextLine(), lastName=scan.nextLine(); //multiple declaration
        String fullName=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("fullName = " + fullName);
        
    }
}
