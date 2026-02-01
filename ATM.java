import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = Math.max(0, initialBalance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited: $%.2f%n", amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.printf("Withdrew: $%.2f%n", amount);
    }

    public void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(0.0);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Enter deposit amount: ");
                    try {
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        atm.deposit(amt);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case "2":
                    System.out.print("Enter withdrawal amount: ");
                    try {
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        atm.withdraw(amt);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case "3":
                    atm.checkBalance();
                    break;
                case "4":
                    System.out.println("Exiting. Goodbye.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid selection. Please choose 1-4.");
            }
        }
    }
}