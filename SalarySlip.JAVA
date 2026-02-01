import java.util.Scanner;
public class SalarySlip {
    static double calculateGross(double basic) {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        return basic + hra + da;
    }
    static double calculateTax(double gross) {
        return gross > 50000 ? gross * 0.10 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter basic pay: ");
            double basic = sc.nextDouble();
            double gross = calculateGross(basic);
            double pf = basic * 0.12;
            double tax = calculateTax(gross);
            double net = gross - pf - tax;

            System.out.printf("Gross: $%.2f | PF: $%.2f | Tax: $%.2f | Net: $%.2f%n", gross, pf, tax, net);
        }

        sc.close();
    }}