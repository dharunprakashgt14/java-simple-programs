public class CharCheck {
    public static void main(String[] args) {
        char ch = '7';

        if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }
}
