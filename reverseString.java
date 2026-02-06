import java.util.Scanner;

public class reverseString {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s ="Welcom to to to";
        String res ="";
        for (int i = s.length()-1;i>=0; i--){
            res = res + s.charAt(i);
        }
        System.out.println(res);
    }
}