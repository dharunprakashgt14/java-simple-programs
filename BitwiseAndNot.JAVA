public class BitwiseAndNot {
    public static void main(String[] args) {
        int a =7,b=5;
        int res=(a|b)&(~a);
        System.out.println(res);
    }
}