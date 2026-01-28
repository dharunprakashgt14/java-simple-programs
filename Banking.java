import java.util.Scanner;

public class Banking {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Account type Saving (s) and current (c) ");
        char type =sc.next().charAt(0);
        double bal =sc.nextDouble();
        double interest =1;

        if(type =='s') {
            interest = bal>=10000 ? 5:3;
        }
        else if(type =='c') {
            interest =(bal >=50000 && bal<= 100000)? 2: 3.5;
        }
        double total =bal +(bal *(interest/100));

        System.out.println("Total amount is :" + total);
    }
}