public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        printPyramid(rows);
    }
    
    public static void printPyramid(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}