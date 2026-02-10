import java.util.Scanner;

public class StudentResultSystem {
    
    static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 5.0;
    }
    
    static char determineGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int[] marks = new int[5];
            
            System.out.println("\nStudent " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            
            double avg = calculateAverage(marks);
            char grade = determineGrade(avg);
            
            System.out.printf("Average: %.2f, Grade: %c\n", avg, grade);
        }
    }
}