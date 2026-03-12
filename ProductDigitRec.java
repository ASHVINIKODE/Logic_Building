
import java.util.Scanner;

public class ProductDigitRec {

    static int prodDigit(int n) {

        if (n == 0) {
            return 1;
        }

        return (n % 10) * prodDigit(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(prodDigit(n));
    }
}
