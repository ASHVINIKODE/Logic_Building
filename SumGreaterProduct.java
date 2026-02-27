
import java.util.Scanner;

public class SumGreaterProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;

        while (num > 0) {
            int d = num % 10;
            sum += d;
            product *= d;
            num /= 10;
        }

        if (sum > product) {
            System.out.println("Sum is greater");
        } else {
            System.out.println("Product is greater or equal");
        }
    }
}
