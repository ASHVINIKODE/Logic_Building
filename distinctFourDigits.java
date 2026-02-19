import java.util.Scanner;

public class distinctFourDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit number:");
        int num = sc.nextInt();
        int a = (num / 1000);
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = (num % 10);
        if (a != b && b != c && c != d && d != a && a != c) {
            System.out.println("All digits are distinct");
        } else {
            System.out.println("not distinct");
        }
    }
}
