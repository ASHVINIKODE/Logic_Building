import java.util.Scanner;

public class FirstLastEqual {
    public static void main(String[] args) {
        // four digit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit number:");
        int num = sc.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println("Invalid input");
            return;
        }
        int a = (num / 1000);
        int b = (num % 10);
        if (a == b) {
            System.out.println("first and last digit are equal");
        } else {
            System.out.println("First and last digit are not equal");
        }
    }
}
