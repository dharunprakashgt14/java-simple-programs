import java.util.*;

public class bankapp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        double balance = 0.0;
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Re-enter PIN: ");
        int confirmPin = sc.nextInt();
        
        if(pin != confirmPin) {
            System.out.println("PIN not match");
            return;
        }
        
        System.out.println("PIN verified. Welcome!");
        while(true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            if(choice == 4) {
                System.out.println("Exit");
                break;
            }
            
            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposited: " + depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if(withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn: " + withdrawAmount);
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }

    }
    
}