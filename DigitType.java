import java.util.Scanner;

public class DigitType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        num = Math.abs(num);
        if (num < 10) {
            System.out.println("Single Digit");
        } else if (num < 100) {
            System.out.println("Double digit");
        } else {
            System.out.println("Multiple digit");
        }
    }
}
