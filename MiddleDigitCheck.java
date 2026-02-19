import java.util.Scanner;

public class MiddleDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three digit number:");
        int num = sc.nextInt();
        if (num < 100 || num > 999) {
            System.out.println("Invalid input");
            return;
        }
        int a = (num / 100);
        int b = (num / 10) % 10;
        int c = (num % 10);
        if (b > c && b > a) {
            System.out.println("middle digit is largest");
        } else if (b < c && b < a) {
            System.out.println("middle digit is smallest");
        } else {
            System.out.println("middle digit is neither");
        }
    }
}
