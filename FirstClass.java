public class FirstClass {
    public static void main(String[] args) {
        String name = "Giri";
        int roll = 046;
        float mark1 = 78.9f;
        float mark2 = 83.7f;
        float mark3 = 94.2f;

        int total = (int) (mark1 + mark2 + mark3);
        float avg = (float) (total /3);

        System.out.println("Name of the Student : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Marks1 : " + mark1);
        System.out.println("Marks2 : " + mark2);
        System.out.println("Marks3 : " + mark3);
        System.out.println("Total Marks obtained : " + total);
        System.out.println("Average Mark : " + avg);
    }
} 