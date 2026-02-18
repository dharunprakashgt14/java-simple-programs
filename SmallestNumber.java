public class SmallestNumber {
    public static void main(String[] args) {
        int a = 4, b = 2, c = 8;

        if (a <= b && a <= c)
            System.out.println("Smallest is: " + a);
        else if (b <= a && b <= c)
            System.out.println("Smallest is: " + b);
        else
            System.out.println("Smallest is: " + c);
    }
}
