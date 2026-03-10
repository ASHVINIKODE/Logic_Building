
import java.util.Scanner;

public class OddEvenDigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int odd = 0;
        int even = 0;

        while (n > 0) {
            int d = n % 10;

            if (d % 2 == 0) {
                even = even + d;
            } else {
                odd = odd + d;
            }

            n = n / 10;
        }

        System.out.println("Even digit sum: " + even);
        System.out.println("Odd digit sum: " + odd);
    }
}
