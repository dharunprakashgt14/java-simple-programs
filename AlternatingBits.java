import java.util.Scanner;

public class AlternatingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prevBit = -1;

        while (n > 0) {
            int currentBit = n % 2;

            if (currentBit == prevBit) {
                System.out.println("No");
                return;
            }

            prevBit = currentBit;
            n = n / 2;
        }

        System.out.println("Yes");
    }
}
