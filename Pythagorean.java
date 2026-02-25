import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        System.out.println("enter the third number:");
        int c = sc.nextInt();
        if ((a * a == b * b + c * c) || (c * c == b * b + a * a) || (b * b == a * a + c * c)) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Triplet");
        }
    }
}
