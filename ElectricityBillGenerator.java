import java.util.Scanner;

public class ElectricityBillGenerator {
    
    static double calculateBill(int units) {
        if (units <= 100) {
            return units * 2;
        } else if (units <= 300) {
            return units * 3;
        } else {
            return units * 5;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter units for customer " + i + ": ");
            int units = sc.nextInt();
            double bill = calculateBill(units);
            System.out.println("Bill: ₹" + bill);
        }
        
        sc.close();
    }
}