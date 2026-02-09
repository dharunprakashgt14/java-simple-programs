public class CountWords {
    public static void main(String[] args) {
        String str = "I love Java";

        String[] words = str.split(" ");
        System.out.println("Word count: " + words.length);
    }
}
