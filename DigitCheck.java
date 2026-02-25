import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        if (a + c == b) {
            System.out.println("Condition satisfied");
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}
