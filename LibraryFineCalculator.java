import java.util.Scanner;
public class LibraryFineCalculator {
    public static int calculateFine(int lateDays) {
        if (lateDays >= 1 && lateDays <= 5) {
            return lateDays * 2;
        } else if (lateDays >= 6 && lateDays <= 10) {
            return lateDays * 5;
        } else if (lateDays > 10) {
            return lateDays * 10;
        }
        return 0; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter late days for Student " + i + ": ");
            int lateDays = scanner.nextInt();
            
            int fine = calculateFine(lateDays);
            
            System.out.println("Student " + i + " - Late Days: " + lateDays + 
                             ", Fine: ₹" + fine);
            System.out.println();
        }
        
        scanner.close();
    }
}