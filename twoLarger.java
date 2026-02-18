import java.util.Scanner;

public class twoLarger {
    // Take two numbers and print the larger one
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a + " is larger ");
        } else if (a < b) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("Both are equal");
        }
    }
}
