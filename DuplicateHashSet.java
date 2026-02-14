import java.util.HashSet;

public class DuplicateHashSet {
    public static void main(String[] args) {
        String str = "interview";
        HashSet<Character> set = new HashSet<>();

        System.out.print("Duplicates: ");

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}
