public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";

        System.out.print("Duplicate characters: ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break;
                }
            }
        }
    }
}
