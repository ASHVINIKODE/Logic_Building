
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        // Check if a number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
