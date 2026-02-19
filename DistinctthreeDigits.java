import java.util.Scanner;

public class DistinctthreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3-digit number:");
        int num = sc.nextInt();
        int a = (num / 100);
        int b = (num / 10) % 10;
        int c = (num % 10);
        if (a != b && b != c && c != a) {
            System.out.println("all digits are distinct");
        } else {
            System.out.println("digits are not distinct");
        }
    }
}
