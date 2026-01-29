import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Income : ");
        double income = sc.nextDouble();
        System.out.println("");
        double tax = 0;
        if (income > 250000 && income <= 500000 ) tax = 5;
        else if (income > 500000 && income <= 600000) tax = 20;
        else tax = 30;
        double total = income + (income * (tax/100));
        System.out.println("Total Income is : "+total);
    }
}