import java.util.Scanner;

public class ShoppingCart {
    static double calculateDiscount(double bill) {
        if (bill >= 5000) return bill * 0.20;
        if (bill >= 3000) return bill * 0.10;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bill amount: ");
            double bill = sc.nextDouble();

            double discount = calculateDiscount(bill);
            double payable = bill - discount;

            if (bill >= 5000) {
                System.out.printf("Bill: $%.2f | Discount (20%%): $%.2f | Payable: $%.2f%n", bill, discount, payable);
            } else if (bill >= 3000) {
                System.out.printf("Bill: $%.2f | Discount (10%%): $%.2f | Payable: $%.2f%n", bill, discount, payable);
            } else {
                System.out.printf("Bill: $%.2f | No Discount | Payable: $%.2f%n", bill, payable);
            }
        }

        sc.close();
    }
}