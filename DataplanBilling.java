import java.util.Scanner;
public class DataplanBilling {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the plan Type (P) for prepaid and (O) for postpaid : ");
        char type =sc.next().charAt(0);
        System.out.println("");
        System.out.print("Enter the Amount of Data Consumed");
        double dataUsed = sc.nextDouble();
        System.out.println("");
        System.out.print("Enter the Base Bill Amount : ");
        double basebill =sc.nextDouble();
        System.out.println("");
        double charge =0;

        if (type =='p'){
            if (dataUsed >1.5) {
                charge =dataUsed <=3 ? 50 : 100;
            }
            else{
                charge =0;
            }
            
        }
        else if (type == 'o'){
            if (dataUsed > 5){
                charge = dataUsed <=10 ? 150 : 300;
            }
            else {
                charge =0;
            }
        }

        System.out.println("OUTPUT :");
        System.out.println("Plan Type :"+type);
        System.out.println("Data Used :"+dataUsed+"GB");
        System.out.println("Base amount :Rs"+basebill );
        System.out.println("Extra charge : Rs"+charge);
        double total =basebill + charge;
        System.out.println("Final Bill : Rs"+total);
    }
}