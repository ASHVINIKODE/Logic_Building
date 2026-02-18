import java.util.Scanner;

public class checkEvenOddCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both are even number");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both are odd number");
        } else {
            System.out.println("One even and one odd");
        }
    }
}
