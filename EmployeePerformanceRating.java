import java.util.Scanner;
public class EmployeePerformanceRating{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Rating = sc.nextInt();
        String msg = "invalid";
        if(Rating>=8)
        {
            msg="Excelent";
        }
        else if(Rating>=6)
        {
            msg="Good";
        }
        else if(Rating>=4)
        {
            msg="Average";
        }
        else if(Rating<4)
        {
            msg="Poor";
        }
        System.out.println(msg);
    }
}