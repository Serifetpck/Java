package P09_Arrays;

import java.util.Arrays;

public class ifadeyi_ArrayeDonusturme {
    public static void main(String[] args) {
        String str="HeySiri";
        str=str.replace("Hey","Bye");
        String[]arr=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));
    }
}
