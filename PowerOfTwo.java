import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No");
            return;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
