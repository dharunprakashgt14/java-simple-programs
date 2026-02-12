public class CheckCase {
    public static void main(String[] args) {
        char ch = 'A';

        if (ch >= 65 && ch <= 90) {
            System.out.println("Uppercase");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
