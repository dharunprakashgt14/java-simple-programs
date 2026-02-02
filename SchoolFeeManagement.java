import java.util.Scanner;

public class SchoolFeeManagement {
    
    static double calculateFinalFee(double baseFee, boolean isScience, double marks) {
        double fee = baseFee;
        
        if (isScience) {
            fee += 5000;
        }
        if (marks >= 85) {
            fee = fee * 0.9; 
        }
        
        return fee;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Student " + i + " ---");
            
            System.out.print("Enter base fee: ");
            double baseFee = sc.nextDouble();
            
            System.out.print("Is science student? (true/false): ");
            boolean isScience = sc.nextBoolean();
            
            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            
            double finalFee = calculateFinalFee(baseFee, isScience, marks);
            
            System.out.println("Final Payable Amount: Rs. " + finalFee);
        }
        
        sc.close();
    }
}