
import java.util.Scanner;

public class sumOfFibonacciTerms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + a;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}
