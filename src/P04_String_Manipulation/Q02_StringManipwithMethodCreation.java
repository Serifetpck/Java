package P04_String_Manipulation;


import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String str=scan.nextLine().toLowerCase();
        xyzVarmi(str); // boolean döndürme= xyzVarmi(str); bu sekilde de olur
        System.out.println(xyzVarmi(str));
    }

    private static boolean xyzVarmi(String str) {
        if (str.contains("xyz")){
            return  true;

        }else{
            return false;
        }
    }
}