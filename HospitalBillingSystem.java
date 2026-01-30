import java.util.Scanner;

public class HospitalBillingSystem {
    
    static double calculateBill(int days, double room, double doctor, double medicine) {
        double total = (room * days) + doctor + medicine;
        
        if (days > 7) {
            total = total * 0.9; // 10% discount
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter days admitted for patient " + i + ": ");
            int days = sc.nextInt();
            System.out.print("Enter room charges per day: ");
            double room = sc.nextDouble();
            System.out.print("Enter doctor fees: ");
            double doctor = sc.nextDouble();
            System.out.print("Enter medicine cost: ");
            double medicine = sc.nextDouble();
            
            double bill = calculateBill(days, room, doctor, medicine);
            System.out.println("Total Bill: ₹" + bill + "\n");
        }
        
        sc.close();
    }
}