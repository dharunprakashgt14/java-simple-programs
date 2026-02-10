import java.util.Scanner;

public class LoanEligibilityChecker {
    
    static boolean isEligible(int salary, int creditScore) {
        return salary >= 40000 && creditScore >= 700;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter salary for customer " + i + ": ");
            int salary = sc.nextInt();
            System.out.print("Enter credit score: ");
            int creditScore = sc.nextInt();
            
            if (isEligible(salary, creditScore)) {
                System.out.println("Eligible for Loan ✓\n");
            } else {
                System.out.println("Not Eligible for Loan ✗\n");
            }
        }
        
        sc.close();
    }
}