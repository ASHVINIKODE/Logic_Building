import java.util.Scanner;

public class PositiveSumCheck {
    public static void main(String[] args) {
        // Take two numbers and check if both are positive and their sum is less than
        // 100.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        if ((a > 0 && b > 0 && (a + b < 100))) {
            System.out.println("Positive and sum is less than 100");
        } else {
            System.out.println("Invalid input");
        }
    }
}
