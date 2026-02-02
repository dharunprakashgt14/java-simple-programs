import java.util.Scanner;

public class StudentAttendanceReport {
    
    static double calculateAttendance(int attended, int total) {
        return (attended * 100.0) / total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter classes attended for student " + i + ": ");
            int attended = sc.nextInt();
            System.out.print("Enter total classes: ");
            int total = sc.nextInt();
            
            double percentage = calculateAttendance(attended, total);
            
            if (percentage >= 75) {
                System.out.println("Eligible for Exam ✓\n");
            } else {
                System.out.println("Not Eligible for Exam ✗\n");
            }
        }
        
        sc.close();
    }
}