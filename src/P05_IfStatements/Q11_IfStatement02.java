package P05_IfStatements;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */
        int not=90;
        boolean A=(not>=90 && not<=100);
        boolean B=(not<90 && not>=80);
        boolean C=(not<80 && not>=70);
        boolean D=(not<70 && not>=60);
        boolean F=(not<59 && not>=0);

        System.out.println(not);


    }
}